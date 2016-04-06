import java.util.Scanner;

/**
 * Created by vitaliy on 05.04.16.
 */
public class TokenScanner {
    public String scanConsole(Scanner scanner){
        String token;
        System.out.println("Please input token");
        token = scanner.nextLine();
        return token;
    }
}
