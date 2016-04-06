
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by vitaliy on 25.03.16.
 */
public class Main {
    String token;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner=new Scanner(System.in);
        TokenScanner tokenizer=new TokenScanner();
        ObjController controller = new ObjController();
        ListsInflator inflator = new ListsInflator();
        HashMap<Film, ArrayList<Actor>> films = main.testInflate(inflator);
        //controller.writeObj(films);
        controller.readObj();
        System.out.print("Press 1 of you want to add new film" + "\n"
                + "Press 2 if you want to delete film from list" + "\n");

        String token = tokenizer.scanConsole(scanner);
        if (token.equals("1")) {
            System.out.println("Print the name of film and release date separated by a space");
            String[] tokens = tokenizer.scanConsole(scanner).split("\\s");
            Film fimnToAdd = new Film(tokens[0], Integer.parseInt(tokens[1]));
            System.out.println("Please input Actor names and those date of birth separated by a space");
            tokens = tokenizer.scanConsole(scanner).split("\\s");
            ArrayList<Actor> newActors = new ArrayList<>();
            for (int i = 0; i < tokens.length; i = i + 2) {
                String name = tokens[i];
                int date = Integer.parseInt(tokens[i + 1]);

                newActors.add(new Actor(name, date));
            }

            films.put(fimnToAdd,newActors);
            controller.writeObj(films);

        }
        else if (token.equals("2")){
            System.out.println("Print the name of film and release date separated by a space");
            String[] tokens = tokenizer.scanConsole(scanner).split("\\s");
            Film fimnToDelete = new Film(tokens[0], Integer.parseInt(tokens[1]));
            films.remove(fimnToDelete);
            controller.writeObj(films);
        }
        else {
            System.out.println("Inkorrect token");
        }

    }


    public HashMap<Film, ArrayList<Actor>> testInflate(ListsInflator inflator) {

        ArrayList<Actor> actorsOfInsomnia;
        ArrayList<Actor> actorsOfSunshine;

        actorsOfInsomnia = new ArrayList<>();
        actorsOfSunshine = new ArrayList<>();
        actorsOfInsomnia.add(new Actor("Al Pacino", 1940));
        actorsOfInsomnia.add(new Actor("Robin Williams", 1951));
        actorsOfInsomnia.add(new Actor("Hilary Swank", 1974));
        actorsOfInsomnia.add(new Actor("Maura Tierney", 1965));
        actorsOfInsomnia.add(new Actor("Martin Donovan", 1957));

        actorsOfSunshine.add(new Actor("Rose Byrne", 1979));
        actorsOfSunshine.add(new Actor("Cliff Curtis", 1968));
        actorsOfSunshine.add(new Actor("Chris Evans", 1981));
        actorsOfSunshine.add(new Actor("Troy Garity", 1973));
        actorsOfSunshine.add(new Actor("Cillian Murphy", 1976));
        Film insomnia = new Film("Insomnia", 2002);
        Film sunshine = new Film("Sunshine", 2007);
        inflator.inflate(insomnia, actorsOfInsomnia);
        HashMap<Film, ArrayList<Actor>> films;
        films = inflator.inflate(sunshine, actorsOfSunshine);
        return films;
    }

}
