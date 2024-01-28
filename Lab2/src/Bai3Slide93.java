import java.util.Scanner;

public class Bai3Slide93 {
    public static void main(String[] args){
        int n ;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n >= 18)
        System.out.println("Ban Da Gia");
        if( n >= 16 && n <18 ){
            System.out.println("Ban Dang Tuoi Truong Thanh");
        } else 
        if(n < 16 ) 
        System.out.println("Ban Dang Tuoi Vi Thanh Nien"); 
    }
}
