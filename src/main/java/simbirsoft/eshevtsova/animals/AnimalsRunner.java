package simbirsoft.eshevtsova.animals;

import static simbirsoft.eshevtsova.animals.Commands.chooseCommand;
public class AnimalsRunner {
    public static void main(String[] args) {

        Mammals cat = new Mammals();
        Amphibians lizard = new Amphibians();
        Birds falcon = new Birds();

        cat.setName("Кошка");
        cat.setBreed("Бенглальская");
        lizard.setName("Ящерица");
        lizard.setBreed("Агава бородатая");
        falcon.setName("Птица");
        falcon.setBreed("Сокол");

        chooseCommand(cat, lizard, falcon);
    }
}
