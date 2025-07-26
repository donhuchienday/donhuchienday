import java.util.Scanner;

public class Bai_2 {
    public static Scanner sc =  new Scanner(System.in);
    public static void ktra(String s){
        boolean check = true;
        s = s.toLowerCase();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 -i)){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(s.toUpperCase());
            System.out.println("Chuoi nay doi xung!");
        }
        else{
            System.out.println("Chuoi nay khong doi xung");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap mot chuoi:");
        String chuoi;
        chuoi = sc.nextLine().trim();
        ktra(chuoi);
    }
}
