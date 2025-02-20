
public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Краснопёрка", 1, "Травоядная");

        fish.isWater();
        fish.display();

        Fish fish1 = new Fish("Краснопёрка", 1, "Травоядная");
        Fish fish2 = new Fish("Окунь", 1, "Травоядная");
        System.out.println(fish.equals(fish1));
        System.out.println(fish.equals(fish2));
        /*System.out.println("___________");
        Bear bear = new Bear("Белый медведь", 2, "Хищник");

        bear.isSpine();
        bear.display();
        System.out.println("___________");
        Whale whale = new Whale("Косатка", 3, "Зубатый");

        whale.isWater();
        whale.display();
        System.out.println("___________");*/

    }
}