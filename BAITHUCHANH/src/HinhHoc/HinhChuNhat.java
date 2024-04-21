package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends hinhHoc {
    public float dai,rong;
    public HinhChuNhat{
        ten = "Hinh Chu Nhat";
    }
    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Chieu Dai : " +dai);
        dai = sc.nextFloat;
        System.out.println("Nhap Chieu Rong :" +rong);
        rong = sc.nextFloat;
    }
    public void tinhChuvi(){
        chuvi = (dai+rong)*2;
    }
    public void tinhDientich(){
        dientich = dai * rong;
    }
}
