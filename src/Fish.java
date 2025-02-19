public class Fish extends Animals implements Features{

    public Fish(String nameFish){
        super(nameFish);
        isWool = false;
        isSpine = false;
        isWater = true;
    }

    @Override
    public void isWool() {
        System.out.println(super.getViewAnimal() + " не имеет шерсти");
    }

    @Override
    public void isSpine() {
        System.out.println(super.getViewAnimal() + " не имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(super.getViewAnimal() + " живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + super.getViewAnimal() + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: " + isSpine + "\nЖивёт в воде: " + isWater);
    }


}
