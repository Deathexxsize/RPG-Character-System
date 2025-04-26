package org.example.controller;

import java.util.Scanner;

public class AuthorizationMenu {
    private final RegisterMenu registerMenu = new RegisterMenu();
    private final SignInMenu signInMenu = new SignInMenu();

    public void authorizationMenu() {
        System.out.println(
                "\n\n\n\n╔════════════════════╗\n" +
                        "║   ⚔️ RPG GAME ⚔️   ║\n" +
                        "╚════════════════════╝"
        );

        System.out.print("\n\n1. Войти в акканут\n2. Регистрация");

        System.out.print("\nВыбрать: ");
        int choose = new Scanner(System.in).nextInt();

        switch (choose) {
            case 1:
                signInMenu.signIn();
            break;
            case 2:
                registerMenu.registration();
            break;
            default:
                System.out.println("Не верное значение. Попробуйте снова");

        }
    }
}
