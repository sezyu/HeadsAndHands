package testovoe;

import java.util.Random;

public class Creatures {

    private int attack;
    private int defense;
    private int health;
    private int minDamage;
    private int maxDamage;
    private final int maxHealth;
    private int damage;

    public Creatures(int attack, int defense, int health, int minDamage, int maxDamage) {
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.maxHealth = health;
    }



    public void statsInfo(){
        System.out.println("Атака: " + attack);
        System.out.println("Защита: " + defense);
        System.out.println("Здоровье: " + health);
        System.out.println("Урон: " + minDamage + "-" + maxDamage + "\n");
    }

    public void hitCreature(Creatures creatures){
        int modAttack = attack - (creatures.defense + 1);
        if (modAttack < 1){
            modAttack = 1;
        }
        System.out.println("Будет брошено кубиков: " + modAttack);
        for (int i = 0; i < modAttack; i++){
            int success = dice();
            System.out.print("На кубике: " + success + " ");
            if (success == 5 || success == 6){
                damage = damage();
                creatures.health -= damage;
                System.out.println("Урон: " + damage);
                if (creatures.health < 1){
                    creatures.health = 0;
                    System.out.println("Существо мертво");
                    return;
                }
            } else {
                System.out.println("Атака провалилась, на кубике выпало: " + success);
            }
        }
        System.out.println("\n");
    }

    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int damage(){
        Random random = new Random();
        return random.nextInt(minDamage, (maxDamage + 1));
    }

    private int dice(){
        Random random = new Random();
        return random.nextInt(1,7);
    }



}










