package simbirsoft.eshevtsova.animals;

public class Animals {
    private static String ourClass = "Я отношусь к классу Животные";
    private String name;
    private String breed;
    public String sayBreed(){
        System.out.println(breed);
        return breed;
    }
    public void sayName(){
        System.out.print ("Меня зовут " + name + ". Порода ");
    }
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
