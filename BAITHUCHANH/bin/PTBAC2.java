import java.util.Scanner;

public class PTBAC2 {
public static void main(String[] args){
   double a , b , c , x1 , x2 , delta;
   String ketqua = "";
    Scanner scanner = new Scanner(System.in);
    do{
      System.out.print("Nhap a : ");
      a = scanner.nextDouble();
    }while( a == 0);
    System.out.print("Nhap b : ");
    b = scanner.nextDouble();
    System.out.print("Nhap c : ");
    c = scanner.nextDouble();
    delta = Math.pow(b,2) - 4*a*c;
    if(delta < 0){
      ketqua = "PT vo nghiem";
    }else if(delta == 0){
      x1 = x2 = -b / (2 * a);
      System.out.println("PT co nghiem kep : "+x1);
    }else {
      x1 = (-b + Math.sqrt(delta))/ (2 * a);
      x2 = (-b - Math.sqrt(delta))/ (2 * a);
      ketqua = "Pt co 2 nghiem phan biet x1 = " + x1 +"va x2 = " + x2;
    }
    System.out.println(ketqua);
 }
}


