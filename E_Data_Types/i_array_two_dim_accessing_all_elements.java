public class i_array_two_dim_accessing_all_elements {
    public static void main(String[] args) {
        int [][] myArray={
            {12,34,56},
            {56,77,88}
        };
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
        // System.out.println(myArray[1][2]);
        System.out.print(myArray[i][j]+ "  ");
 }  
 System.out.println();
   }
 }
}