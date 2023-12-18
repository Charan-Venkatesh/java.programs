import java.util.*;
public class FunctionP1sumreturns {
    //public static int calculateSum(int a,int b){
       // int sum = a+b;
        //return sum;
    public static int calculateProduct(int a, int b){
        return a*b;
        //product of two sums...
    }
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       // int sum = calculateSum( a, b);
        System.out.println("Product  of 2 numbers is : "+calculateProduct(a,b));
    }
}
