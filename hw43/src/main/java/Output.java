import java.io.*;
import java.util.ArrayList;

/**
 * Created by vitaliy on 25.03.16.
 */
public class Output {
    public static final String FILE_PATH = "/home/vitaliy/Programming/epam-homeworks/hw43/src/main/resources/" +
            "Terminus16.txt";
    public void write(ArrayList<String> info){
        try{
            File fileDir=new File(FILE_PATH);

        ArrayList<String> toWrite=info;
        BufferedWriter buff=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir),"UTF-16"));

            //byte[] contentBytes=toWrite.toString().getBytes();
            //buff.app(contentBytes);
            for (String s:toWrite){
                buff.append(s);
            }
            buff.flush();
            buff.close();
            System.out.println("Done");



        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
    }

}}


