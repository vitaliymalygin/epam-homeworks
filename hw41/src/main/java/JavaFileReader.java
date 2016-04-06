import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by vitaliy on 22.03.16.
 */
public class JavaFileReader {
    public static final String FILE_PATH = "hw41/src/main/resources/" +
            "res.java";
    public ArrayList<String> go(){

    ArrayList<String> allStrings=new ArrayList<>();
    StringBuilder stringBuilder=new StringBuilder();
    try(BufferedInputStream buff=new BufferedInputStream(new FileInputStream(FILE_PATH))){
        while (buff.available()>0){
            char c=(char)buff.read();

                stringBuilder.append(c);
            }
            String newString= stringBuilder.toString();
            String[] strings=newString.split(" ");
            for (String string:strings){
                allStrings.add(string);
//                System.out.println(string);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }



    return allStrings;
    }
}
