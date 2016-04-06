import java.io.*;

/**
 * Created by vitaliy on 24.03.16.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Input {
    public static final String FILE_PATH = "/home/vitaliy/Programming/epam-homeworks/hw43/src/main/resources/" +
            "Terminus8.txt";
        ArrayList<String> inputStrings;
        public ArrayList<String> readInput(){
            inputStrings=new ArrayList<String>();
            try {
                File fileDir = new File(FILE_PATH);

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(fileDir), "UTF8"));

                String str;

                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                    inputStrings.add(str);

                }

                in.close();
            }
            catch (UnsupportedEncodingException e)
            {
                System.out.println(e.getMessage());
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            return inputStrings;
        }
    }

