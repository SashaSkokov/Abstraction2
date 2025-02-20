abstract class Animals extends FieldNames implements Features {
    public String nameAnimal;
    public int id;
    public String property;


    public Animals(String nameAnimal, int id, String property){
        this.nameAnimal=nameAnimal;
        this.id = id;
        this.property = property;
    }

    public String getViewAnimal(){
        return nameAnimal;
    }


}
