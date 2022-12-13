package simbirsoft.eshevtsova.animals;

import java.util.Scanner;

import static simbirsoft.eshevtsova.animals.Animals.sayClass;
public class Commands {
        public static void chooseCommand(Mammals mammal, Amphibians amphibian, Birds bird){

            Scanner commands = new Scanner(System.in);

            while (true) {
                System.out.println("Выберите отряд животного, с которым хотите работать: \n1-млекопитающие; " +
                        "\n2-пресмыкающиеся; \n3-птицы");
                System.out.println("Для Выхода нажмите 0");

                int command = commands.nextInt();

                if (command == 1) {
                    mammal.sayName();
                    mammal.sayBreed();
                    sayClass();
                    mammal.sayAge();
                    mammal.character();
                } else if (command == 2) {
                    amphibian.sayName();
                    amphibian.sayBreed();
                    sayClass();
                    amphibian.runCircle();
                    amphibian.character();
                } else if (command == 3) {
                    bird.sayName();
                    bird.sayBreed();
                    sayClass();
                    bird.eatGrain();
                    bird.character();
                } else if (command == 0) {
                    break;
                } else {
                    System.out.println("Вы выбрали неверный отряд!");
                    break;
                }
            }
        }
    }