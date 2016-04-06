import java.io.*;
import java.util.HashMap;

/**
 * Created by vitaliy on 24.03.16.
 */
public class ResultWriter {
    public static final String FILE_PATH = "/home/vitaliy/Programming/epam-homeworks/hw42/src/main/resources/" +
            "result.txt";
    public void write(HashMap<String, Integer> info){
        HashMap<String,Integer> toWrite=info;

        try(BufferedWriter buff=new BufferedWriter(new FileWriter(FILE_PATH))){
            PrintWriter printWriter=new PrintWriter(buff);
            printWriter.print(toWrite.toString());
            System.out.println("Done");


        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
