package simbirsoft.eshevtsova.animals;

import java.util.Random;
import java.util.Scanner;

public class Birds extends Animals {

    public void eatGrain() {

        int[] days = new int[7];
        Scanner countDays = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < days.length; i++) {
            days[i] = random.nextInt(10);
            System.out.println("День " + (i + 1) + ". Съедено зерен: " + days[i]);
        }
        int sumGrains = 0;

        for (int i = 0; i < days.length; i++) {
            sumGrains = sumGrains + days[i];
        }
        System.out.println("Съедено зерен за неделю: " + sumGrains);
    }
}
