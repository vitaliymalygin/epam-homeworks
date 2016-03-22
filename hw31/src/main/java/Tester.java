import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vitaliy on 19.03.16.
 */
public class Tester {
    String currentDate;

    public static void main(String[] args) {
        Tester tester=new Tester();
        Calendar calendar =Calendar.getInstance() ;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy:HH-mm");
        tester.currentDate=simpleDateFormat.format(calendar.getTime());
        tester.go();
    }
    public void go() {
        CrazyLogger crazyLogger = new CrazyLogger();
        ConsoleScanner consoleScanner = new ConsoleScanner();
        String token = consoleScanner.scanConsole();
        Pattern p = consoleScanner.getPattern(token);
        crazyLogger.info(currentDate, "msg1");
        crazyLogger.info(currentDate, "msg2");
        crazyLogger.info(currentDate, "msg3");
        crazyLogger.info(currentDate, "msg4");
        String[] lines= CrazyLogger.archive.toString().split("\\n");
        for (int i=0;i<lines.length;i++){
            Matcher m = p.matcher(lines[i]);
            if(m.find()){
                System.out.println("Found " + lines[i]);
            }
        }


    }



}
