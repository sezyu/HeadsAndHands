package testovoe;


import java.util.Random;

public class Fight {


    public static void main(String[] args) {

        Player player = new Player(25,20,50,10,20);
        player.statsInfo();
        Monster monster = new Monster(25,20,100,10,20);
        monster.statsInfo();
        while (player.getHealth() > 0 && monster.getHealth() > 0){
            System.out.println("Атакует игрок");
            player.hitCreature(monster);
            monster.statsInfo();
            if (monster.getHealth() < 1){
                System.out.println("Монстр мертв\n");
                break;
            }
            System.out.println("Атакует монстр");
            monster.hitCreature(player);
            player.statsInfo();
            player.heal();
            if (player.getHealth() < 1){
                System.out.println("Игрок мертв\n");
                break;
            }
        }
    }
}

