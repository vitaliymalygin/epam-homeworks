import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by vitaliy on 09.03.16.
 */
public class Main {
    ArrayList<Student> mathGroup;
    ArrayList<Student> litGroup;
    ArrayList<Student> physGroup;
    ArrayList<Number> evaluations;
    EvaluationsComparator evaluationsComparator;
    ArrayList<ArrayList<Student>> groups;


    public static void main(String[] args) {
        Main main = new Main();

        main.init();
        main.compare();
    }


    public void init() {
        evaluations =new ArrayList<>();

        mathGroup = new ArrayList<>();
        mathGroup.add(new Student("Mary", Discipline.MATH));

        mathGroup.add(new Student("John", Discipline.MATH));
        mathGroup.add(new Student("Peter", Discipline.MATH));
        for (Student student : mathGroup) {
            student.getDiscipline().setFloatValue((float) (Math.random() * (10 - 5)));
        }
        litGroup = new ArrayList<>();
        litGroup.add(new Student("Sarah", Discipline.LITERATURE));
        litGroup.add(new Student("Dmitriy", Discipline.LITERATURE));
        litGroup.add(new Student("David", Discipline.LITERATURE));
        litGroup.add(new Student("Peter", Discipline.LITERATURE));
        for (Student student : litGroup) {
            student.getDiscipline().setIntValue((int) (Math.random() * (10 - 5)));
        }
        physGroup = new ArrayList<>();
        physGroup.add(new Student("Vitaliy", Discipline.PHYSICS));
        physGroup.add(new Student("Matt", Discipline.PHYSICS));
        physGroup.add(new Student("Cindy", Discipline.PHYSICS));
        physGroup.add(new Student("Peter", Discipline.PHYSICS));
        for (Student student : physGroup) {
            student.getDiscipline().setFloatValue((float) (Math.random() * (10 - 5)));
        }
        groups = new ArrayList<>();
        groups.add(mathGroup);
        groups.add(litGroup);
        groups.add(physGroup);
        for (ArrayList<Student> group : groups) {
            for (int i = 0; i < group.size(); i++) {
                if (group.get(i).getName().equals("Peter")) {
                    System.out.println("Peter consist in group " + group.get(i).getDiscipline());
                    if (group.get(i).getDiscipline().getIntegerValues() != null) {
                        evaluations.addAll(group.get(i).getDiscipline().getIntegerValues());

                    } else {

                        System.out.println("Integer evaluations are not find");
                    }

                    if (group.get(i).getDiscipline().getFloatValues() != null) {
                        evaluations.addAll(group.get(i).getDiscipline().getFloatValues());
                    } else {
                        System.out.println("Float evaluations are not find");
                    }

                }
            }
        }
    }
    public void compare(){
        evaluationsComparator=new EvaluationsComparator();
        Collections.sort(evaluations,evaluationsComparator);
        System.out.println(evaluations);
    }
}

