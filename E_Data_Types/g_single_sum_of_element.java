public class g_single_sum_of_element {
    public static void main(String[] args) {
       int sum=0,arrayLength;
       double avg=0.0;
        int marks[]={33,45,67,54,23,56,67,78};
        for (int  mark : marks){
             arrayLength=marks.length;
            sum+=mark;//sum=sum+mark;
           avg= (double) sum/arrayLength;
        }
        
        System.out.println("The sum of array element is "+sum); 
        System.out.println("Average is ="+avg); 
    }
    
}
