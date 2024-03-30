import java.util.Random;
public class defend {

    //richiamata questa funzione venendole forniti dei moltiplicatori genera il danno che verrà inflitto al player


    public static int dmg(int adBuild, int apBuild, int defBuild, int mresBuild){
        Random rand = new Random();
        int rand1 = rand.nextInt(1, 7);
        int hit = rand1 + enemy.AD * adBuild + enemy.AP * apBuild - player.def * defBuild - player.mres * mresBuild;
        if (hit < 0) {
            hit = 0;
        }
        return hit;
    }

    public static int chooseEnemyAttack(){

        int adMultiplier = 0;
        int apMultiplier = 0;
        int defMultiplier = 0;
        int mresMultiplier = 0;

        if (enemy.name == "goblin") {
            adMultiplier = 1;
            apMultiplier = 0;
            defMultiplier = 1;
            mresMultiplier = 0;
        }

        if (enemy.name == "orco") {
            adMultiplier = 1;
            apMultiplier = 1;
            defMultiplier = 1;
            mresMultiplier = 0;
        }

        if (enemy.name == "mago") {
            adMultiplier = 0;
            apMultiplier = 1;
            defMultiplier = 1;
            mresMultiplier = 1;
        }



        return defend.dmg(adMultiplier, apMultiplier, defMultiplier, mresMultiplier);
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
