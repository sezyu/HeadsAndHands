package testovoe;

public class Player extends Creatures{

    private int health;
    private int maxHealth;
    private int countHeal;




    public Player(int attack, int defense, int health, int minDamage, int maxDamage) {
        super(attack, defense, health, minDamage, maxDamage);
        this.countHeal = 0;
    }

    @Override
    public void hitCreature(Creatures creatures) {
        super.hitCreature(creatures);
    }

    public void heal(){
        if (countHeal < 4 && getHealth() < getMaxHealth() && getHealth() > 0){
            maxHealth = getMaxHealth();
            health = getHealth();
            int healing = (int) (0.3 * maxHealth);
            setHealth(getHealth() + healing);
            health+= healing;
            if (health > maxHealth){
                setHealth(maxHealth);
            }
            System.out.println("Исцелено: " + healing + "\n" + "Здоровье: " + getHealth() + "\n");
            countHeal++;
        } else {
            System.out.println("Хила  нет\n");
        }
    }

    @Override
    public void statsInfo() {
        System.out.println(" \n-Игрок-\n ");
        super.statsInfo();
    }
}

