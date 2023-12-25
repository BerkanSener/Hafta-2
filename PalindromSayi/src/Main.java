import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }

    static boolean isPalindrom(int sayi) {
        int tersSayi = 0, originalSayi = sayi;

        while (sayi > 0) {
            int birlerBasamagi = sayi % 10;
            tersSayi = tersSayi * 10 + birlerBasamagi;
            sayi /= 10;
        }

        return originalSayi == tersSayi;
    }
}
