import java.io.File;
import java.io.IOException;
public class FilePropTest {
public static void main(String[] args) {
try {
File file = new File("java_File.txt");
if (file.createNewFile()) {
System.out.println("Created a new file");
} else {
System.out.println("File is already present ");
}
} catch (IOException e) {
e.printStackTrace();
}
}
}