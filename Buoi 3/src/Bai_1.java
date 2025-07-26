import java.util.Scanner;

public class Bai_1 {

    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE   = "Circle";
    public static final Double PI = 3.1415;
    public static Scanner sc = new Scanner(System.in);

    public static void AreaSquare(){
        System.out.print("Nhap canh cua vien gach: ");
        double  canh = sc.nextDouble();
        System.out.println("Dien tich cua vien gach la: " + canh * canh);

    }

    public static void AreaTriangle(){
        System.out.print("Nhap chieu cao cua cua vien gach: ");
        double chieucao = sc.nextDouble();
        System.out.print("Nhap canh day cua cua vien gach: ");
        double canhday = sc.nextDouble();
        System.out.println("Dien tich cua vien gach la: " + (1/2)*(canhday*chieucao));
    }

    public static void AreaCircle(){
        System.out.print("Nhap ban kinh cua vien gach: ");
        double  R = sc.nextDouble();
        System.out.println("Dien tich cua vien gach la: " + PI*Math.pow(R,2));

    }

    public static void main(String[] args) {
        System.out.print("Nhap hinh dang cua vien gach: ");
        String type = sc.nextLine();
        if(type.equalsIgnoreCase(SQUARE)){
            System.out.println("Hinh dang vien gach la hinh vuong");
             AreaSquare();
        }
        else if(type.equalsIgnoreCase(TRIANGLE)) {
            System.out.println("Hinh dang vien gach la hinh tam giac");
            AreaTriangle();
        }
        else if(type.equalsIgnoreCase(CIRCLE)){
            System.out.println("Hinh dang vien gach la hinh tron");
            AreaCircle();
        }
        else System.out.println("Hình dạng không hợp lệ!");
    }
}
