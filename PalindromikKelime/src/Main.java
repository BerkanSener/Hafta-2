import java.util.Scanner;
public class Main {

    static boolean isPalindrone(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse))
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Bir Kelime Girin: ");
        String word = input.nextLine().toUpperCase();

        if (isPalindrone(word)) {
            System.out.println("Palindromik kelimedir.");
        } else {
            System.out.println("Palindromik kelime değildir.");

        }
    }
}
