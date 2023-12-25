public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        double harmonicSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        double harmonicAverage = numbers.length / harmonicSum;

        System.out.println("Dizinin harmonik ortalaması: " + harmonicAverage);
    }
}
