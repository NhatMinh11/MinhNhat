import java.util.Scanner;

public class TMN719Person {
    public static void main(String[] args){
        public int tuoi;
        public float chieucao;
        public  double cannang;
        public void nhapthongtin(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap thong tin doi tuong:");
            sc.tuoiInt();
            sc.chieucaoFloat();
            sc.cannangDouble();
        }
        public void xuatThongtin(){
            System.out.println("Tuoi la:" +tuoi);
            System.out.println("Chieu cao la" +cannang);
            System.out.println("Chieu cao la :" +cannang);
        }
    }
}
    