import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[5];
        System.out.println("Nhap mang 5 so nguyen");
        int tong = 0;
        int max = arr[0];
        for(int i = 0 ; i < 5; i++){
            System.out.print("Nhap phan tu thu " + i + " : " );
            arr[i] = sc.nextInt();
            tong += arr[i];
            if(max < arr[i]) max = arr[i];
        }
        System.out.print("Cac phan tu vua nhap la: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.println("Tong cac phan tu trong mang la: " + tong);
        System.out.print("Max cua cac phan tu trong mang la: " + max);

    }
}
