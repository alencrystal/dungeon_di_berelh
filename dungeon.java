import java.util.Random;
import java.util.Scanner;

public class dungeon {
    
    public static void generate() throws InterruptedException{

        while (player.lv < 3) {

            Scanner sc=new Scanner(System.in);
            System. out. print("\033[H\033[2J");
            System.out.println("ti trovi difronte ad un bivio, dove vai? (destra o sinistra)"); 
            String info = sc.nextLine();
            enemy.chooseGoblin();
            fight.start();
        }
    

        System. out. print("\033[H\033[2J");
        System.out.println("sei davanti ad un portone....");
        Thread.sleep(2000);
        System.out.println("avverti una forte presenza dietro ad esso....");
        Thread.sleep(2000);
        System.out.println("decidi di etrare...");
        Thread.sleep(2000);
        System.out.println("ti accoglie accoglie una risata maligna");
        Thread.sleep(2000);
        enemy.chooseLitch();
        fight.start();

            while (player.lv < 6) {
                
                Random rand = new Random();
                int rand1 = rand.nextInt(0, 10);
    
                if (rand1 > 4) {
                    enemy.chooseOgre();
                }
                else{
                    enemy.chooseGoblin();
                }
                fight.start();
            }

    }
    
}
