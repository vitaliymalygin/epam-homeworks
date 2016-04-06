import java.io.*;
import java.util.ArrayList;

/**
 * Created by vitaliy on 24.03.16.
 */
public class JavaFileReader {
    public static final String FILE_PATH = "hw42/src/main/resources/" +
            "res.java";
    public ArrayList<String> go(){

        ArrayList<String> allStrings=new ArrayList<>();
        StringBuilder storage=new StringBuilder();

        try(BufferedReader buff=new BufferedReader(new FileReader(FILE_PATH))) {
            String s;
            while ((s=buff.readLine())!=null){
                storage.append(s);
            }
            String newString= storage.toString();
            String[] strings=newString.split(" ");
            for (String string:strings){
                allStrings.add(string);

            }

        }
        catch (IOException e){
            e.printStackTrace();
        }



        return allStrings;
    }
}
