public class Fish extends Animals implements Features{


    public Fish(String nameFish, int id, String property){
        super(nameFish, id, property);
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

    @Override
    public boolean equals(Object object){
        if(object == this) return true;
        else if(object == null || object.getClass() != this.getClass()) return false;
        Fish animal = (Fish) object;
        return id==animal.id
                && (nameAnimal == animal.nameAnimal
                || (nameAnimal != null && nameAnimal.equals(animal.getViewAnimal())))
                && (property == animal.property || (property != null && property.equals(animal.property)
                ));
     }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 17;
        result = prime * result + ((nameAnimal == null) ? 0 : nameAnimal.hashCode());
        result = prime * result + id;
        result = prime * result + ((property == null) ? 0 : property.hashCode());
        return result;
    }


}
