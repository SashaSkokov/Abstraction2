public class Bear extends Mammals{

    public Bear(String ViewBear) {
        super(ViewBear);
        isWool = true;
        isSpine = true;
        isWater = false;
    }

    @Override
    public void isWool() {
        System.out.println(super.getViewAnimal() + " имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(super.getViewAnimal() + " имеет позвоночник");
    }

    @Override
    public void isWater() {
        System.out.println(super.getViewAnimal() + " не живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + super.getViewAnimal() + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
