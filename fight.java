public class fight {
    
    public static void calculation () throws InterruptedException {

        
        //dopo aver ottenuto il danno lo infligge al nemico, se è 0 (o anche ti stai curando) non di dice che infliggi danno

        int dmgPlayer = attack.select();
        enemy.HP = enemy.HP - dmgPlayer;
        Thread.sleep(1000);
        
        if (dmgPlayer > 0) {
            System.out.println("player dmg =" + dmgPlayer);
        }
        else{

            Thread.sleep(1000);
            System.out.println("HP nemico rimanenti = " + enemy.HP);
        }

        if (enemy.HP <= 0) {         

            //se il nemico viene sconfitto ti da l'exp e poi controlla se puoi livellare
            
            Thread.sleep(1000);
            System.out.println("hai sconfitto il "+ enemy.name +", complimenti!");
            player.exp += enemy.expDrop;
            Thread.sleep(2000);
            player.newLv();
        }
        else{

            //se il nemico non è stato sconfitto ti attacca anche lui

            int dmgEnemy = defend.dmg(1, 0, 1, 0);
            player.HP = player.HP - dmgEnemy;
            Thread.sleep(1000);
            System.out.println("enemy dmg =" + dmgEnemy);
            Thread.sleep(1000);
            System.out.println("HP rimanenti = " + player.HP);
            Thread.sleep(1000);
            

            if (player.HP <= 0){
                
                //se sei stato sconfitto finisce la partita

                Thread.sleep(2000);
                System. out. print("\033[H\033[2J");
                System.out.println("fine partita, sei stato sconfitto.\n\n");
                Thread.sleep(2000);
                player.getStats();
            }
        }
    }

    public static void start() throws InterruptedException{                     

        //per far cominciare il combattimento, finchè entrambi sono vivi il fight va avanti

        while (player.HP > 0 && enemy.HP > 0) {  

            fight.calculation();
        }      
    }
    
}
