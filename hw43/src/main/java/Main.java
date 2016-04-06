import java.util.ArrayList;

/**
 * Created by vitaliy on 25.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Input input=new Input();
        ArrayList<String> inputStrings=input.readInput();
        Output output=new Output();
        output.write(inputStrings);
    }
}
