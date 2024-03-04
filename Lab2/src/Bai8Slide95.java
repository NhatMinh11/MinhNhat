import java.util.Scanner;

public class Bai8Slide95 {
    public static void main(String[] args){
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu :");
        n = scanner.nextInt();
     int A[] = new int[n];
     for(int i = 0 ; i < A.length ; i++){
        System.out.println("Nhap gia tri  phan tu thu " +i);
        A[i] = scanner.nextInt();
     }
     int tong  = 0 ;
     for(int i = 0 ; i < A.length ; i++){
        tong += A[i];
     }
     float tbc = tong / n ;
     System.out.println("Kq : " +tbc);
    }
 }