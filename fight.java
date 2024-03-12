public class fight {
    
    public static void calculation (){

        int dmgPlayer = attack.dmg(1, 0, 1, 0);
        enemy.HP = enemy.HP - dmgPlayer;
        System.out.println("player dmg =" + dmgPlayer +"\nenemy HP = "+ enemy.HP);


        if (enemy.HP <= 0) {
                
            System.out.println("hai sconfitto il "+ enemy.name +", complimenti!");
        }
        else{

            int dmgEnemy = defend.dmg(1, 0, 1, 0);
            player.HP = player.HP - dmgEnemy;
            System.out.println("enemy dmg =" + dmgEnemy +"\nHP rimanenti = " + player.HP);
            

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
