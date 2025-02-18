public class Cat extends Mammals{
    private String ViewCat;
    private boolean isWool;
    private boolean isSpine;
    private boolean isWater;

    public Cat(String ViewCat) {
        super(ViewCat);
        this.ViewCat = ViewCat;
        isWool = true;
        isSpine = true;
        isWater = false;
    }

    @Override
    public void isWool() {
        System.out.println(ViewCat + " имеет шерсть");
    }

    @Override
    public void isSpine() {
        System.out.println(ViewCat + " имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(ViewCat + " не живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Порода: " + ViewCat + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
