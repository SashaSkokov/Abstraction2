public class Whale extends Mammals{

    public Whale(String ViewWhale) {
        super(ViewWhale);
        ViewAnimal = ViewWhale;
        isWool = false;
        isSpine = true;
        isWater = true;
    }

    @Override
    public void isWool() {
        System.out.println(ViewAnimal + " не имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(ViewAnimal + " имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(ViewAnimal + " живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + ViewAnimal + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
