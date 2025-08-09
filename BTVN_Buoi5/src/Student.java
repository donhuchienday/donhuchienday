import java.util.Scanner;

public class Student {
    private String name;
    private String classs;
    private double score;
    private Faculty y;

    Scanner sc = new Scanner(System.in);

    public Student(){
        y = new Faculty();
    }

    public Student(String name, String classs, double score, Faculty y) {
        this.name = name;
        this.classs = classs;
        this.score = score;
        this.y = y;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void InputStudent(){
        System.out.print("Nhap ten sinh vien: ");
        name = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        classs = sc.nextLine();
        System.out.print("Nhap diem so: ");
        score = sc.nextDouble();
        y.InputFaculty();
    }
    public void OutputStudent(){
        System.out.println("Ten sV: "+ name);
        System.out.println("Lop: "+ classs);
        System.out.println("Diem so: "+ score);
        y.OutputFaculty();
    }
}
