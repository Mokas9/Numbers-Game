package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число");

        for(int i = 10; i <= 30; i += 10) {
            playLevel(i);
        }
    }

    private static void playLevel(int i){
        int range = i;
        int number = (int) (Math.random() * range);

        while(true){
            System.out.println("");
            System.out.println("Угадате число от 0 до " + range);
            int input_number = scanner.nextInt();
            if(input_number == number){
                System.out.println("Вы угадали число");
                System.out.println("");
                System.out.println("Новый уровень!");
                break;
            }
            else if(input_number > number){
                System.out.println("Заданное число меньше");
            }
            else {
                System.out.println("Заданное число больше");
            }
        }
    }
}

