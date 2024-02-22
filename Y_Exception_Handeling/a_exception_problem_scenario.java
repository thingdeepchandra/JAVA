package Y_Exception_Handeling;
 
// this example includes problem statement, i.e. we cannot divide numbers by zero
public class a_exception_problem_scenario {
    public static void main(String[] args) {
        int a = 12, b = 0, result;
        result = a / b;
        System.out.println("The result = " + result);
    }
}