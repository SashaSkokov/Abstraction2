public class Bear extends Mammals{
    private String ViewBear;
    private boolean isWool;
    private boolean isSpine;
    private boolean isWater;

    public Bear(String ViewBear) {
        super(ViewBear);
        this.ViewBear = ViewBear;
        isWool = true;
        isSpine = true;
        isWater = false;
    }

    @Override
    public void isWool() {
        System.out.println(ViewBear + " имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(ViewBear + " имеет позвоночник");
    }

    @Override
    public void isWater() {
        System.out.println(ViewBear + " не живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + ViewBear + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
