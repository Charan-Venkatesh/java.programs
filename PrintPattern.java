import java.util.*;
public class PrintPattern {
    public static void main(String args[]) {
        int n = 20;

        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}