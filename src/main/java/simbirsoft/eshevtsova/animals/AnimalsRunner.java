package simbirsoft.eshevtsova.animals;

import java.util.Scanner;

public class AnimalsRunner {

    public static void main(String[] args) {

        Mammals mammal = new Mammals();
        mammal.setName("Кошка");
        mammal.setBreed("бенглальская");
        Amphibians amphibian = new Amphibians();
        amphibian.setName("Ящерица");
        amphibian.setBreed("агава бородатая");
        Birds bird = new Birds();
        bird.setName("Птица");
        bird.setBreed("сокол");

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
