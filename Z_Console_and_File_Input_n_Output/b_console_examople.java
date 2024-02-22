package Z_Console_and_File_Input_n_Output;

public class b_console_examople {
    public static void main(String[] args) {
        System.out.print("Enter the value of num1:");
        String strValue1 = System.console().readLine();
        int num1 = Integer.parseInt(strValue1);
        System.out.println("You enterd " + num1);

        System.out.print("Enter the value of num2:");
        String strValue2 = System.console().readLine();
        int num2 = Integer.parseInt(strValue2);
        System.out.println("The value of num2 is=" + num2);

        int sum = num1 + num2;
        System.out.print("The sum of num1  and num2 is =" + sum);

    }
}
