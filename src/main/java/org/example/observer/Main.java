package org.example.observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        UserData userData = new UserData();
        FirstObserver firstObserver = new FirstObserver(userData);
        SecondObserver secondObserver = new SecondObserver(userData);

        while (true) {
            System.out.print("Введите ваше имя чтобы наблюдатели узнали о вас: ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("stop")) {
                System.out.println("End of program");
                break;
            } else {
                userData.setName(name);
            }
        }

        scanner.close();
    }
}