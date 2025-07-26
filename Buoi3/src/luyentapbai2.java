
import java.util.Scanner;

public class luyentapbai2 {

    public static final double PI = 3.14159265;
    public static Scanner sc = new Scanner(System.in);

    public static void ChuVi(double r){
        System.out.println("Chu vi cua duong tron la: " + 2*PI*r);
        System.out.println("Dien tich cua duong tron la: " + PI* Math.pow(r,2));
    }

    public static void tinhtoan(double r, int k){
        System.out.println(r + " mu " + k + " la: " + Math.pow(r,k));
        System.out.println("can bac 2 cua " + r + " + "   + k   + " la: " + Math.pow(r,k));
        System.out.println("Gia tri tuyet doi " + "|"  + r + " - " +k + " |= " + Math.abs(r-k) );
    }



    public static void main(String [] args){
        double r;
        System.out.print("Nhap ban kinh r: ");
        r = sc.nextDouble();
        int k;
        System.out.print("Nhap so mu k: ");
        k = sc.nextInt();
        ChuVi(r);
        tinhtoan(r,k);

    }

}
