import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " sayısı ASAL değildir !");
        } else {
            if (asalMi(sayi)) {
                System.out.println(sayi + " sayısı ASALDIR !");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir !");
            }
        }

        scanner.close();
    }

    static boolean asalMi(int sayi) {
        return asalMiHelper(sayi, sayi / 2);
    }

    static boolean asalMiHelper(int sayi, int bolen) {
        if (bolen <= 1) {
            return true;
        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return asalMiHelper(sayi, bolen - 1);
            }
        }
    }
}
