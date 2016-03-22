import java.io.File;
import java.util.Scanner;

/**
 * Created by vitaliy on 21.03.16.
 */
public class ScanEngine {

    public static final String FILE_PATH = "/home/vitaliy/Programming/epam-homeworks/hw33/src/main/resources/" +
            "Java.SE.03.Information handling_task_attachment.html";
    public void go(){
        try(Scanner in = new Scanner(new File(FILE_PATH))) {

            StringBuffer data = new StringBuffer();
            while (in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);            }

//                data.append(in.nextLine()).append("\n");
//            System.out.println(data.toString());
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
