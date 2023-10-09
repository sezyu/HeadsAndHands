package testovoe;

public class Monster extends Creatures{


    public Monster(int attack, int defense, int health, int minDamage, int maxDamage) {
        super(attack, defense, health, minDamage, maxDamage);
    }

    @Override
    public void hitCreature(Creatures creatures) {
        super.hitCreature(creatures);
    }

    @Override
    public void statsInfo() {
        System.out.println(" \n-Монстр-\n ");
        super.statsInfo();
    }
}
