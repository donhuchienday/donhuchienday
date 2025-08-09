import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School x;

    Scanner sc = new Scanner(System.in);

    public Faculty(){
        x= new School();
    }

    public Faculty(String name, String date, School x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }


    public void InputFaculty(){
        System.out.print("Ten Khoa: ");
        name = sc.nextLine();
        System.out.print("Ngay vao khoa: ");
        date = sc.nextLine();
        x.InputSchool();
    }
    public void OutputFaculty(){
        System.out.println("Khoa: "+ name);
        System.out.println("Ngay vao khoa: "+ date);
        x.OutputSchool();
    }

}
