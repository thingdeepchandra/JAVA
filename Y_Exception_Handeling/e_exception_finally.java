package Y_Exception_Handeling;

public class e_exception_finally {
    public static void main(String[] args) {
        int a = 12, b = 2, result;
        try {
            result = a / b;
            System.out.println("The result=" + result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("we cannot divide a nuber by zero.");

        }
        // aru kura tha xaina finally jasare pani run hunu parxa
        finally {
            System.out.println("Be careful when you divide a number by zero");
        }
    }
}
