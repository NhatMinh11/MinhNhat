 import java.util.Scanner ;

    public class Bai6Slide95 {
        public static void main (String[] args){
            int n ,giaithua = 1 ;
            System.out.println("Nhap n : ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            for(int i = 1;i <= n ; i++){
                giaithua *= i;
            }
            System.out.println("Ket Qua la :" +giaithua);
    } 
}
