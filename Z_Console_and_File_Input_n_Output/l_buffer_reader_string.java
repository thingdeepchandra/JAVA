package Z_Console_and_File_Input_n_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l_buffer_reader_string {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = reader.readLine();
        System.out.println("The number is =" + name);
    }
}
// 
