package simbirsoft.eshevtsova.animals;

import java.util.Scanner;
public class Mammals extends Animals {
    private static final String VOICE = "У меня есть шерсть! \n";
    @Override
    public void sayName(){
        System.out.print ("Меня зовут " + name + ". Порода ");
    }
    @Override
    public void character() {
        System.out.println(VOICE);
    }
    @Override
    public void sayBreed(){
        System.out.println(breed);
    }
    public void sayAge() {

        int age;
        Scanner ageMamal = new Scanner(System.in);

        System.out.println("Введи сколько мне лет: от 0 до 25 лет");
        age = ageMamal.nextInt();

        if (age >=0 && age <= 5) {
            System.out.println("Я еще молодая");
        } else if (age > 5 && age <= 10){
            System.out.println("Я уже взрослая");
        } else if (age > 10 && age <=25) {
            System.out.println("Я уже старая");
        } else {
            System.out.println("Кошки столько не живут!");
        }
    }
}
