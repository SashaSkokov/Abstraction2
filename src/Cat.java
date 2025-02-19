public class Cat extends Mammals{


    public Cat(String ViewCat) {
        super(ViewCat);
        ViewAnimal = ViewCat;
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
        System.out.println(ViewAnimal + " имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(ViewAnimal + " не живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Порода: " + ViewAnimal + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }
}
