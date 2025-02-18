public class Whale extends Mammals{
    private String ViewWhale;
    private String nameAnimal;
    private boolean isWool;
    private boolean isSpine;
    private boolean isWater;

    public Whale(String nameAnimal, String ViewWhale) {
        super(nameAnimal);
        this.ViewWhale = ViewWhale;
        this.nameAnimal = nameAnimal;
        isWool = true;
        isSpine = true;
        isWater = false;
    }

    @Override
    public void isWool() {
        System.out.println(ViewWhale + " имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(ViewWhale + " имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(ViewWhale + " не живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид дельфина: " + ViewWhale + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
