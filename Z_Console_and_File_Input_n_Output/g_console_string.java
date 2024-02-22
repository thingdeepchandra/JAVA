package Z_Console_and_File_Input_n_Output;

import java.io.Console;

public class g_console_string {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your college name:");
        String clzname = c.readLine();
        System.out.println("You study in " + clzname + "college.");
    }

}
