import java.util.Scanner;

public class BaiSlide81 {
    public static void main(String[] args){
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Hang m :");
        m = scanner.nextInt();
        System.out.println("Nhap Cot n");
        n = scanner.nextInt();
       int A[][] = new int[m][n];
         System.out.println("Nhap  phan tu cua mang : ");
         for(int i = 0 ;i < m ; i++ ){
            for (int j = 0 ; j < n ; j++){
                System.out.println("A[" +i+"]  [" +j+"]" );
                A[i][j] = scanner.nextInt();
            }
         }
         int max = A[0][0];
         for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(max < A[i][j]){
                    max = A [i][j];
                }
            }
         }
         System.out.println(" Phan tu lon nhat ma tran la : " +max);
    }
}