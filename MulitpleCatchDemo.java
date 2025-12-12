public class MulitpleCatchDemo{
    public static void main(String[] args){
        try{
            String s = args.length > 0 ? args[0] :"100";
            int num = Integer.parseint(s);
          
             int[] arr ={10,20,30};
            int v = arr[num];
            int result = v / (num - num);
    }
    catch(Exception e){
        System.out.println("Catch exception:"+ e.getClass().getName()+"-"+e.getMessage())
    }
    catch(Exception e){
                System.out.println("Catch exception:"+ e.getClass().getName()+"-"+e.getMessage())

    }
    catch(Exception e){   
    System.out.println("Catch exception:"+ e.getClass().getName()+"-"+e.getMessage())
    }
}
}
//hello@innovaciotech.com