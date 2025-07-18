import java.util.Scanner;

//1. Nhập, Xuất, Kiểu Dữ liệu
//Bài tập: Viết chương trình yêu cầu người dùng nhập tên, tuổi và chiều cao. Sau đó in ra thông tin theo định dạng:
//
//Xin chào [Tên], bạn [tuổi] tuổi và cao [chiều cao] mét.


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        System.out.println("Nhap chieu cao(vd: 1,67): ");
        double height = sc.nextDouble();
        System.out.print("Xin chào " + name + ", bạn "+ age+ " tuổi và cao "+ height + " mét.");
    }
}
