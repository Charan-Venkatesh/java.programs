
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritePrint {
    public static void main(String[] args) throws IOException{
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("out_fmt.txt")))){
            pw.printf("user: %s,SOurce: %d%n","charan",143);

        }
    }
}
