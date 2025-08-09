import java.util.Scanner;

public class Quanly {
    private String maQL;
    private String hoTen;

    Scanner sc = new Scanner(System.in);

    public Quanly() {

    }

    public Quanly(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void Nhap(){
        System.out.print("Nhap ma quan ly: ");
        maQL = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma quan ly: " + maQL);
        System.out.println("Ho va ten: "+ hoTen);
    }
}
