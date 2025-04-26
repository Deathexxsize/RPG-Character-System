package org.example.controller;

import java.util.Scanner;

public class SignInMenu {
    private final Scanner scanner = new Scanner(System.in);

    public void signIn() {
        System.out.println(
                "\n\n\n\n╔═════════════════════════════════════╗\n" +
                        "║   ⚔️ В Х О Д  В  А К К А У Н Т ⚔️   ║\n" +
                        "╚═════════════════════════════════════╝"
        );

        System.out.print("\nВведите никнейм: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
    }
}
