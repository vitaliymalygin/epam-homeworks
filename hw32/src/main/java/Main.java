import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by vitaliy on 20.03.16.
 */
public class Main {
    Locale ruLocale;
    Locale engLocale;

    public static void main(String[] args) {
        ResourceBundle bundle;
        Main main=new Main();

        System.out.println("Please choose language of program" +
                "Press 1 to choose RU or press 2 to choose EN");
        ScanToken scanToken=new ScanToken();
        String chooseLang=scanToken.scanConsole();
        String chooseQuest;
        switch (chooseLang){
                case "1":

                    main.ruLocale=new Locale("ru","RU");
                    bundle=ResourceBundle.getBundle("questions", main.ruLocale);
                    for (int i=1; i<=5; i++) {
                        System.out.println(bundle.getString(""+i));
                    }
                    System.out.println("Введите номер вопроса");

                    bundle=ResourceBundle.getBundle("answers", main.ruLocale);

                    chooseQuest=scanToken.scanConsole();
                    System.out.println(bundle.getString(chooseQuest));
                    break;


                case "2":
                    main.engLocale=new Locale("en","US");
                    bundle=ResourceBundle.getBundle("questions", main.engLocale);
                    for (int i=1; i<=5; i++) {
                        System.out.println(bundle.getString(""+i));
                    }
                    System.out.println("Please input of number of question you choose");

                    bundle=ResourceBundle.getBundle("answers", main.engLocale);

                    chooseQuest=scanToken.scanConsole();
                    System.out.println(bundle.getString(chooseQuest));
                    break;

            }


    }


}
