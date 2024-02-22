package ZA_File_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class f_file_reader_bufferreader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Deepchandra/Desktop/STC_JAVA/ZA_File_IO/ram.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
