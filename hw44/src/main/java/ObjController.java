import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vitaliy on 27.03.16.
 */
public class ObjController {
    public static final String FILE_PATH = "/home/vitaliy/Programming/epam-homeworks/hw44/src/main/resources/" +
            "Obj";
    public void writeObj(HashMap<Film, ArrayList<Actor>> films){
        ListsInflator listsInflator=new ListsInflator();
        HashMap<Film, ArrayList<Actor>> filmsNew= films;
        System.out.println("Object to save: "+filmsNew);
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(FILE_PATH))){
            os.writeObject(films);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readObj(){
        try(ObjectInputStream is=new ObjectInputStream(new FileInputStream(FILE_PATH))){
            HashMap<Film, ArrayList<Actor>> readfilms=(HashMap<Film, ArrayList<Actor>>)is.readObject();
            System.out.println("Readed object: "+readfilms);
//           for (Map.Entry entry : readfilms.entrySet()) {
//               System.out.println("Key: " + entry.getKey().toString() + " Value: "
//                       + entry.getValue());
//           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
