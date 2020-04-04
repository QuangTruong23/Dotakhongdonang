package triangleArea;

import java.util.Scanner;

public class triangleArea {
	private static Scanner nhap;
	static double dienTichTamGiac(double a,double b, double c)
    {
        float p=(float)(a+b+c)/2;
        float s;
        s=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
      public static void main(String[] args) {
          double Stamgiac;     
        nhap = new Scanner(System.in);
        System.out.print("nhập a=");
        double a = nhap.nextDouble();
        System.out.print("nhập b=");
        double b = nhap.nextDouble();
        System.out.print("nhập c=");
        double c = nhap.nextDouble();
        Stamgiac=dienTichTamGiac(a,b,c);
        System.out.println("Diện tích hình tam giác là :"+Stamgiac);
    }
}
