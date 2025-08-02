import BTVN_Bai1.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Nguyen Van A", 2006, "HaNoi", 9, 8, 7, 0),
                new Student("Nguyen Van B", 2005, "PhuTho", 7, 8, 9, 1),
                new Student("Nguyen Van C", 2005, "HaNam", 7.8, 8, 7.6, 0),
                new Student("Nguyen Van D", 2005, "HaNam", 7.8, 9, 7.6, 4),
                new Student("Nguyen Van E", 2005, "HaNam", 5, 4, 8.6, 2),
        };
        System.out.printf("%-15s%-10s%-15s%-12s%-12s%-14s%-10s%-12s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");

        // Dữ liệu từng sinh viên
        Student[] Student;
        for (Student s : students) {
            System.out.printf("%-15s%-10d%-15s%-12.2f%-12.2f%-14.2f%-15.2f%-12d\n",
                    s.getname(), s.gettuoi(), s.getAddress(), s.getTx1(), s.getTx2(), s.getKthp(), s.getGPA(), s.getSoTietNghi());
        }
    }
}
