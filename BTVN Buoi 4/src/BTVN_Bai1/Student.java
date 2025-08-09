package BTVN_Bai1;

import java.time.Year;

public class Student {
    private String name;
    private int namSinh;
    private String address;
    private double tx1;
    private double tx2;
    private  double Kthp;
    private  int SoTietNghi;
    public Student(String name, int namSinh, String address , double tx1, double tx2, double Kthp, int SoTietNghi){
        this.name = name;
        this.namSinh = namSinh;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.Kthp = Kthp;
        this.SoTietNghi = SoTietNghi;
    }
    public String getname(){
        return name;
    }
    public int gettuoi(){
            int namhientai = Year.now().getValue();
            return namhientai - namSinh;
    }
    public double getGPA(){
        return (tx1*0.2 + tx2 * 0.3 + Kthp* 0.5);
    }
    public String getAddress(){
        return address;
    }
    public double getTx1(){
        return tx1;
    }
    public double getTx2(){
        return tx2;
    }
    public double getKthp(){
        return Kthp;
    }
    public int getSoTietNghi(){
        return SoTietNghi;
    }
}
