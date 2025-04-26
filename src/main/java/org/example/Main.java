package org.example;

import org.example.controller.AuthorizationMenu;
import org.example.entity.Character;
import org.example.entity.Player;
import org.example.enums.CharacterTypes.CharacterType;

public class Main {
    public static void main(String[] args) {
        AuthorizationMenu authorizationMenu = new AuthorizationMenu();
        authorizationMenu.authorizationMenu();
    }
}