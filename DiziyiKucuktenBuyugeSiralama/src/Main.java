import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu: ");
        int size = scanner.nextInt();

        // Diziyi oluşturma
        int[] array = new int[size];

        // Kullanıcıdan dizinin elemanlarını alma
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            array[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(array);

        // Sıralı diziyi ekrana bastırma
        System.out.print("Sıralama: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
