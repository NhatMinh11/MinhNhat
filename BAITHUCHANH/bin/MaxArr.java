import java.util.ArrayList;

import java.util.Scanner;

public class MaxArr {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap So Phan Tu Cua Mang : ");
        int n = sc.nextInt(); 

        for(int i = 0 ;i < n ; i++){
            System.out.println("Nhap Phan Tu Thu " + i + ":");
            number = sc.nextInt;
            arrList.add(number);
        } 
        
        int max = arrList.get(0);
        for(int i = 1; i < arrList.size() ; i++){
            if(arrList.get(i).compareTo(max) > 0){
                max = arrList.get(i);
            }
        }
        System.out.println("Phan Tu Lon NhatTrong Mang La : " +max);
    }
}
