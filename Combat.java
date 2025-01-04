
import java.util.Random;
import java.util.Scanner;

public class Combat {
    public static class attack {
        public static int dmg(int adBuild, int apBuild, int defBuild, int mresBuild) {
            Random rand = new Random();
            int rand1 = rand.nextInt(1, 7);
            int hit = rand1 + Characters.player.AD * adBuild + Characters.player.AP * apBuild - Characters.enemy.def * defBuild - Characters.enemy.mres * mresBuild;
            return Math.max(hit, 0);
        }

        public static int select() throws InterruptedException {
            int finalDmg = 0;
            boolean syntax = false;
            Scanner sc = new Scanner(System.in);
            
            while (!syntax) {
                System.out.print("\033[H\033[2J");
                System.out.println("scegli che attacco eserguire (per tutorial scrivi 'info')");
                System.out.println("hp " + Characters.player.HP + "              hp "+ Characters.enemy.name +" "+ Characters.enemy.HP );
                String numberSelect = sc.nextLine();
                
                switch (numberSelect) {
                    case "1":
                        if (Characters.player.atkSlot[0]) {
                            finalDmg = dmg(1, 0, 1, 0);
                            syntax = true;
                        }
                        break;
                    case "2":
                        if (Characters.player.atkSlot[1]) {
                            finalDmg = dmg(0, 1, 0, 1);
                            syntax = true;   
                        }
                        break;
                    case "3":
                        if (Characters.player.atkSlot[2]) {
                            finalDmg = dmg(1, 1, 1, 1);
                            syntax = true;   
                        }
                        break;
                    case "4":
                        if (Characters.player.atkSlot[3]) {
                            finalDmg = dmg(2, 0, 1, 1);
                            syntax = true;   
                        }
                        break;
                    case "5":
                        if (Characters.player.atkSlot[4]) {
                            finalDmg = dmg(0, 2, 1, 1);
                            syntax = true;   
                        }
                        break;
                    case "6":
                        Random rand = new Random();
                        healTaken(rand.nextInt(2, 8));
                        syntax = true;
                        break;
                    case "info":
                        GameSystem.tutorial.Fight();
                        break;
                }
                
                if (syntax && !numberSelect.equals("6")) {
                    System.out.print("\033[H\033[2J");
                    System.out.println("player dmg =" + finalDmg);
                }
            }
            return finalDmg;
        }

        public static void healTaken(int heal) throws InterruptedException {
            heal += Characters.player.luck;
            Characters.player.HP += heal;
            Thread.sleep(1000);
            System.out.println("ti sei curato di "+ heal);
            if(Characters.player.HP >= Characters.player.max_HP){
                Characters.player.HP = Characters.player.max_HP;
            }
        }

        public static void getAttack() {
            for (int i = 0; i <= 4; i++) { 
                if (!Characters.player.atkSlot[i]) {
                    Characters.player.atkSlot[i] = true;
                    break;
                }
            }
        }
    }

    public static class defend {
        public static int dmg(int adBuild, int apBuild, int defBuild, int mresBuild) {
            Random rand = new Random();
            int rand1 = rand.nextInt(1, 7);
            int hit = rand1 + Characters.enemy.AD * adBuild + Characters.enemy.AP * apBuild - Characters.player.def * defBuild - Characters.player.mres * mresBuild;
            return Math.max(hit, 0);
        }

        public static int chooseEnemyAttack() {
            int adMultiplier = 0, apMultiplier = 0, defMultiplier = 0, mresMultiplier = 0;

            switch(Characters.enemy.name) {
                case "goblin":
                    adMultiplier = 1;
                    defMultiplier = 1;
                    break;
                case "orco":
                    adMultiplier = 1;
                    apMultiplier = 1;
                    defMultiplier = 1;
                    break;
                case "mago":
                    apMultiplier = 1;
                    defMultiplier = 1;
                    mresMultiplier = 1;
                    break;
            }

            return dmg(adMultiplier, apMultiplier, defMultiplier, mresMultiplier);
        }
    }

    public static class fight {
        public static void calculation() throws InterruptedException {
            int dmgPlayer = attack.select();
            Characters.enemy.HP = Characters.enemy.HP - dmgPlayer;
            Thread.sleep(1000);

            if (Characters.enemy.HP <= 0) {
                Thread.sleep(1000);
                System.out.println("hai sconfitto il "+ Characters.enemy.name +", complimenti!");
                Characters.player.exp += Characters.enemy.expDrop;
                Thread.sleep(2000);
                Characters.player.newLv();
            } else {
                int dmgEnemy = defend.chooseEnemyAttack();
                Characters.player.HP = Characters.player.HP - dmgEnemy;
                Thread.sleep(1000);
                System.out.println("enemy dmg =" + dmgEnemy);
                Thread.sleep(1000);

                if (Characters.player.HP <= 0) {
                    Thread.sleep(2000);
                    System.out.print("\033[H\033[2J");
                    System.out.println("fine partita, sei stato sconfitto.\n\n");
                    Thread.sleep(2000);
                    Characters.player.getStats();
                    System.exit(0);
                }
            }
        }

        public static void start() throws InterruptedException {
            while (Characters.player.HP > 0 && Characters.enemy.HP > 0) {
                calculation();
            }      
        }
    }
}