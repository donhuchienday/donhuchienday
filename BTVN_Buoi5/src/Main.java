import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap sinh vien thu "+ (i+1)+  ":");
            students[i]= new Student();
            students[i].InputStudent();
            System.out.println("---------------------------------------------");
        }
        System.out.printf("%40s \n","Danh sach thong tin sinh vien");


        System.out.printf("|%-20s | %-12s | %-8s | %-15s | %-15s | %-15s |%-15s |\n","TenSV", "Tenlop", "Diem", "TenKhoa" , "Ngay vao khoa", "TenTruong" , "Ngay vao truong");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        for( Student s: students){

            System.out.printf("|%-20s | %-12s | %-8.2f | %-15s | %-15s | %-15s | %-14s |\n",s.getName(), s.getClasss(), s.getScore(), s.getY().getName() , s.getY().getDate(), s.getY().getX().getName() , s.getY().getX().getDate() );


        }
    }
}