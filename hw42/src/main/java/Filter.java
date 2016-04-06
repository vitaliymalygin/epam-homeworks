import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vitaliy on 24.03.16.
 */
public class Filter {

    //Необходимо определить перечень ключевых слов и сравнивать с ними коллекцию
    String[] keywords = {"abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this", "break", "double",
            "implements", "protected", "throw", "byte", "else", "import",
            "public", "throws", "case", "enum", "instanceof", "return",
            "transient", "catch", "extends", "int", "short", "try",
            "char", "final", "interface", "static", "void", "class",
            "finally", "long", "strictfp", "volatile", "const", "float",
            "native", "super", "while" };

    JavaFileReader javaFileReader = new JavaFileReader();
    ArrayList<String> allStrings = javaFileReader.go();

    public HashMap<String, Integer> findKeywords(){
        HashMap<String, Integer> filtred = new HashMap();

        for (String token:allStrings){
            Integer i=1;
            for (String keyword: keywords){
                if (token.equals(keyword)){
                    if(filtred.containsKey(token)) {
                        Integer integer = filtred.get(token);
                        filtred.put(token, ++integer);
                    }
                    else {
                        filtred.put(token, i);
                        break;
                    }
                }
            }
        }

        return filtred;
    }

}
