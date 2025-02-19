public class Bear extends Mammals{

    public Bear(String ViewBear) {
        super(ViewBear);
        ViewAnimal = ViewBear;
        isWool = true;
        isSpine = true;
        isWater = false;
    }

    @Override
    public void isWool() {
        System.out.println(ViewAnimal + " имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(ViewAnimal + " имеет позвоночник");
    }

    @Override
    public void isWater() {
        System.out.println(ViewAnimal + " не живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + ViewAnimal + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
