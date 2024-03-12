  import java.util.Scanner;

    class hinhTron{
        private double banKinh, chuVi ,dienTich;
        private final double Pi = 3,14f;
        public hinhTron(double banKinh){
            this.banKinh = banKinh;
        }
        public void tinhchuVi(){
            this.chuVi = Pi*2*banKinh;
        }
        public void tinhdienTich(){
            this.dienTich = Pi*dienTich*dienTich;
        }
        public void inThongTin(){
            System.out.println("Chu vi la : "+String.format("%.2f",this.chuVi));
            System.out.println("Dien tich la : "+String.format("%.2f",this.dienTich));
        }
    }
    public class HinhTron{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out("Nhap Ban Kinh : ");
        hinhTron hinhtron = new hinhTron(sc.nextDouble());
        hinhtron.tinhchuVi();
        hinhtron.tinhdienTich();
        hinhtron.inThongTin();
    }
    }