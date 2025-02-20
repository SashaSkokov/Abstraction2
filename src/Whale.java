public class Whale extends Mammals{

    public Whale(String ViewWhale, int id, String property) {
        super(ViewWhale, id, property);
        isWool = false;
        isSpine = true;
        isWater = true;

    }

    @Override
    public void isWool() {
        System.out.println(getViewAnimal() + " не имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(getViewAnimal() + " имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(getViewAnimal() + " живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + getViewAnimal() + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
