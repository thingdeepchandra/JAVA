package Z_Console_and_File_Input_n_Output;

import java.io.Console;

public class h_details_of_emp {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter employee Id:");
        int Id = Integer.parseInt(c.readLine());

        System.out.print("Enter your name of employee:");
        String empname = c.readLine();

        System.out.print("Enter address of employee:");
        String empaddress = c.readLine();

        System.out.print("Enter employee Salary:");
        int salary = Integer.parseInt(c.readLine());
        System.out.println("\n");
        System.out.println("Details of emloyee:");
        System.out.println("Employee Id:" + Id);
        System.out.println("Employee name =" + empname);
        System.out.println("Employee address:" + empaddress);
        System.out.println("Employee salary =" + salary);

    }

}
