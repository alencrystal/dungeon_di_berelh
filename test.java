public class test {
    
    public static void main(String[] args) throws InterruptedException{
        
        player.reName();
        getJob.chooseClass();
        enemy.chooseOgre();
        player.upgrade();    
        fight.start();
        while (player.HP > 0) {
            enemy.chooseGoblin();
            fight.start();
        }
    }

    
}
