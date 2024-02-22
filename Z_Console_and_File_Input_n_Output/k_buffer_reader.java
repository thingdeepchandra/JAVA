package Z_Console_and_File_Input_n_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class k_buffer_reader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("The number is =" + num);
    }

}
