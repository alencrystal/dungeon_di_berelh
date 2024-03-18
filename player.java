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
       
        if (player.exp >= player.max_exp){

            System.out.println("complimenti! sei salito di livello");
            lv += 1;
            max_exp += lv * 100;
            max_HP += lv + (luck / 2);
            player.healTaken(lv);
            player.upgrade();
            player.getStats();
        }
    }


    public static void upgrade(){

        boolean syntax = false;
        Scanner sc=new Scanner(System.in);
        
        while (syntax == false) {

            System. out. print("\033[H\033[2J");
            System.out.println("scegli che statistica potenziare (hp, ad, ap, def, mres, luck)");
            String lavoro = sc.nextLine();
            
            switch (lavoro) {

                case "hp":
                    player.HP += 3;
                    player.max_HP += 3;
                    syntax = true;
                    break;
                case "ad":
                    player.AD += 1;
                    syntax = true;
                    break;
                case "ap":
                    player.AP += 1;
                    syntax = true;
                    break;
                case "def":
                    player.def += 1;
                    syntax = true;
                    break;
                case "mres":
                    player.mres += 1;
                    syntax = true;
                    break;
                case "luck":
                    player.luck += 1;
                    syntax = true;
                    break;
                default:
                    break;
                
            }
            
        }
        System. out. print("\033[H\033[2J");   
    }

    public static void getStats(){                       //returna le statistiche

        System.out.println("nome: "+ name +"\nclasse: "+ role +"\nlv: "+ lv +"\nexp: "+ exp + " /" + max_exp +"\nvita "+ HP + " /" + max_HP);
        System.out.println("\nforza "+ AD +"\nmagia "+ AP +"\ndifesa "+ def +"\nresistenza "+ mres +"\nfortuna "+ luck);
    }

    

    //              System. out. print("\033[H\033[2J");
}
