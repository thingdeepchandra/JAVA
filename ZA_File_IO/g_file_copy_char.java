package ZA_File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class g_file_copy_char {
    public static void main(String[] args) {
        File file=new File("C:/Users/Deepchandra/Desktop/STC_JAVA/ZA_File_IO/ram.txt");
        FileInputStream fis=new FileInputStream(file);
        byte bytes[]=new byte[(int)file.length()];
        fis.read(bytes);
        File out=new File("C:/Users/Deepchandra/Desktop/STC_JAVA/ZA_File_IO/ram.txt");
        try(FileOutputStream outputStream =new FileOutputStream(out))
        {
            outputStream.write(bytes);
            outputStream.flush();
        }
    }
    
}
