import java.util.ArrayList;
import java.util.List;

public class Student {

    private static long id;
    private static String name;
    private static ArrayList<Integer> grades;

    public Student (long id, String name, ArrayList<Integer> grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

}
