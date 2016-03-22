import java.util.Scanner;

public class ScanToken {

    public String scanConsole(){
        String token;
        System.out.println("Please input token");
        try(Scanner scanner=new Scanner(System.in)) {

            token = scanner.next();

        }
        return token;
    }
}
