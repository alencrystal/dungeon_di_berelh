

import java.util.Scanner;
import java.util.Random;

public class GameSystem {
    public static class getJob {
        public static void warrior() throws InterruptedException {
            Characters.player.role = "combattente";
            Characters.player.max_HP = 20;
            Characters.player.HP = Characters.player.max_HP;
            Characters.player.AD = 2;
            Characters.player.AP = 0;
            Characters.player.def = 2;
            Characters.player.mres = 1;
            Characters.player.luck = 0;
            Characters.player.lv = 1;
            Characters.player.atkSlot[0] = true;   
        }

        public static void wizard() {
            Characters.player.role = "mago";
            Characters.player.max_HP = 15;
            Characters.player.HP = Characters.player.max_HP;
            Characters.player.AD = 0;
            Characters.player.AP = 3;
            Characters.player.def = 1;
            Characters.player.mres = 2;
            Characters.player.luck = 0;
            Characters.player.lv = 1;
            Characters.player.atkSlot[1] = true;
        }

        public static void rogue() {
            Characters.player.role = "esperto";
            Characters.player.max_HP = 18;
            Characters.player.HP = Characters.player.max_HP;
            Characters.player.AD = 1;
            Characters.player.AP = 1;
            Characters.player.def = 1;
            Characters.player.mres = 1;
            Characters.player.luck = 1;
            Characters.player.lv = 1;
            Characters.player.atkSlot[2] = true;
        }
        
        public static void chooseClass() throws InterruptedException {
            boolean syntax = false;
            Scanner sc = new Scanner(System.in);
            
            while (!syntax) {
                System.out.print("\033[H\033[2J");
                System.out.println("scegli la classe (mago, combattente, esperto)");
                String lavoro = sc.nextLine();
                
                switch (lavoro) {
                    case "mago":
                        wizard();
                        syntax = true;
                        break;
                    case "combattente":
                        warrior();
                        syntax = true;
                        break;
                    case "esperto":
                        rogue();
                        syntax = true;
                        break;
                }
            }
            System.out.print("\033[H\033[2J");  
        }
    }

    public static class tutorial {
        public static void Fight() throws InterruptedException {
            Scanner sc = new Scanner(System.in);
            System.out.print("\033[H\033[2J");
            Characters.player.getStats();
            System.out.println("\n\ncosa vuoi sapere? \n 1 vedere gli attacchi  che hai disponibili \n 2 come sbloccare gli attacchi?\n 3 esc");
            String info = sc.nextLine();

            switch(info) {
                case "1":
                    System.out.print("\033[H\033[2J");
                    if (Characters.player.atkSlot[0]) System.out.println("spada (1)");
                    if (Characters.player.atkSlot[1]) System.out.println("dardo incantato (2)");
                    if (Characters.player.atkSlot[2]) System.out.println("mani brucianti (3)");
                    if (Characters.player.atkSlot[3]) System.out.println("lancia suprema (4)");
                    if (Characters.player.atkSlot[4]) System.out.println("palla di fuoco (5)");
                    System.out.println("pozione curativa (6)");
                    Thread.sleep(5000);
                    break;
                case "2":
                    System.out.print("\033[H\033[2J");
                    System.out.println("il primo attacco che possiedi viene determinato in base alla classe,");
                    System.out.println("mentre quelli successivi vengono assegnati salendo di livello");
                    Thread.sleep(5000);
                    break;
            }
        }
    }

    public static class dungeon {
        public static void generate() throws InterruptedException {
            while (Characters.player.lv < 3) {
                Scanner sc = new Scanner(System.in);
                System.out.print("\033[H\033[2J");
                System.out.println("ti trovi difronte ad un bivio, dove vai? (destra o sinistra)"); 
                sc.nextLine();
                Characters.enemy.chooseGoblin();
                Combat.fight.start();
            }

            System.out.print("\033[H\033[2J");
            System.out.println("sei davanti ad un portone....");
            Thread.sleep(2000);
            System.out.println("avverti una forte presenza dietro ad esso....");
            Thread.sleep(2000);
            System.out.println("decidi di etrare...");
            Thread.sleep(2000);
            System.out.println("ti accoglie accoglie una risata maligna");
            Thread.sleep(2000);
            Characters.enemy.chooseLitch();
            Combat.fight.start();

            while (Characters.player.lv < 6) {
                if (new Random().nextInt(10) > 4) {
                    Characters.enemy.chooseOgre();
                } else {
                    Characters.enemy.chooseGoblin();
                }
                Combat.fight.start();
            }
        }
    }
}