import java.util.Random;
import java.util.Scanner;
public class attack {
    
    public static int dmg(int adMultiplier, int apMultiplier, int defMultiplier, int mresMultiplier){

        Random rand = new Random();
        int rand1 = rand.nextInt(1, 7);
        int hit = rand1 + player.AD * adMultiplier + player.AP * apMultiplier - enemy.def * defMultiplier - enemy.mres * mresMultiplier;
        if (hit < 0) {
            hit = 0;
        }
        return hit;
    }


    public static int select(){

        int finalDmg = 0;
        boolean syntax = false;
        Scanner sc=new Scanner(System.in);
        
        while (syntax == false) {

            System. out. print("\033[H\033[2J");
            System.out.println("scegli che attacco eserguire");
            String lavoro = sc.nextLine();
            
            switch (lavoro) {

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
                default:
                    break;
                
            }
            
        }
        System. out. print("\033[H\033[2J");
        return finalDmg;
    }

}
