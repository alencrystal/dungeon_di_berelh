import java.util.Random;
public class attack {
    
    public static int mage(int a, int b, int c, int d){

        Random rand = new Random();
        int rand1 = rand.nextInt(1, 6);
        return rand1 + player.AD * a + player.AP * b - enemy.def * c - enemy.mres * d;
    }

        /*public static int first(){

            Random rand = new Random();
            int hit = rand.nextInt(2, 6);
            return hit + player.AP - enemy.mres;
        }
        public static int second(){

            Random rand = new Random();
            int hit = rand.nextInt(2, 6);
            return hit + player.AP + (2 * player.AD) - enemy.mres - enemy.def;
        }
        public static int third(){

            Random rand = new Random();
            int hit = rand.nextInt(4, 9);
            return hit + player.AP - enemy.mres - enemy.def;
        }
        public static int fourth(){

            Random rand = new Random();
            int hit = rand.nextInt(1, 5);
            return hit + (2 * player.AP) - enemy.mres - enemy.def;
        }  
    }
    */
}
