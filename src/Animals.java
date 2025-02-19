abstract class Animals extends FieldNames implements Features {
    private String nameAnimal;

    public Animals(String nameAnimal){
        this.nameAnimal=nameAnimal;
    }

    public String getViewAnimal(){
        return nameAnimal;
    }
}
