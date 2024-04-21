package HinhHoc;

import java.util.Scanner;

public class HinhTron extends hinhHoc {
    public float banKinh;
    public  HinhTron(){
        ten = "Hinh Tron";
    }
    public void NhapBanKinh(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap Ban Kinh : " +banKinh);
        banKinh = sc.nextFloat;
        sc.close();
    }
    public void tinhChuvi(){
        chuvi = 2*Pi*banKinh;
    }
    public void tinhDientich(){
        dientich = Pi*banKinh*banKinh;
    }
}
