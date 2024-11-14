package package1;

import java.util.Scanner;

public class var18 {
    public static void main(String[] args) {
        //какое ваше счастливое лицо. если 7 -это тоже мое счастливое число
        // 13 или 24  - это несчастливое число
        // если другое- для вас Х является счастливым числом
        Scanner in = new Scanner(System.in);
        int x = 0;
        System.out.println("Какое ваше счастливое число?");
        x = in.nextInt();
        if ( x == 7)
            System.out.println("Это тоже мое счастливое число");
        else if (x == 13)
            System.out.println("Это несчастливое число ");
        else if (x == 24)
            System.out.println("Это несчастливое число");
            else {
            System.out.println("Для вас это счастливое число");
            //System.out.println(" "+ x );

        }
    }
}
