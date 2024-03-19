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
                    finalDmg = attack.dmg(1, 0, 1, 0);
                    syntax = true;
                    break;
                case "2":
                    finalDmg = attack.dmg(0, 1, 0, 1);
                    syntax = true;
                    break;
                case "3":
                    finalDmg = attack.dmg(1, 1, 1, 1);
                    syntax = true;
                    break;
                case "4":
                    finalDmg = attack.dmg(2, 0, 1, 1);
                    syntax = true;
                    break;
                case "5":
                    finalDmg = attack.dmg(0, 2, 1, 1);
                    syntax = true;
                    break;
                case "6":
                    finalDmg = attack.dmg(0, 0, 0, 0);
                    syntax = true;
                    break;
                case "info":
                    tutorial.Fight();
                    break;
                default:
                    break;
                
            }
            
        }
        System. out. print("\033[H\033[2J");
        sc.close();
        return finalDmg;
    }

}
