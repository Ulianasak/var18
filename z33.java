package package1;

import java.util.ArrayList;
import java.util.Scanner;

public class z33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> plans = new ArrayList<>();
        System.out.println("Введите планы до 50");
        for (int i = 0;i<50;i++){
            System.out.println("Планы " +(i + 1) + ":");
            String plan= scanner.nextLine();
            if(plan.isEmpty()) {
                break;
            }
                plans.add(plan);
            }
            System.out.println("\nСписок планов:");
            for (int i =0;i<plans.size();i ++) {
                System.out.println((i + 1) + plans.size());

            }
        }
    }

