import java.util.Random;
import java.util.Scanner;
public class attack {
    
    public static int dmg(int a, int b, int c, int d){

        Random rand = new Random();
        int rand1 = rand.nextInt(1, 7);
        int hit = rand1 + player.AD * a + player.AP * b - enemy.def * c - enemy.mres * d;
        if (hit < 0) {
            hit = 0;
        }
        return hit;
    }


    public static void select(){

        boolean syntax = false;
        Scanner sc=new Scanner(System.in);
        
        while (syntax == false) {

            System. out. print("\033[H\033[2J");
            System.out.println("scegli che attacco eserguire");
            String lavoro = sc.nextLine();
            
            switch (lavoro) {

                case "1":
                    attack.dmg(1, 0, 1, 0);
                    syntax = true;
                    break;
                case "2":
                    attack.dmg(1, 0, 1, 0);
                    syntax = true;
                    break;
                case "3":
                    attack.dmg(1, 0, 1, 0);
                    syntax = true;
                    break;
                case "4":
                    attack.dmg(1, 0, 1, 0);
                    syntax = true;
                    break;
                case "5":
                    attack.dmg(1, 0, 1, 0);
                    syntax = true;
                    break;
                case "6":
                    attack.dmg(1, 0, 1, 0);
                    syntax = true;
                    break;
                default:
                    break;
                
            }
            
        }
        System. out. print("\033[H\033[2J");   
    }

}
