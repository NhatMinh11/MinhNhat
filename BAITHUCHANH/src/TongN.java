import java.util.Scanner;

public class TongN {
    public static void main(String[] args){
        int n,sodu,S = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n : ");
        n = scanner.nextInt();
while (n > 0){
    sodu = n % 10;
    n = n / 10;
    S += sodu;
}
System.out.println("Ket Qua la : "+S);
    }
 }
