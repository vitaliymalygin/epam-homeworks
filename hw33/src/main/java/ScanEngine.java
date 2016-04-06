
/**
 * Created by vitaliy on 21.03.16.
 */



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ScanEngine {
    private Pattern picPattern = Pattern.compile("pic([0-9]{1,2})[.]jpg");
    private Pattern refPattern = Pattern.compile("[Р|р](ис[.]|исунке)[ ]?([0-9]{1,2})");
    private static final String FILE_PATH = "hw33/src/main/resources/" +
            "Java.SE.03.Information handling_task_attachment.html";

    public void parse(List<Line> refLines, List<Line> picLines) {
        try {
            FileInputStream in = new FileInputStream(FILE_PATH);
            BufferedReader buff = new BufferedReader(new InputStreamReader(in, "cp1251"));
            int numberOfLine = 0;
            String string;
            while ((string = buff.readLine()) != null) {
                Matcher m = picPattern.matcher(string);
                Matcher p = refPattern.matcher(string);
                numberOfLine++;
                if (m.find()) {
                    picLines.add(new Line(numberOfLine, string));
                } else if (p.find()) {
                    refLines.add(new Line(numberOfLine, string));
                }
            }
            buff.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setState(List<Line> refLines, List<Line> picLines) {
        for (Line line : refLines) {
            Matcher m = refPattern.matcher(line.getData());
            while (m.find()) {
                line.addNumbOfPic(Integer.valueOf(m.group(2)));
            }
        }
        for (Line line : picLines) {
            Matcher m = picPattern.matcher(line.getData());
            if (m.find()) {
                line.addNumbOfPic(Integer.valueOf(m.group(1)));
            }
        }
        for (Line line : refLines) {
            for (int i = 0; i < line.getNumbOfPics().size(); i++) {
                if (line.getNumbOfLine() < getNumbOfPicLine(line.getNumbOfPics().get(i), picLines))
                    line.setRefPrevPic();
            }
        }
    }

    private int getNumbOfPicLine(int numbOfPic, List<Line> picLines) {
        for (Line line : picLines) {
            if (line.getNumbOfPics().get(0) == numbOfPic) return line.getNumbOfLine();
        }
        return 0;
    }
}