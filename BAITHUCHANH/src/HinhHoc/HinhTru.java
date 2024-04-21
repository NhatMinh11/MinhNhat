package HinhHoc;

import java.util.Scanner; 

public class HinhTru extends HinhTron {
    public float chieucao;
    public HinhTru{
        ten = "Hinh Tru"
    }
    public nhapChieucao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Chieu Cao : " +chieucao);
        chieucao = sc.nextFloat;
    }
    public void tinhThetich(){
        thetich = dientich*chieucao;
    }
}
