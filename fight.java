public class fight {
    
    public static void calculation (){

        int dmgPlayer = attack.dmg(1, 0, 1, 0);
        System.out.println("player dmg =" + dmgPlayer);
        player.HP = player.HP - dmgPlayer;

        if (enemy.HP <= 0) {
                
            System.out.println("hai sconfitto il "+ enemy.name +", complimenti!");
        }
        else{

            int dmgEnemy = attack.dmg(1, 0, 1, 0);
            System.out.println("player dmg =" + dmgEnemy);
            player.HP = player.HP - dmgEnemy;

            if (player.HP <= 0){
                
                System.out.println("fine partita, sei stato sconfitto.");
                player.getStats();
            }
        }
    }

    public static void start(){                     //per scegliere gli attacchi(devo ancora implementarlo)

        if (player.HP > 0 && enemy.HP > 0) {
            
            fight.calculation();
        }      
    }
    
}
