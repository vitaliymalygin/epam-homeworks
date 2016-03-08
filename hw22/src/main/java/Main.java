import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by vitaliy on 03.03.16.
 */
public class Main {

    public static void main(String[] args) {

        Stationery[] stationeries = new Stationery[]{new Pen(), new Ruler(), new Stapler()};

        for (int i = 0; i < stationeries.length; i++) {
            stationeries[i].setPrice((float) (Math.random() * (10 - 5) + 1));

        }
        for (int i = 0; i < stationeries.length; i++) {
            stationeries[i].setDescription(""+(float) (Math.random() * (10 - 5) + 1));
        }

        Employee employee = new Employee();
        float price = employee.calculatePrice(stationeries);
//        System.out.println(price);

        Arrays.sort(stationeries);
        for (Stationery stationery:stationeries){
            System.out.println(stationery.toString());
        }
        ArrayList<Stationery> stationeries1= new ArrayList<Stationery>(Arrays.asList(stationeries));
        Collections.sort(stationeries1,new PriceComparator());
        System.out.println(stationeries1);
    }
}