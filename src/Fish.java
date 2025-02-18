public class Fish implements Features{

    private String nameFish;
    private boolean isWool;
    private boolean isSpine;
    private boolean isWater;

    public Fish(String nameFish){
        this.nameFish = nameFish;
        isWool = false;
        isSpine = false;
        isWater = true;
    }

    @Override
    public void isWool() {
        System.out.println(nameFish + " не имеет шерсти");
    }

    @Override
    public void isSpine() {
        System.out.println(nameFish + " не имеет позвоночника");
    }

    @Override
    public void isWater() {
        System.out.println(nameFish + " живёт в воде");
    }

    @Override
    public void display() {
        System.out.println("Вид: " + nameFish + "\nИмеет шерсть: " + isWool + "\nИмеет позвоночник: 3" + isSpine + "\nЖивёт в воде: " + isWater);
    }


}
