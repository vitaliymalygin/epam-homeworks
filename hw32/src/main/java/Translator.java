import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Created by vitaliy on 21.03.16.
 */
public class Translator {
    public static void main(String[] args) {
        String escape =StringEscapeUtils.escapeJava("Функция или процедура, связанная с классом");
        System.out.println(escape);

    }
}
