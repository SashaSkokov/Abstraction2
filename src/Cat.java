public class Cat extends Mammals{

    public Cat(String ViewCat) {
        super(ViewCat);
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
        System.out.println(super.getViewAnimal() + " имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(super.getViewAnimal() + " не живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Порода: " + super.getViewAnimal() + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
