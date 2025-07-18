package Bai6cuoi;

import java.util.Scanner;

public class Bai6huhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        double tonggpa = 0;
        double max = -1;
        int indexmax = 0;

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Sinh vien thu " + (i + 1) + ": ");
            System.out.print("Ten: ");
            students[i].name = sc.nextLine();
            System.out.print("Tuoi: ");
            students[i].age = sc.nextInt();
            System.out.print("Điem TB: ");
            students[i].gpa = sc.nextDouble();
            sc.nextLine();

            tonggpa += students[i].gpa;

            if (max < students[i].gpa) {
                max = students[i].gpa;
                indexmax = i;
            }
        }

        System.out.println("--Danh sach sinh vien--");
        for(Student s : students ){
            System.out.println("Ten: "+ s.name + " | Tuoi: " + s.age + " | GPA: " + s.gpa);
        }

        System.out.println("Diem trung binh ca lop: " + (tonggpa /n));
        System.out.println("Sinh vien co diem cao nhat: " + students[indexmax].name + " - " + students[indexmax].gpa );


    }
}
