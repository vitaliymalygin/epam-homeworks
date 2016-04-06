import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * Created by vitaliy on 24.03.16.
 */
public class ResultWriter {
    public static final String FILE_PATH = "/home/vitaliy/Programming/epam-homeworks/hw41/src/main/resources/" +
            "result.txt";
    public void write(HashMap<String, Integer> info){
        HashMap<String,Integer> toWrite=info;


        try(BufferedOutputStream buff=new BufferedOutputStream(new FileOutputStream(FILE_PATH))){

            byte[] contentBytes=toWrite.toString().getBytes();
            buff.write(contentBytes);
            buff.flush();
            System.out.println("Done");


        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
