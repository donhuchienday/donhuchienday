import java.util.Scanner;

public class School {
    private String name;
    private  String date;
    Scanner sc = new Scanner(System.in);
    public  School(){
    }

    public School(String name, String date) {
        this.name = name;
        this.date = date;
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
    public void InputSchool(){
        System.out.print("Nhap ten truong: ");
        name = sc.nextLine();
        System.out.print("Nhap ngay vao truong: ");
        date = sc.nextLine();

    }
    public void OutputSchool(){
        System.out.println("Ten truong:" +  name);
        System.out.println("Ngay vao truong:" + date);
    }
}
