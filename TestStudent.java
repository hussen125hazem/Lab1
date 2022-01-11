import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 11/01/2022.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        Scanner in = new Scanner(System.in);
        int id ;
        String name;
        for (int i = 0; i < s.length; i++) {
            System.out.println("input the id for student "+ (i+1));
            id = in.nextInt();
            System.out.println("input the name for student "+ (i+1));
            name = in.next();
            s[i] = new Student(id,name);
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
        }
    }
}
