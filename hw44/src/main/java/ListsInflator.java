import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vitaliy on 25.03.16.
 */
public class ListsInflator {
    private HashMap<Film, ArrayList<Actor>> films;
    private ArrayList<Actor> actors;

    public HashMap<Film, ArrayList<Actor>> inflate(Film filmToAdd, ArrayList<Actor> newActors) {
        actors = newActors;
        films = new HashMap<>();
        films.put(filmToAdd, actors);
        return films;
    }
}
