import java.util.Scanner;

/**
 * Created by vitaliy on 02.04.16.
 */
public class ScanInput {
    public String scanConsole(Scanner scanner){
        String token;
        System.out.println("Please input token");

            token=scanner.next();
            System.out.println("Your query is "+token);


        return token;
    }
}
