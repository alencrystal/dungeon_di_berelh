

import java.util.Random;
import java.util.Scanner;

public class Characters {
    public static class player {
        public static String name;
        public static String role;
        public static int max_HP;
        public static int HP;
        public static int AD;
        public static int AP;
        public static int def;
        public static int mres;
        public static int luck;
        public static int lv;
        public static int exp = 0;
        public static int max_exp = 100;
        public static boolean[] atkSlot = new boolean[5];

        public static void reName() {
            Scanner sc = new Scanner(System.in);
            System.out.print("\033[H\033[2J");
            System.out.println("inserisci il tuo nome");
            name = sc.nextLine();
        }

        public static void newLv() throws InterruptedException {
            if (exp >= max_exp) {
                System.out.println("\ncomplimenti! sei salito di livello");
                lv += 1;
                max_exp += lv * 100;
                max_HP += lv + (luck / 2);
                Combat.attack.healTaken(lv);
                upgrade();
                getStats();
                Combat.attack.getAttack();
            }
        }

        public static void upgrade() {
            boolean syntax = false;
            Scanner sc = new Scanner(System.in);
            
            while (!syntax) {
                System.out.print("\033[H\033[2J");
                System.out.println("scegli che statistica potenziare (hp, ad, ap, def, mres, luck)");
                String choice = sc.nextLine();
                
                switch (choice) {
                    case "hp":
                        HP += 3;
                        max_HP += 3;
                        syntax = true;
                        break;
                    case "ad":
                        AD += 1;
                        syntax = true;
                        break;
                    case "ap":
                        AP += 1;
                        syntax = true;
                        break;
                    case "def":
                        def += 1;
                        syntax = true;
                        break;
                    case "mres":
                        mres += 1;
                        syntax = true;
                        break;
                    case "luck":
                        luck += 1;
                        syntax = true;
                        break;
                }
            }
            System.out.print("\033[H\033[2J");  
        }

        public static void getStats() {
            System.out.println("nome: "+ name +"\nclasse inziale: "+ role +"\nlv: "+ lv +"\nexp: "+ exp + " /" + max_exp +"\nvita "+ HP + " /" + max_HP);
            System.out.println("\nforza "+ AD +"\nmagia "+ AP +"\ndifesa "+ def +"\nresistenza "+ mres +"\nfortuna "+ luck);
        }
    }

    public static class enemy {
        public static String name;
        public static int max_HP;
        public static int HP;
        public static int AD;
        public static int AP;
        public static int def;
        public static int mres;
        public static int luck;
        public static int lv;
        public static int expDrop;
        public static int atkCombo = 0;

        public static void lvUp() throws InterruptedException {
            System.out.print("\033[H\033[2J");
            System.out.println("entri nella stanza ed incappi in un "+ name +", preparati a combattere!");
            Thread.sleep(2000);

            if (player.lv > lv) {
                for(int i=lv; i<player.lv; i++) {
                    expDrop += 15;
                    Random rand = new Random();
                    switch (rand.nextInt(1, 7)) {
                        case 1: max_HP += 3; HP = max_HP; break;
                        case 2: AD += 1; break;
                        case 3: AP += 1; break;
                        case 4: def += 1; break;
                        case 5: mres += 1; break;
                        case 6: luck += 1; break;
                    }
                    lv += 1;                
                }
            }
        }

        public static void chooseGoblin() throws InterruptedException {
            name = "goblin";
            max_HP = 20;
            HP = max_HP;
            AD = 1;
            AP = 1;
            def = 1;
            mres = 1;
            luck = 1;
            lv = 1;
            expDrop = 30;
            lvUp();
        }

        public static void chooseOgre() throws InterruptedException {
            name = "orco";
            max_HP = 30;
            HP = max_HP;
            AD = 2;
            AP = 0;
            def = 3;
            mres = 1;
            luck = 0;
            lv = 2;
            expDrop = 75;
            lvUp();
        }

        public static void chooseLitch() throws InterruptedException {
            name = "mago";
            max_HP = 50;
            HP = max_HP;
            AD = 1;
            AP = 3;
            def = 1;
            mres = 4;
            luck = 1;
            lv = 4;
            expDrop = 155;
            lvUp();
        }

        public static void getStats() {
            System.out.print("\033[H\033[2J");
            System.out.println("nome: "+ name +"\nlv: "+ lv +"\nexp drop: "+ expDrop +"\nvita "+ HP + " / " + max_HP);
            System.out.println("\nforza "+ AD +"\nmagia "+ AP +"\ndifesa "+ def +"\nresistenza "+ mres +"\nfortuna "+ luck);
        }
    }
}