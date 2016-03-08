/**
 * Created by vitaliy on 06.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Stationery[] stationeries = new Stationery[]{new Pen(), new Eraser(), new Pencil()};

        for (int i = 0; i < stationeries.length; i++) {
            stationeries[i].setPrice((float) (Math.random() * (15 - 5) + 1));

        }
    }

}
