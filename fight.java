public class fight {
    
    public static void calculation () throws InterruptedException {

        int dmgPlayer = attack.select();
        enemy.HP = enemy.HP - dmgPlayer;
        Thread.sleep(1000);
        System.out.println("player dmg =" + dmgPlayer);


        if (enemy.HP <= 0) {
            
            Thread.sleep(1000);
            System.out.println("hai sconfitto il "+ enemy.name +", complimenti!");
            player.exp += enemy.expDrop;
            Thread.sleep(2000);
            player.newLv();
        }
        else{

            Thread.sleep(1000);
            System.out.println("HP nemico rimanenti = " + enemy.HP);
            int dmgEnemy = defend.dmg(1, 0, 1, 0);
            player.HP = player.HP - dmgEnemy;
            Thread.sleep(1000);
            System.out.println("enemy dmg =" + dmgEnemy);
            Thread.sleep(1000);
            System.out.println("HP rimanenti = " + player.HP);
            Thread.sleep(1000);
            

            if (player.HP <= 0){
                
                Thread.sleep(2000);
                System. out. print("\033[H\033[2J");
                System.out.println("fine partita, sei stato sconfitto.\n\n");
                Thread.sleep(2000);
                player.getStats();
            }
        }
    }

    public static void start() throws InterruptedException{                     //per scegliere gli attacchi(devo ancora implementarlo)

        while (player.HP > 0 && enemy.HP > 0) {
            
            fight.calculation();
        }      
    }
    
}
