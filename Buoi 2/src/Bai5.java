public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong cua 5 la: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + "= " + (5 * i));
        }
        System.out.print("\n");
        int tongfor = 0;
        for (int i = 2; i <= 100; i += 2) {
            tongfor += i;
        }
        System.out.println("Tong cac so chan tu 1 den 100: " + tongfor);
        System.out.print("\n");
        int i = 2;
        int tongwhile = 0;
        while (i <= 100) {
            tongwhile += i;
            i += 2;
        }
        System.out.println("Tong cac so chan tu 1 den 100: " + tongwhile);
    }
}
