


public class CrazyLogger {
    static public StringBuilder archive=new StringBuilder();


    public void info(String date, String msg){

        archive.append(date);
        archive.append(" ");
        archive.append(msg);
        archive.append("\n");
    }






}
