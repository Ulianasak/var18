package package1;

import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        //ежемесячно 5 лет.
        //консольное меню через которое расходы за год,сколько осталось заплатить.сколько месяцев осталось
        // выплачивать.сколько переплата.если ставка 20%
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кредита ");
        int credit = scanner.nextInt();
        int month = credit / (5 * 12); //мес
        int payment = month * 5 * 12; //
        int Interest = payment - credit; //общая сумма пр
        int months = 5 * 12;
        System.out.println("сумма ежемесячного платежа" + month);
        while (true) {
            System.out.println("консоль:");
            System.out.println("1. расходы ");
            System.out.println("2.оставшаяся сумма");
            System.out.println("3.сколько осталось месяцев платить");
            System.out.println("4.переплата");
            System.out.println("5. выход ");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("введите сумму расходов ");
                    int expenses = scanner.nextInt();
                    payment -= expenses;
                    months = 12;
                    break;
                case 2:
                    System.out.println("сумма кредита" + payment);
                    break;
                case 3:
                    System.out.println("оставшиеся месяцы" + months);
                    break;
                case 4:
                    System.out.println("переплата" + Interest);
                    break;
                case 5:
                    System.out.println("выход");
                    break;


            }
        }


    }
  }









