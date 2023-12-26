import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int sayi = 5;
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min && sayi<i) {
                min = i;

            }  if (i > max && sayi>i) {
                max = i;

            }
           }
                System.out.println("Minimun Değer " + min);
                System.out.println("Maximum Değer " + max);
            }
        }

