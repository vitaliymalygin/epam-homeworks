import java.util.Comparator;

/**
 * Created by vitaliy on 08.03.16.
 */
public class PriceComparator implements Comparator<Stationery> {


    public int compare(Stationery s1, Stationery s2) {

        if (s1.getPrice() > s2.getPrice()) {
            return 1;
        } else if (s1.getPrice() < s2.getPrice()) {
            return -1;
        }
        return 0;
    }
}
