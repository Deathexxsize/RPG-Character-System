package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.CharacterTypes.CharacterType;

import java.util.Timer;
import java.util.TimerTask;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int level;
    private int health;
    private int mana;
    private int power;

    @Enumerated(EnumType.STRING)
    private CharacterType characterType;

    // private Player player;

    public Character(CharacterType characterType) {
        this.characterType = characterType;
        this.level = characterType.getLevel();
        this.health = characterType.getHealth();
        this.mana = characterType.getMana();
        this.power = characterType.getPower();
    }

    public void heal(int amount) {
        this.health += amount;
        System.out.println("Восстановлено "+ amount +"HP. Текущее значение " + health + "HP");
    }

    public void restoreMana(int amount) {
        this.mana += amount;
        System.out.println("Восстановлено " + amount + " маны. Текущее кол-во " + mana + "маны");
    }

    public void addBuff(int amount, int duration) {
        this.power += amount;
        System.out.println("+" + amount + " силы на 15 сек");

        startTimer(() -> {
            System.out.println("Зелье силы прошло. Теперь у вас " + power + " силы");
        }, duration);
    }

    public void lvlUp(int amount) {
        this.level += amount;
        System.out.println("поздравляю +" + amount + " lvl. Теперь у вас " + level + " lvl");
    }

    public void startTimer(Runnable action, int second) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                action.run();
                timer.cancel();
            }
        }, second * 1000L);
    }

}
