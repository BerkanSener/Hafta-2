import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz: ");
            int taban = scanner.nextInt();

            System.out.print("Üs değerini giriniz: ");
            int us = scanner.nextInt();

            int sonuc = usHesapla(taban, us);
            System.out.println("Sonuç : " + sonuc);

            System.out.print("Devam etmek istiyor musunuz? (E/H): ");
            String devam = scanner.next().toUpperCase();

            if (!devam.equals("E")) {
                System.out.println("Program sonlandırıldı.");
                break;
            }
        }

        scanner.close();
    }

    static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }
}
