public class TryCatchDemo{
public static void main(String[] args){

    int [] arr ={10,20,30};
    try{
        int x = arr[5];
        System.out.println(x);
    }
 catch(Exception e){
    System.out.println("Catch exception:"+ e.getClass().getName()+"-"+e.getMessage());

 }
 System.out.println("Program continue after catch.");
}
}