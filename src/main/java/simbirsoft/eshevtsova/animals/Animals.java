package simbirsoft.eshevtsova.animals;
public abstract class Animals {
    private static final String OUR_CLASS = "Я отношусь к классу Животные";
    protected String name;
    protected String breed;
    public abstract void sayBreed();
    public abstract void sayName();
    public abstract void character();
    static void sayClass(){
        System.out.println(OUR_CLASS);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

