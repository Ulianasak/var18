package package1;

import java.util.Random;
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        //случайное число от 0 до 10
        Scanner in = new Scanner(System.in);
                int x = 0;
        System.out.println("Введите код");
        x = in.nextInt();

        Random random = new Random();
        int  code ;
        int pilot;

         while (true){
             code = random.nextInt(10);
             System.out.println("на орбите ");
             pilot = random.nextInt(10);
             if (pilot == code) {
                 System.out.println("пилот угадал");
                 break;
             }
         }

    }
}
