import course.IdStudents;

import java.sql.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<IdStudents> set = new HashSet<>();

        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));
        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));
        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));
        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));
        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));
        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));
        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));
        System.out.println("how many students couse A");
        set.add(new IdStudents(sc.nextInt()));

        System.out.println("Total students: " + set.size());




        sc.close();
    }
}