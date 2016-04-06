import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vitaliy on 30.03.16.
 */
public class Main {
    private static final String KEYWORD_FOR_EXIT = "-stop";
    private static final String KEYWORD_FOR_DELETE = "-del";
    private static final String KEYWORD_FOR_NEW = "-new";
    private static final String KEYWORD_FOR_APPEND = "-append";
    private String basePath = "/home/vitaliy/Downloads";

    public static void main(String[] args) {
        Main main = new Main();
        Walker walker = new Walker();
        ArrayList<Path> paths = walker.showFiles(main.basePath);
        Scanner scanner = new Scanner(System.in);

        ScanInput scan = new ScanInput();
        String token = "";
        System.out.println("commands:-stop to stop program;-new to create a new text file ;" +
                "-append to append text to file; -del to delete file");
        while (true) {
            token = scan.scanConsole(scanner);
            if (isStop(token)) {
                System.out.println("App stopped");
                break;
            } else if (isNew(token)) {
                System.out.println("Please input a file name");
                token = scan.scanConsole(scanner);
                try {
                    Path file = Files.createFile(Paths.get(main.basePath + "/" + token));
                    System.out.println("Please text to write");
                    token = scan.scanConsole(scanner);
                    try (BufferedWriter writer =
                                 Files.newBufferedWriter(file, StandardCharsets.UTF_8,
                                         StandardOpenOption.WRITE)) {
                        writer.write(token);
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (isAppend(token)) {
                System.out.println("Please input a file name");
                token = scan.scanConsole(scanner);
                try {
                    Path file = Paths.get(main.basePath + "/" + token);
                    System.out.println("Please input text to write");
                    token = scan.scanConsole(scanner);
                    try (BufferedWriter writer =
                                 Files.newBufferedWriter(file, StandardCharsets.UTF_8,
                                         StandardOpenOption.APPEND)) {
                        writer.write(token);
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (isDelete(token)) {
                System.out.println("Please input a file name");
                token = scan.scanConsole(scanner);
                try {
                    Path file = Paths.get(main.basePath + "/" + token);
                    Files.delete(file);
                    System.out.println("File has been deleted");
                    break;

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (Files.isDirectory(paths.get(Integer.parseInt(token)))) {

                main.basePath = paths.get(Integer.parseInt(token)) + "";
                paths = walker.showFiles(main.basePath);
            } else if (paths.get(Integer.parseInt(token)).toString().endsWith(".txt")) {
                main.basePath = token + main.basePath;
                try {
                    List<String> lines = Files.readAllLines(paths.get(Integer.parseInt(token)));
                    System.out.println(lines);
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        scanner.close();
    }

    private static boolean isAppend(String token) {
        return token.equals(KEYWORD_FOR_APPEND);
    }

    private static boolean isDelete(String token) {
        return token.equals(KEYWORD_FOR_DELETE);
    }

    private static boolean isStop(String token) {
        return token.equals(KEYWORD_FOR_EXIT);
    }

    private static boolean isNew(String token) {
        return token.equals(KEYWORD_FOR_NEW);
    }
}
