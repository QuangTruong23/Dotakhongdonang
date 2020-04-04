package dientichhinhchunhat;


import java.util.Scanner;
 
public class dientichhinhchunhat{
    protected double chieuDai, chieuRong, dienTich;
    Scanner scanner = new Scanner(System.in);
     
    public void nhap() {
        do {
            System.out.println("chieu dai hinh chu nhat ");
            chieuDai = scanner.nextDouble();
            System.out.println("chieu rong hinh chu nhat ");
            chieuRong = scanner.nextDouble();
        } while (chieuDai < chieuRong);
    }
     
    public void hienThi(double dai, double rong) {
        System.out.println("chieu dai va chieu rong "
                + chieuDai + " vÃ  " + chieuRong);
    }
     
     
    public double tinhDienTich(double dai, double rong) {
        dienTich = dai * rong;
        return dienTich;
    }
     
    public void hienThiDienTich(double dt) {
        System.out.println("dien tich hinh chu nhat = " + dt);
    }
    
    public static void main(String[] args) {
    	dientichhinhchunhat dientichhcn = new dientichhinhchunhat();
         
        // nháº­p chiá»�u dÃ i vÃ  chiá»�u rá»™ng hÃ¬nh chá»¯ nháº­t
    	dientichhcn.nhap();
         
        // hiá»ƒn thá»‹ chiá»�u dÃ i vÃ  chiá»�u rá»™ng
    	dientichhcn.hienThi(dientichhcn.chieuDai, dientichhcn.chieuRong);
         
        // tÃ­nh diá»‡n tÃ­ch
        double dienTich = dientichhcn.tinhDienTich(dientichhcn.chieuDai, dientichhcn.chieuRong);
         
        // hiá»ƒn thá»‹ chu vi vÃ  diá»‡n tÃ­ch
        dientichhcn.hienThiDienTich(dienTich);
    }
 
}