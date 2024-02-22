package Z_Console_and_File_Input_n_Output;

import java.io.Console;

public class f_console_int {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter a number:");
        int num=Integer.parseInt(c.readLine());
        System.out.println("number is ="+num);
    }
    
}
