import java.util.Scanner;

public class Bai9Slide96 {
    public static void main(String[] args){
        String chuoi;
        int kyTuHoa = 0;
        int kyTuThuong = 0 ;
        int kyTuSo = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Chuoi : ");
        chuoi = scanner.nextLine();
        for(int i = 0 ; i < chuoi.length() ; i++){
            char kyTu = chuoi.charAt(i);
            if ( kyTu <= '9'){
                ++kyTuSo;
            }else if(kyTu <= 'Z'){
                ++kyTuHoa ;
            }else{
                ++kyTuThuong;
            }
        }
        System.out.println("Ky Tu Hoa : " +kyTuHoa);
        System.out.println("Ky Tu So : " +kyTuSo);
        System.out.println("Ky Tu Thuong : " +kyTuThuong);
        scanner.close();
    }
}
