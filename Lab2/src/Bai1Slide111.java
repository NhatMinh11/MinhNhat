import java.util.ArrList;

import java.util.Scannner;

public class Bai1Slide111 {
    public static void main(String[] args){
        int number;
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Phan tu cua mang : ");
        int n = nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu:" +i ":");
            number = sc.nextInt();
            arrList = add(numeber);
        }
        int max = arrList.get(0);
        for(int =1; i < arrList.size() ; i++){
            if(arrList.get(i).compareTo(max) > 0){
               max = arrList.get(i);
            }
        }
        System.out.println("Nhap phan tu muon xoa :");
        int x = sc.nextInt();
        for(int i = 0; i < arrList.size(); i++){
            if(x = i)
            remove(i);
        }
    }
}
