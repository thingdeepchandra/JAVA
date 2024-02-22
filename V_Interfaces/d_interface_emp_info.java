//write a program in java to enter id. and name of employee  and to display the information using interface

package V_Interfaces;


import java.util.Scanner;

interface IEmployee{
    public void getdata();
    public void showdata();


    }
    public class d_interface_emp_info implements IEmployee
    {
        int emp_id;
        String emp_name;
        public static void main(String[] args) {
            d_interface_emp_info emp1=new d_interface_emp_info();
            emp1.getdata();
            emp1.showdata();
        }

        @Override
        public void getdata() {
            Scanner sc =new Scanner(System.in);
         System.out.println("Enter employee id:");
         emp_id=sc.nextInt();
         System.out.println("Ebter employee name:");
         emp_name=sc.next();
         sc.close();   
        }

        @Override
        public void showdata() {
            System.out.println("Employee id="+emp_id);
            System.out.println("Employee name:"+emp_name);
        }

    }

