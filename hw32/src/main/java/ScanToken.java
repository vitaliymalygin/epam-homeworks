import java.util.Scanner;

public class ScanToken {

    public String scanConsole(Scanner scanner){
        String token;
        System.out.println("Please input token");
        token = scanner.next();
        return token;
    }
}
