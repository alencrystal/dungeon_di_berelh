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
    

    public static void reName(String n){                        //Pg.reName() per rinominare il pg
        name = n;
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
    }


    public static void getStats(){                       //returna le statistiche

        System. out. print("\033[H\033[2J");
        System.out.println("nome: "+ name +"\nclasse: "+ role +"\nlv: "+ lv +"\nexp: "+ exp + " /" + max_exp +"\nvita "+ HP + " /" + max_HP);
        System.out.println("\nforza "+ AD +"\nmagia "+ AP +"\ndifesa "+ def +"\nresistenza "+ mres +"\nfortuna "+ luck);
    }

    
}
