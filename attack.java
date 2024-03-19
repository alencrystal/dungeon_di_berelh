import java.util.Random;
import java.util.Scanner;
public class attack {
    
    public static int dmg(int adBuild, int apBuild, int defBuild, int mresBuild){

        /*
        richiamata questa funzione venendole forniti dei moltiplicatori genera il danno che verrà inflitto al nemico
        se il danno che verrebbe inferto è negativo viene riportanto a zero
        */

        Random rand = new Random();
        int rand1 = rand.nextInt(1, 7);
        int hit = rand1 + player.AD * adBuild + player.AP * apBuild - enemy.def * defBuild - enemy.mres * mresBuild;
        if (hit < 0) {
            hit = 0;
        }
        return hit;
    }


    public static int select() throws InterruptedException{

        /*
        funzione che permette di scegliere l'attacco: la differenza è che ognuno ha dei moltiplicatori diversi
        permette anche di accedere al tutorial dei combattimenti
        */
        int finalDmg = 0;
        boolean syntax = false;
        Scanner sc=new Scanner(System.in);
        
        while (syntax == false) {

            System. out. print("\033[H\033[2J");
            System.out.println("scegli che attacco eserguire (per tutorial scrivi 'info')");
            String numberSelect = sc.nextLine();
            
            switch (numberSelect) {

                case "1":

                    //solo ad, se possiedi l'attacco
                    if (player.atkSlot[0] = true) {
                        finalDmg = attack.dmg(1, 0, 1, 0);
                        syntax = true;
                    }
                    System. out. print("\033[H\033[2J");
                    break;
                
                case "2":

                    //solo ap, se possiedi l'attacco
                    if (player.atkSlot[1] = true) {
                        finalDmg = attack.dmg(0, 1, 0, 1);
                        syntax = true;   
                    }
                    System. out. print("\033[H\033[2J");
                    break;
                
                case "3":

                    //entrambi, se possiedi l'attacco
                    if (player.atkSlot[2] = true) {
                        finalDmg = attack.dmg(1, 1, 1, 1);
                        syntax = true;   
                    }
                    System. out. print("\033[H\033[2J");
                    break;
                
                case "4":

                    //doppio ad, se possiedi l'attacco
                    if (player.atkSlot[3] = true) {
                        finalDmg = attack.dmg(2, 0, 1, 1);
                        syntax = true;   
                    }
                    System. out. print("\033[H\033[2J");
                    break;
                
                case "5":

                    //doppio ap, se possiedi l'attacco
                    if (player.atkSlot[4] = true) {
                        finalDmg = attack.dmg(0, 2, 1, 1);
                        syntax = true;   
                    }
                    System. out. print("\033[H\033[2J");
                    break;
                
                case "6":

                    //per curarsi
                    System. out. print("\033[H\033[2J");
                    Random rand = new Random();
                    int randHeal = rand.nextInt(1, 7);
                    attack.healTaken(randHeal);
                    syntax = true;
                    break;

                
                case "info":

                    //per accedere alle info
                    tutorial.Fight();
                    System. out. print("\033[H\033[2J");
                    break;

                default:
                    break;
                
            }
            
        }
        return finalDmg;
    }

    public static void healTaken(int heal) throws InterruptedException{                         //per curarsi con il cap (la max vita)
        heal += player.luck;
        player.HP += heal;
        Thread.sleep(1000);
        System.out.println("ti sei curato di "+ heal);
        if(player.HP >= player.max_HP){
            player.HP = player.max_HP;
        }

    }
}
