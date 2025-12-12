import java.io.*;

public class WriteBuffered{
    public static void main(String[] args)throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt",true))  ){
            bw.write("Line 1");
            bw.newLine();
            bw.write("Line 2");
            bw.newLine();
            bw.write("charan venkatesh");
        } 
    }
}