package simbirsoft.eshevtsova.animals;

public class Amphibians extends Animals {

    public void runCircle(){

        int circle = 7;

        for (int i=1; i<=circle; i++) {
            System.out.println("Я пробежала круг " + i);
        }
    }
}
