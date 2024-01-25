import java.util.Scanner;

public class TimMin {
    public static void main(String[] args){
int so1 , so2;
Scanner scanner = new Scanner(System.in);
System.out.println("Nhap so thu nhat : ");
so1 = scanner.nextInt();
System.out.println("Nhap so thu hai : ");
so2 = scanner.nextInt();
int min = so1 ;
if(so1 > so2)
    min = so2 ;
   System.out.println("So Min la : "+min);
    }
}
