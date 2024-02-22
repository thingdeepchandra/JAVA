//this program explaind the use od next() and nextline()whilist
//taking multiple string consecutively and *sc.nextline()*as its 
package Z_Console_and_File_Input_n_Output;

import java.util.Scanner;

public class e_use_of_next_and_nextline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number:");
        int roll=sc.nextInt();

        System.out.println("Enter name:");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("Enter address:");
        String address=sc.nextLine();

        System.out.println("Roll no:"+roll);
        System.out.println ("Name="+name);
        System.out.println("Address ="+address);
        sc.close();
    }
    
}
