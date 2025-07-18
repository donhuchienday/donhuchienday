import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void BacCC() {
        System.out.print("Hay nhap ho ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Xin Chao " + name);
        System.out.print("Hay nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();
        System.out.println(name + " " + tuoi);
        sc.nextLine();
    }

//    public static int Theanh(int a, int b) {
//
//        a = sc.nextInt();
//        b = sc.nextInt();
//        System.out.print("a= ");
//        System.out.println(a);
//        System.out.print("b= ");
//        System.out.println(b);
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a . b = " + (a * b));
//        System.out.println("a / b = " + (a + b));
//        System.out.println("a % b = " + (a % b));
//    }

//    public static int vonglap(int arr[], int n) {
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int tong = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.print("a[" + i + "]= ");
//            arr[i] = sc.nextInt();
////            sc.nextInt();
//            tong += arr[i];
//
//        }
//        System.out.println("Tong= " + tong);
//        for (int i = 0; i < n; i++) {
//            System.out.println("a[" + i + "]= " + arr[i]);
//        }
//    }
public static int baccho(int a, int b){

    sc.nextLine();
    return a+b;
}

    public static void main(String[] args) {
        BacCC();
        int sum = baccho(4,5);
        System.out.println(sum);

    }
}
