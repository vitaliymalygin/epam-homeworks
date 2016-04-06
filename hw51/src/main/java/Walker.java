
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vitaliy on 30.03.16.
 */
public class Walker {
    ArrayList<Path> paths;
    public ArrayList<Path> showFiles(String path){
        paths=new ArrayList<>();
        Path dir= Paths.get(path);
        try(DirectoryStream<java.nio.file.Path>stream
        = Files.newDirectoryStream(dir)){
            for (Path entry:stream){
                if(Files.isDirectory(entry)){
                    paths.add(entry);
                    System.out.println("Directory number: "+paths.indexOf(entry)+" name: "+entry.getFileName());

                }
                else if(entry.toString().endsWith(".txt")){
                    paths.add(entry);
                    System.out.println("Text file number: "+paths.indexOf(entry)+" name: "+entry.getFileName());

                }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    return paths;
    }

}
