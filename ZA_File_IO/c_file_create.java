package ZA_File_IO;

import java.io.File;
import java.io.IOException;


public class c_file_create {
    public static void main(String[] args) {
        File file = new File("/Users/Deepchandra/Desktop/STC_JAVA/ZA_File_IO/sita.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }

    }
}
