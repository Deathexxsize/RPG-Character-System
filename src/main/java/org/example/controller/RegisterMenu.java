package org.example.controller;

import java.util.Scanner;

public class RegisterMenu {
    private final Scanner scanner = new Scanner(System.in);

    public void registration() {
        System.out.println(
                "\n\n\n\n╔═════════════════════════════════╗\n" +
                        "║   🛡️ Р Е Г И С Т Р А Ц И Я 🛡️   ║\n" +
                        "╚═════════════════════════════════╝"
        );

        System.out.print("\nПридумайте никнейм: ");
        String username = scanner.nextLine();
        System.out.print("Введите ваш email: ");
        String email = scanner.nextLine();
        System.out.print("Придумайте пароль: ");
        String password = scanner.nextLine();
    }
}
