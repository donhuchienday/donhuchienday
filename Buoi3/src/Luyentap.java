//import java.util.Scanner;
//public static Scanner sc = new Scanner(System.in);
//public class Luyentap {
//
//
//    public static int[] nhapArr(int n, int []arr) {
//
//
//
//        System.out.println("Nhap cac phan tu cua mang");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        return arr;
//    }
//
//    public static void printArray(int a[], int n) {
//        System.out.println("----------Mang-----------");
//        for (int i = 0; i < n; i++) {
//            System.out.println("a[" + i + "]= " + a[i]);
//        }
//    }
//
//    public static void oddEven(int a[], int n) {
//        int tongodd = 0;
//        int tongle = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] % 2 == 0) tongodd += a[i];
//            else tongle += a[i];
//        }
//        System.out.println("so so chan" + tongodd);
//        System.out.println("so so le" + tongle);
//    }
//    public static boolean checkP(int number){
//        if(number <= 2)
//            return false;
//        for(int i = 2 ; i < Math.sqrt(number); i++ ){
//            if(number %i == 0) return false;
//        }
//        return true;
//    }
//    public static int slPrime(int [] a , int n){
//        int sl = 0;
//
//        for(int x : a{
//         if(checkP(x)) sl++;
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        System.out.println("Nhap so luong phan tu cua mang");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        nhapArr(n, arr);
//        printArray(arr[] , n );
//
//    }
//}
