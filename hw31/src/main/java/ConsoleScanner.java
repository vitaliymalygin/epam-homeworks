import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by vitaliy on 20.03.16.
 */
public class ConsoleScanner {

    public String scanConsole(){
        String token;
        System.out.println("Please input token");
        try(Scanner scanner=new Scanner(System.in)){
             token=scanner.next();
            System.out.println("Your query is "+token);

        }
        return token;
    }
    public Pattern getPattern(String token){
        return Pattern.compile(token);
    }


}
