package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = s.nextLine();
        s.close();

        switch(day)
        {
            case "Воскресенье":
                System.out.println(0);
                break;
            case "Понедельник":
                System.out.println(1);
                break;
            case "Вторник":
                System.out.println(2);
                break;
            case "Среда":
                System.out.println(3);
                break;
            case "Четверг":
                System.out.println(4);
                break;
            case "Пятница":
                System.out.println(5);
                break;
            case "Суббота":
                System.out.println(6);
                break;
        }
    }
}
