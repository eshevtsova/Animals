package simbirsoft.eshevtsova.animals;

public abstract class Animals {
    private static String ourClass = "Я отношусь к классу Животные";
    protected static String name;
    protected static String breed;
    public abstract String sayBreed();
    public abstract void sayName();
    static void sayClass(){
        System.out.println(ourClass);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
