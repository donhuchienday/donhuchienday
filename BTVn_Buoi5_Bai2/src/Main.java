import java.util.ArrayList;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<PhongMay> phongMays = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String tiepTuc;


        do {
            System.out.println("Nhap thong tin phong may:");
            PhongMay pM = new PhongMay();
            pM.Nhap();
            phongMays.add(pM);
            System.out.print("Ban muon nhap phong may khac khong(y/n): ");

            tiepTuc = sc.nextLine().trim().toLowerCase();
            System.out.println("----------------------------------------------");
        } while (tiepTuc.equalsIgnoreCase("y"));

        System.out.println("\nDanh sach phong may vua nhap:");
        for (PhongMay pm : phongMays) {
            pm.Xuat();
        }

    }
}