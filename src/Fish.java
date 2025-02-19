public class Fish extends FieldNames implements Features{

    public Fish(String nameFish){
        ViewAnimal = nameFish;
        isWool = false;
        isSpine = false;
        isWater = true;
    }

    @Override
    public void isWool() {
        System.out.println(ViewAnimal + " не имеет шерсти");
    }

    @Override
    public void isSpine() {
        System.out.println(ViewAnimal + " не имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(ViewAnimal + " живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + ViewAnimal + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: 3" + isSpine + "\nЖивёт в воде: " + isWater);
    }


}
