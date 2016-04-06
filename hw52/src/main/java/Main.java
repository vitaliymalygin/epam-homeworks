/**
 * Created by vitaliy on 03.04.16.
 */
public class Main {
    public static void main(String[] args) {
        String filePath = "hw52/src/main/resources/" +
                "simple_Prop.properties";
        PropReader reader=new PropReader();
        reader.read(filePath);
    }
}
