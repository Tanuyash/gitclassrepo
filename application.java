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

#feature202 changes made by John on ICICI bank
public void givenDir_whenMkdir_thenDirIsDeleted() {
    File directory = new File("dir");
    assertTrue(directory.mkdir());
    assertTrue(directory.delete());
}

@Test
public void givenFile_whenCreateNewFile_thenFileIsDeleted() {
    File file = new File("file.txt");
    try {
        assertTrue(file.createNewFile());
    } catch (IOException e) {
        fail("Could not create " + "file.txt");
    }
    assertTrue(file.delete());

#feature201 changes made by Ann for SBI bank project
import java.io.File;
public class FilePropTest2 {
public static void main(String[] args) {
File fil_nm=new File("C:/Users/adutta/documents");
String all_file_names[]=fil_nm.list();
for(String enlist_filename:all_file_names){
System.out.println(enlist_filename);
}
}

}
}