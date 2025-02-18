
public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Краснопёрка");

        fish.isWater();
        fish.display();
        System.out.println("___________");
        Bear bear = new Bear("Белый медведь");

        bear.isSpine();
        bear.display();
        System.out.println("___________");
        Whale whale = new Whale("Косатка");

        whale.isWater();
        whale.display();
        System.out.println("___________");

    }
}