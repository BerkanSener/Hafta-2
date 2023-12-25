public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    public static boolean isWhoStart() { // ilk hamleyi kim yapacak?
        double randomNumber = Math.random() * 100;
        return randomNumber >= 50;
    }

    public boolean isDodge() { // Rakibi bloklayabilir mi?
        double randomValue = Math.random() * 100; // Rastgele bir sayı üretiyoruz.
        return randomValue <= this.dodge;
    }
}
