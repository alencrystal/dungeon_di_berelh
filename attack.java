import java.util.Random;
public class attack {
    
    public static int dmg(int a, int b, int c, int d){

        Random rand = new Random();
        int rand1 = rand.nextInt(1, 6);
        return rand1 + player.AD * a + player.AP * b - enemy.def * c - enemy.mres * d;
    }

}
