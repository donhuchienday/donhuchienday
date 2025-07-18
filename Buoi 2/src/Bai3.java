import java.util.Scanner;

public class Bai3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            for(int i = 0 ; i < 5; i++ ){
                System.out.println("Cap " + (i+1) );
                System.out.print("a= " );
                int a = sc.nextInt();
                System.out.print("b= " );
                int b = sc.nextInt();
                System.out.println("a + b =  " + (a+b) );
                System.out.println("a - b =  " + (a-b) );
                System.out.println("a * b =  " + (a*b) );
                if(b == 0){
                    System.out.println("khong the thuc hien phep chia" );
                }
                else {
                    System.out.println("a / b =  " + (a / b));
                    System.out.println("a % b =  " + (a % b));
                }
                if( a == b) System.out.println("a bang b" );
                else  System.out.println("a khac b" );
            }
            sc.nextLine();
    }
}
