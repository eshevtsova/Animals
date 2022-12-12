package simbirsoft.eshevtsova.animals;

public class AnimalsRunner {
    public static void main(String[] args) {

       Mammals cat = new Mammals();
       Amphibians lizard = new Amphibians();
       Birds falcon = new Birds();

        cat.setName("Кошка");
        cat.setBreed("бенглальская");

        lizard.setName("Ящерица");
        lizard.setBreed("агава бородатая");

        falcon.setName("Птица");
        falcon.setBreed("сокол");

        Commands command = new Commands();

        command.chooseCommand(cat, lizard, falcon);

//        Scanner commands = new Scanner(System.in);

//      while (true) {
//            System.out.println("Выберите отряд животного, с которым хотите работать: 1-млекопитающие; " +
//                    "2-пресмыкающиеся; 3-птицы");
//            System.out.println("Для Выхода нажмите 0");
//
//            int command = commands.nextInt();
//
//            if (command == 1) {
//                mammal.sayName();
//                mammal.sayBreed();
//                mammal.sayClass();
//                mammal.sayAge();
//            } else if (command == 2) {
//                amphibian.sayName();
//                amphibian.sayBreed();
//                amphibian.sayClass();
//                amphibian.runCircle();
//            } else if (command == 3) {
//                bird.sayName();
//                bird.sayBreed();
//                bird.sayClass();
//                bird.eatGrain();
//            } else if (command == 0) {
//                break;
//            } else {
//                System.out.println("Вы выбрали неверный отряд!");
//                break;
//            }
//        }
    }
}
