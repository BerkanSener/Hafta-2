public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Doruk", 15, 90, 80, 50);
        Fighter f2 = new Fighter("Derin", 10, 120, 80, 30);

        Match match = new Match(f1, f2, 60, 80);

        match.run();
    }
}