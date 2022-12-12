package simbirsoft.eshevtsova.animals;

import java.util.Scanner;

public class Commands {

    public void chooseCommand(Mammals mammal, Amphibians amphibian, Birds bird){

        System.out.println(mammal.toString());
        System.out.println(amphibian.toString());
        System.out.println(bird.toString());

        Scanner commands = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите отряд животного, с которым хотите работать: 1-млекопитающие; " +
                    "2-пресмыкающиеся; 3-птицы");
            System.out.println("Для Выхода нажмите 0");

            int command = commands.nextInt();

            if (command == 1) {
                mammal.sayName();
                mammal.sayBreed();
                mammal.sayClass();
                mammal.sayAge();
            } else if (command == 2) {
                amphibian.sayName();
                amphibian.sayBreed();
                amphibian.sayClass();
                amphibian.runCircle();
            } else if (command == 3) {
                bird.sayName();
                bird.sayBreed();
                bird.sayClass();
                bird.eatGrain();
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Вы выбрали неверный отряд!");
                break;
            }
        }
    }
}
