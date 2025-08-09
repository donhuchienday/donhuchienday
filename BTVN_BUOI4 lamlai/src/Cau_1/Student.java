package Cau_1;

import java.time.Year;


public class Student {

    private String name;
    private int namSinh;
    private String address;
    private double tX1;
    private double tX2;
    private double kthp;
    private int soTietNghi;




    public Student() {
    }

    public Student(String name, int namSinh, String address, double tX1, double tX2, double kthp, int soTietNghi) {
        this.name = name;
        this.namSinh = namSinh;
        this.address = address;
        this.tX1 = tX1;
        this.tX2 = tX2;
        this.kthp = kthp;
        this.soTietNghi = soTietNghi;
    }

    public double gettX1() {
        return tX1;
    }

    public String getName() {
        return name;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getAddress() {
        return address;
    }

    public double gettX2() {
        return tX2;
    }

    public double getKthp() {
        return kthp;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void settX1(double tX1) {
        this.tX1 = tX1;
    }

    public void settX2(double tX2) {
        this.tX2 = tX2;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public int Tuoi() {
        int namhientai = Year.now().getValue();
        return namhientai - namSinh;
    }

    public double GPA() {
        return (this.tX1 * 0.2 + this.tX2 * 0.3 + this.kthp * 0.5);
    }


    public static void Header() {
        System.out.printf("%-20s %-5s %-15s %-10s %-10s %-10s %-10s %-15s\n",
                "Ten", "Tuoi", "Dia chi", "TX1", "TX2", "KTHP", "GPA", "So tiet nghi");
    }

    // In thông tin sinh viên
    public void display() {
        System.out.printf("%-20s %-5d %-15s %-10.1f %-10.1f %-10.1f %-10.2f %-15d\n",
                name, Tuoi(), address, tX1, tX2, kthp, GPA(), soTietNghi);
    }
}
