package Java;

public class lophoc  {
    public static void main(String[] args) {
        Sinhvien b = new Sinhvien();
        b.age = 15;
        Sinhvien c = new Sinhvien("2024602188", "Donhuchien", 18, 10);
        System.out.println(c.name);
        c.setMaSinhVien("hjkjhghjk");
        System.out.println(c.getMaSinhVien());

    }
}
