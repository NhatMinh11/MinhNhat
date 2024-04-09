package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    public HinhChuNhat{
        ten ="Hinh Chu Nhat"; 
    }
    public void nhapDai(){
        System.out.println("Nhap Chieu Dai : ");
        Scanner sc  = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapRong(){
        System.out.prinltn("Nhap Chieu Rong : ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhChuvi(){
        chuvi = (dai + rong) * 2;
    }
    public void tinhDientich(){
        dientich = dai * rong;
    }
}