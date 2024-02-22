package Z_Console_and_File_Input_n_Output;

import java.io.Console;

public class j_read_password {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter a password:");
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);
        System.out.println("The password ="+pass);
    }
    
}
