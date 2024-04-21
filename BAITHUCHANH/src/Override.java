public class HinhTron {
    public void xuatThongtin(){
        System.out.println("Day La Hinh Tron");
    }
}
public class HinhTru extends HinhTron{
    Override
    public void xuatThongtin(){
        System.out.println("Day La Hinh Tru");
    }
}
public class Override {
    public static void main(String[] args){
        HinhTron hinhTron = new HinhTron();
        HinhTru hinhTru = new HinhTru();
        hinhTron.xuatThongtin();
        hinhTru.xuatThongtin();
    }
}