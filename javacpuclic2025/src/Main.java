import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Xin chào " + name);
    }
}
System.out.println("Hello World"); // Xuống dòng
System.out.print("Hello");         // Không xuống dòng