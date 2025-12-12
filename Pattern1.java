public class Pattern1 {
    public static void main(String[] args){
        int [][] rows ={
            {1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,2,2},
            {1,1,1,1,1,3,3,3},
            {1,1,1,4,4,4,4,4},
            {1,1,5,5,5,5,5,5},
            {1,6,6,6,6,6,6,6},
            {7,7,7,7,7,7,7,7}
        };
        for (int []r: rows){
            for(int d:r) System.out.print(d);
            System.out.println();
        }
    }
}
