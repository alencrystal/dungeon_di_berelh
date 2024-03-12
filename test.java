public class test {
    
    public static void main(String[] args) throws InterruptedException{
        
        player.reName();
        getJob.chooseClass();
        enemy.chooseGoblin();
        
        
        while (player.HP > 0) {
            
            fight.start();
        }

    }

    
}
