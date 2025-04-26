package org.example.enums.ItemTypes;

import org.example.entity.Character;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// Типы зельи
public enum PotionType {
    HEALTH("Зелья здоровья", 30, potionEffect.HEALTH, "Восстанавливает здоровье на 50hp", "white"),     // Зелья сдоровья - white
    MANA("Зелье маня", 30, potionEffect.MANA, "Увеличивает ману на 100", "blue"),       // Зелье маны - blue
    STRENGTH("Зелье силы", 15, potionEffect.STRENGTH, "Увеличивает силу на 25", "red"),   // Зелье силы - red
    ELIXIR_OF_ENLIGHTENMENT("Эликсир просветления", 30, potionEffect.ELIXIR_OF_ENLIGHTENMENT, "Улучшает на 1 lvl", "green"); // Эликсир просветления - green

    private final String name;
    private final int duration;
    private final potionEffect effect;
    private final String description;
    private final String color;

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    PotionType(String name, int duration, potionEffect effect, String description, String color) {
        this.name = name;
        this.duration = duration;
        this.effect = effect;
        this.description = description;
        this.color = color;
    }

    public enum potionEffect {
        HEALTH {
           public void apply(Character character) {
               character.heal(50);
           }
        },
        MANA {
            public void apply(Character character) {
                character.restoreMana(100);
            }
        },
        STRENGTH {
            public void apply(Character character) {
                character.addBuff(25, PotionType.STRENGTH.duration);
            }
        },
        ELIXIR_OF_ENLIGHTENMENT {
            public void apply(Character character) {
                character.lvlUp(1);
            }
        }
    }
}
