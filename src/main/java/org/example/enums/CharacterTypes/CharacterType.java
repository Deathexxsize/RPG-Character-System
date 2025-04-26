package org.example.enums.CharacterTypes;

public enum CharacterType {
    WARRIOR(1, 200, 0, 500),       // Воин
    MAGE(1, 135, 500, 150),          // Маг
    ASSASSIN(1, 150, 0, 250),      // Ассассин
    HEALER(1, 150, 250, 75),         // Целитель
    THIEF(1, 175, 0, 100);         // Вор

    private final int level;
    private final int health;
    private final int mana;
    private final int power;

    CharacterType(int level, int health, int mana, int power) {
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.power = power;
    }

    public int getLevel() { return level; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getPower() { return power; }
}
