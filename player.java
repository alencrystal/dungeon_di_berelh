import java.util.Scanner;
public class player {

    static String name;                            //tutte le variabili del pg 
    static String role;                            //la classe del pg
    static int max_HP;
    static int HP;
    static int AD;
    static int AP;
    static int def;
    static int mres;
    static int luck;                                //luck sarebbe l'heal bonus
    static int lv;
    static int exp = 0;
    static int max_exp = 100;                                       //per raggiungere il livello successivo bisogna raggiungere la max_exp
    static boolean[] atkSlot = {false, false, false, false, false};       //a seconda di che valori si hanno al suo interno il player può eseguire diversi attacchi
    

    public static void reName(){                        //Pg.reName() per rinominare il pg
        
        Scanner sc=new Scanner(System.in);

        System. out. print("\033[H\033[2J");
        System.out.println("inserisci il tuo nome");
        String newName = sc.nextLine();
        player.name = newName;

    }

    public static void newLv() throws InterruptedException{
       
        if (player.exp >= player.max_exp){                                

            System.out.println("complimenti! sei salito di livello");       //
            lv += 1;
            max_exp += lv * 100;                                                //quando sali di livello aumenta l'exp massima
            max_HP += lv + (luck / 2);                                          //aumenta la vita massima
            attack.healTaken(lv);
            player.upgrade();
            player.getStats();
        }
    }


    public static void upgrade(){                                           //permette di scegliere una stat da aumentare

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

    public static void getStats(){                       //returna tutte le statistiche

        System.out.println("nome: "+ name +"\nclasse inziale: "+ role +"\nlv: "+ lv +"\nexp: "+ exp + " /" + max_exp +"\nvita "+ HP + " /" + max_HP);
        System.out.println("\nforza "+ AD +"\nmagia "+ AP +"\ndifesa "+ def +"\nresistenza "+ mres +"\nfortuna "+ luck);
    }


}
