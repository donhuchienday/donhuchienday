import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private  String tenPhong;
    private double dienTich;
    private Quanly x;
    private May[] y;
    private  int n;

    Scanner sc = new Scanner(System.in);

    public PhongMay(){
        x =  new Quanly();
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, Quanly x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public Quanly getX() {
        return x;
    }

    public void setX(Quanly x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Nhap() {
        System.out.print("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.print("Ten phong:");
        tenPhong = sc.nextLine();
        System.out.print("Dien tich: ");
        dienTich = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap thong tin quan ly: ");
        x.Nhap();
        System.out.print("Nhap so may: ");
        n = sc.nextInt();
        System.out.println("----------------------------");
        sc.nextLine();
        y = new May[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap may thu " +(i+1) + ":");
            y[i] = new May();
            y[i].Nhap();
        }

    }


        public void Xuat() {
            System.out.printf("%-10s %-15s %-10s %-10s %-20s %-10s %-10s %-20s\n",
                    "MaPhong", "TenPhong", "DienTich",
                    "MaQL", "HoTenQL",
                    "MaMay", "TenMay", "TinhTrang");

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.printf("%-10s %-15s %-10.2f %-10s %-20s %-10s %-10s %-20s\n",
                            maPhong, tenPhong, dienTich,
                            x.getMaQL(), x.getHoTen(),
                            y[i].getMaMay(), y[i].getTenMay(), y[i].getTinhTrang());
                } else {
                    System.out.printf("%-10s %-15s %-10s %-10s %-20s %-10s %-10s %-20s\n",
                            "", "", "",
                            "", "",
                            y[i].getMaMay(), y[i].getTenMay(), y[i].getTinhTrang());
                }
            }
        }

    }

