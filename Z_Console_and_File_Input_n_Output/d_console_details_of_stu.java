package Z_Console_and_File_Input_n_Output;

public class d_console_details_of_stu {
    public static void main(String[] args) {

        System.out.print("Enter the roll no. of student:");
        String strValue1 = System.console().readLine();
        int roll = Integer.parseInt(strValue1);

        System.out.print("Enter the name of a student :");
        String name = System.console().readLine();

        System.out.print("Enter the address of a student:");
        String address = System.console().readLine();
        System.out.println("\n");

        System.out.println("Details os student: ");
        System.out.println("The roll no of student is =" + roll);
        System.out.println("The name of student is =" + name);
        System.out.println("The address of student is =" + address);

    }
}
