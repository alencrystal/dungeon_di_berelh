import java.util.Random;
public class defend {
    
    public static int dmg(int a, int b, int c, int d){
        Random rand = new Random();
        int rand1 = rand.nextInt(1, 7);
        int hit = rand1 + enemy.AD * a + enemy.AP * b - player.def * c - player.mres * d;
        if (hit < 0) {
            hit = 0;
        }
        return hit;
    }


    /*public static int castSpell(){
        
        Random rand = new Random();
        int rand1 = rand.nextInt(1, 10);
        rand1 += enemy.atkCombo;
        enemy.atkCombo += 1;
        if(rand1 >= 10){
            enemy.atkCombo = 0;
            return (defende.double_ap());
        }
        return (defende.ap_mres());
    }*/
}
