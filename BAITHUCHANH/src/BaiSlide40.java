import java.util.Scanner;

public class BaiSlide40 {
    public static void main(String[] args){
        int ngay ;
        Scanner scanner =new  Scanner(System.in);
        System.out.println("Moi Nhap Ngay : ");
        ngay = scanner.nextInt();
        switch(ngay){
            case 0 : System.out.println("Chu Nhat");
            break ;
            case 1 : System.out.println("Thu Hai");
            break ;
            case 2 : System.out.println("Thu Bar");
            break ;
            case 3 : System.out.println("Thu Tu");
            break ;
            case 4 : System.out.println("Thu Nam");
            break ;
            case 5 : System.out.println("Thu Sau");
            break ;
            case 6 : System.out.println("Thu Bay");
            break ;
            default : System.out.println("So Ngay Trong Tuan Sai");
        }
    }
}
