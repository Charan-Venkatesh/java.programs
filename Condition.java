import java.util.*;
public class Condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult allow to driving linc");
        } else {
            System.out.println("not adult to allow drivin linc");
        }
    }
}
