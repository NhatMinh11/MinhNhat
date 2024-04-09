package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
public float banKinh;
public HinhTron(){
    ten ="Hinh Tron";
    public void nhapBankinh(){
        System.out.println("Ban Kinh La :");
        Scanner scanner  = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }
    public void tinhChuvi{
        Chuvi = 2 * Pi * banKinh;
    }
    public void tinhDientich{
        Dientich = Pi * banKinh *banKinh;
    }
}
}