import java.util.Scanner;
public class player {

    static String name;                            //tutte le variabili del pg 
    static String role;
    static int max_HP;
    static int HP;
    static int AD;
    static int AP;
    static int def;
    static int mres;
    static int luck;
    static int lv;
    static int exp;
    static int max_exp;
    

    public static void reName(){                        //Pg.reName() per rinominare il pg
        
        Scanner sc=new Scanner(System.in);

        System. out. print("\033[H\033[2J");
        System.out.println("inserisci il tuo nome");
        String newName = sc.nextLine();
        player.name = newName;

        sc.close();
    }

    public static int healTaken(int i){                         //per curarsi con il cap di 50 (la max vita)
        HP += i;
        HP += luck;
        if(HP >= max_HP){
            HP = max_HP;
        }
        return HP;
    }

    public static void newLv(){
        
        lv += 1;
        max_exp += lv * 100;
        max_HP += lv + (luck / 2);
        player.healTaken(lv); 
    }


    public static void getStats(){                       //returna le statistiche

        System.out.println("nome: "+ name +"\nclasse: "+ role +"\nlv: "+ lv +"\nexp: "+ exp + " /" + max_exp +"\nvita "+ HP + " /" + max_HP);
        System.out.println("\nforza "+ AD +"\nmagia "+ AP +"\ndifesa "+ def +"\nresistenza "+ mres +"\nfortuna "+ luck);
    }

    

    //              System. out. print("\033[H\033[2J");
}
