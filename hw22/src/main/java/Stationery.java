/**
 * Created by vitaliy on 03.03.16.
 */
public class Stationery implements Comparable<Stationery> {
    private String description;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int compareTo(Stationery stationery){
        int result= this.getDescription().compareTo(stationery.getDescription());
        return result;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
