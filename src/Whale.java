public class Whale extends Mammals{
    private String ViewWhale;
    private boolean isWool;
    private boolean isSpine;
    private boolean isWater;

    public Whale(String ViewWhale) {
        super(ViewWhale);
        this.ViewWhale = ViewWhale;
        isWool = false;
        isSpine = true;
        isWater = true;
    }

    @Override
    public void isWool() {
        System.out.println(ViewWhale + " не имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(ViewWhale + " имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(ViewWhale + " живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + ViewWhale + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
