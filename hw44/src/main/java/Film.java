import java.io.Serializable;
import java.util.Objects;

/**
 * Created by vitaliy on 25.03.16.
 */
public class Film implements Serializable{
    private String name;
    private int releaseDate;

    public Film(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return releaseDate == film.releaseDate &&
                Objects.equals(name, film.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, releaseDate);
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
