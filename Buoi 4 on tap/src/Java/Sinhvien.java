package Java;

public class Sinhvien {
    private  String maSinhVien;
    public String name;
    protected  int age;// chi duoc su dung trong cung 1 package
    // trong cung 1 package co the su dung protected nhu 1 packgage
    int diem;//  khong khuyen khich dung

    public Sinhvien(){


    }

    public Sinhvien(String naSinhVien, String name, int age, int diem) {
        this.maSinhVien = maSinhVien;
        this.age = age;
        this.name = name;
        this.diem = diem;
    }

    public String getMaSinhVien(){
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }

}

