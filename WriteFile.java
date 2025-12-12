import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class WriteFile {
    public static void main(String[] args)throws IOException {
     Path p = Paths.get("out_nio.txt");
     Files.write(p,
        "single content\n".getBytes(StandardCharsets.UTF_8),
        StandardOpenOption.CREATE,
        StandardOpenOption.APPEND
    );
     Files.write(p,Arrays.asList("line1","line2","charan is good boy"),StandardCharsets.UTF_8, StandardOpenOption.CREATE,StandardOpenOption.TRUNCATE_EXISTING);  
    }
}
