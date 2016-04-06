import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * Created by vitaliy on 03.04.16.
 */
public class PropReader {
    public void read(String path){
        Properties prop = new Properties();
        try(InputStream input = new FileInputStream(path)) {

            prop.load(input);

            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                if(value == null) {
                    try {
                        throw new InvalidPropertiesFormatException(key + " not found!");
                    } catch (InvalidPropertiesFormatException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Key : " + key + ", Value : " + value);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File path is incorrect!");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
