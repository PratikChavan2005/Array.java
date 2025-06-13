import java.util.Scanner;
class array{
    public static void main(String[] args) {
        //System.out.println("Enter no of array ");
        Scanner input = new Scanner(System.in);
        int[][] a =new int[3][3];
        
        //int x = input.nextInt();
        System.out.println(" Enter the array elements ");
                
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=input.nextInt();
                
            }
        }
        System.out.println("the entered array elements are ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                  System.out.print(a[i][j] +" ");
            }  
            System.out.println();             
            }
            
        }
}