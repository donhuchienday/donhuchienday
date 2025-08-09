import Cau_1.Student;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void addStudents(){
            System.out.println("Ho va ten: ");
            String ten = sc.nextLine().trim();
            System.out.println("Nam sinh: ");
            int namsinH = sc.nextInt();
            System.out.println("Dia chi: ");
            String diachi = sc.nextLine();
            System.out.println("TX1: ");
            double tx1 = sc.nextDouble();
            System.out.println("TX2: ");
            double tx2 = sc.nextDouble();
            System.out.println("KTHP: ");
            double KTHP = sc.nextDouble();
            System.out.println("So tiet nghi: ");
            int sotietnghi = sc.nextInt();
            sc.nextLine();
            students.add(new Student(ten, namsinH,diachi,tx1,tx2,KTHP,sotietnghi));
    }
    public static void updateStudents(){
        System.out.println("Nhập tên cần sửa: ");
        String name = sc.nextLine();
        for(Student s: students){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println("Ten moi: ");
                s.setName(sc.nextLine());
                System.out.println("Nam sinh: ");
                s.setNamSinh(sc.nextInt());
                System.out.println("Địa chỉ mới: ");
                s.setAddress(sc.nextLine());
                sc.nextLine();
                System.out.println("TX1: ");
                s.settX1(sc.nextDouble());
                System.out.println("TX2: ");
                s.settX2(sc.nextDouble());
                System.out.println("KTHP: ");
                s.setKthp(sc.nextDouble());
                System.out.println("Số tiết nghỉ: ");
                s.setSoTietNghi(sc.nextInt());
                break;
            }
            System.out.println("Khong tim thay!");
        }
    }
    public static void DeleteStudent(){
        System.out.println("Nhap sv can xoa: ");
        String name = sc.nextLine();

    }
    public static void main(String[] args) {
        Student A = new Student("Do Nhu Chien", 2006, "HaNoi", 8,8,10,0 );
        Student B = new Student("Do Nhu khang", 2007, "PhuTHo", 7,8,9,3 );
        Student C = new Student("Do Nhu Thang", 2008, "HaiDuong", 5,4,8,1 );
        Student D = new Student("Do Nhu Hung", 2001, "HuuBang", 5,3,10,5 );
        Student E = new Student("Do Nhu Anh", 2009, "HuuBang", 9,9,7,2 );

        students.add(A);
        students.add(B);
        students.add(C);
        students.add(D);
        students.add(E);

        Student.Header();
        for(Student s: students ){
            s.display();
        }


    }
}