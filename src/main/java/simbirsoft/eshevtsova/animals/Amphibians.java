package simbirsoft.eshevtsova.animals;
public class Amphibians extends Animals {
    @Override
    public void sayName(){
        System.out.print ("Меня зовут " + name + ". Порода ");
    }
    @Override
    public void sayBreed(){
        System.out.println(breed);
    }
    @Override
    public void character() {
        System.out.println("Я умею плавать! \n");
    }
    public void runCircle(){

        int circle = 7;
        for (int i=1; i<=circle; i++) {
            System.out.println("Я пробежала круг " + i);
        }
    }
}

