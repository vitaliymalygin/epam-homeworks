/**
 * Created by vitaliy on 08.03.16.
 */
@Version(1)
public class AtomBoat {
    private AtomBoatEngine atomBoatEngine;
    public static void main(String[] args) {
        AtomBoat atomBoat=new AtomBoat();
        System.out.println("Atomic boat ready to go!");
        atomBoat.go();

    }
    private void go(){
        atomBoatEngine=new AtomBoatEngine();
        System.out.println(atomBoatEngine.startEngine());
    }
    class AtomBoatEngine{
        public String startEngine(){
            return "I start my journey!";
        }
    }

}
