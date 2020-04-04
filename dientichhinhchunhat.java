package dientichhinhchunhat;


import java.util.Scanner;
 
public class dientichhinhchunhat{
    protected double chieuDai, chieuRong, dienTich;
    Scanner scanner = new Scanner(System.in);
     
    public void nhap() {
        do {
            System.out.println("Nhập chiều dài hình chữ nhật: ");
            chieuDai = scanner.nextDouble();
            System.out.println("Nhập chiều rộng hình chữ nhật: ");
            chieuRong = scanner.nextDouble();
        } while (chieuDai < chieuRong);
    }
     
    public void hienThi(double dai, double rong) {
        System.out.println("Chiều dài  và chiều rộng của hình chữ nhật lần lượt là "
                + chieuDai + " và " + chieuRong);
    }
     
     
    public double tinhDienTich(double dai, double rong) {
        dienTich = dai * rong;
        return dienTich;
    }
     
    public void hienThiDienTich(double dt) {
        System.out.println("Diện tích hình chữ nhật = " + dt);
    }
    
    public static void main(String[] args) {
    	dientichhinhchunhat dientichhcn = new dientichhinhchunhat();
         
        // nhập chiều dài và chiều rộng hình chữ nhật
    	dientichhcn.nhap();
         
        // hiển thị chiều dài và chiều rộng
    	dientichhcn.hienThi(dientichhcn.chieuDai, dientichhcn.chieuRong);
         
        // tính diện tích
        double dienTich = dientichhcn.tinhDienTich(dientichhcn.chieuDai, dientichhcn.chieuRong);
         
        // hiển thị chu vi và diện tích
        dientichhcn.hienThiDienTich(dienTich);
    }
 
}