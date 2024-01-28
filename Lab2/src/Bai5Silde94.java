import java.util.Scanner;

public class Bai5Silde94 {
    public static void main (String[] args){
        int n , sum = 0 ;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap n : ");
            n = scanner.nextInt();
            sum += n ;
        }while(sum < 100) ;
        System.out.println("Ket Qua la : "+sum);
    }
}
