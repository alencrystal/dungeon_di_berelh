import java.util.Random;
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

}
