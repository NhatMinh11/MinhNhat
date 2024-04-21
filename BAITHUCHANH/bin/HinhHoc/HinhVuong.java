package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends hinhHoc{
    public float canh;
    public HinhVuong(){
        ten = "Hinh Vuong";
    }
    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Chieu Dai Canh :" +canh);
        canh = sc.nextFLoat();
    }
    public void tinhChuvi(){
        chuvi = canh*4 ;
    }
    public void tinhDientich(){
        dientich = canh*canh;
    }
}
