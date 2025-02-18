public class Bear extends Mammals{
    private String ViewBear;
    private String nameAnimal;
    private boolean isWool;
    private boolean isSpine;
    private boolean isWater;

    public Bear(String nameAnimal, String ViewBear) {
        super(nameAnimal);
        this.ViewBear = ViewBear;
        this.nameAnimal = nameAnimal;
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
        System.out.println("Вид медведя: " + ViewBear + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
