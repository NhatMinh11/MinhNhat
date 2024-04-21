import java.util.Scanner;

public class BaiSlide55 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n : ");
        n = scanner.nextInt();
        if (n <= 20){
           for(int i = 1; i <= n ; i++){
            if(i % 5 == 0)
            System.out.println("Ket qua la : " +i);
           }
        }else System.out.println("Xin Nhap Lai ");
    }
}
