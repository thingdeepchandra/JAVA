package C_Control_Statement.c_Switch;
import java.util.Scanner;

public class b_char_abberevatin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter form a to e to get is abbrevatiation:");
        char letter=sc.next().charAt(0);
        switch(Character.toLowerCase(letter)){
            case 'a':
            System.out.println("Apple");
            break;

            case 'b':
            System.out.println("ball");
            break;

            case 'c':
            System.out.println("Cat");
            break;

            case 'd':
            System.out.println("Dog");
            break;

            case 'e':
            System.out.println("Elephant");
            break;

            default:
            System.out.println("Invalid output");  
        }
        sc.close(); 
    }
}
