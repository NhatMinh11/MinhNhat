import java.util.Scanner;

public class Bai11Slide97 {
    public static void main(String[] args){
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu  : ");
        n = scanner.nextInt();
        int A[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " +i+ ":");
            A[i] = scanner.nextInt();
        }
        int B[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            B[i] = A[i];
        }
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(B[i] > B[j]){
                int T = B[i];
                B[i] = B[j];
                B[j] = T ;
                }
            }
        }
        System.out.println("Mang Ban Dau La : ");
        for(int i = 0 ; i < n ; i++){
        System.out.println(+A[i]);
        }
        System.out.println("Mang Da Sap Xep La :");
        for(int i = 0 ; i < n ;i++){
        System.out.println(+B[i]);
        }
        scanner.close();
    }
}
