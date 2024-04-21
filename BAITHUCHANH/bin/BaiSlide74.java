import java.util.Scanner;

public class BaiSlide74 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap So Phan Tu Cua Mang:");
            n = scanner.nextInt();
        }while(n < 0);
        int A[] = new int[n];
        System.out.println("Nhap Phan Tu Cua Mang :");
        for(int i = 0 ; i < n ; i++){
            System.out.println("Phan Tu Thu : " +i);
        A[i] = scanner.nextInt();
        }
        long S = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(A[i] % 2 == 0){
                S += i ;
            }
        }
    System.out.println("KQ :" +S);
    }
}