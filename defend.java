import java.util.Random;
public class defend {
    
    public static int hit(int a, int b, int c, int d){
        Random rand = new Random();
        int rand1 = rand.nextInt(1, 6);
        return rand1 + enemy.AD * a + enemy.AP * b - player.def * c - player.mres * d;
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
