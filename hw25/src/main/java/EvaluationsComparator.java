import java.util.Comparator;

/**
 * Created by vitaliy on 11.03.16.
 */
public class EvaluationsComparator implements Comparator<Number> {
    public int compare(Number s1, Number s2) {

        if (s1.doubleValue() > s2.doubleValue()) {
            return 1;
        } else if (s1.doubleValue() < s2.doubleValue()) {
            return -1;
        }
        return 0;
    }
}
