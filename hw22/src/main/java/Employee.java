/**
 * Created by vitaliy on 03.03.16.
 */
public class Employee {
    private  float price=0;

    public float calculatePrice(Stationery[] stationery){
        for (Stationery token:stationery){
            float temp=token.getPrice();
            price=+temp;
        }
        return price;
    }

}
