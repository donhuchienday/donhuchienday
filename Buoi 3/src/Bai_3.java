import java.util.Scanner;

public class Bai_3 {
    public static Scanner sc = new Scanner(System.in);
    public static final String CORRECT = "dung";
    public static final String INCORRECT = "sai";

    public static void tinhtoan(int a,int b, int c) {
        System.out.println("phep toan cua ban la: ");
        System.out.printf("%5d\t+%5d\t=%5d\n", a,b,c);
        String nhap;
        boolean trueorfalse;


        do {
            System.out.print("Du doan ket qua cua phep toan (Dung/Sai): ");
            nhap = sc.nextLine().trim();
            trueorfalse = nhap.equalsIgnoreCase(CORRECT) || nhap.equalsIgnoreCase(INCORRECT);
            if (!trueorfalse) {
                System.out.println("Chi duoc nhap 'Dung' hoac 'Sai'! Moi nhap lai.");
            }
        }while (!trueorfalse);


                if (a + b == c) {
                    if (nhap.equalsIgnoreCase(CORRECT)) {
                        System.out.println("Ban du doan dung!");
                    } else {
                        System.out.println("Ban du doan sai!");
                    }
                } else {
                    if (nhap.equalsIgnoreCase(INCORRECT)) {
                        System.out.println("Ban du doan dung!");
                    } else {
                        System.out.println("Ban du doan sai!");
                    }
                }
        }

    public static void main(String[] args) {
        int a,b,c;
        a = (int) (Math.random()*100);
        b = (int) (Math.random()*100);

        boolean tyledungsai = Math.random()<0.5;


        if(tyledungsai){
            c = a + b;
        }
        else{
            do{
                c = (int) (Math.random()*200);
            }while(c== a+b);
        }

        tinhtoan(a,b,c);
        }
    }

