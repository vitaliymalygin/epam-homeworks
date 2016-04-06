import java.io.Serializable;
import java.util.Objects;

/**
 * Created by vitaliy on 25.03.16.
 */
public class Actor implements Serializable {
    private String name;
    private int dateOfBirth;

    public Actor (String name, int dateOfBirth){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }


    public String getName() {
        return name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return dateOfBirth == actor.dateOfBirth &&
                Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
