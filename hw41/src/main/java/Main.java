import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vitaliy on 22.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Filter filter=new Filter();
        HashMap<String,Integer>filtered=filter.findKeywords();
        System.out.println(filtered);
        ResultWriter resultWriter=new ResultWriter();
        resultWriter.write(filtered);
    }
}
