import java.util.Random;
public class enemy {

    static String name;                            //tutte le variabili del nemico
    static int max_HP;
    static int HP;
    static int AD;
    static int AP;
    static int def;
    static int mres;
    static int luck;
    static int lv;
    static int expDrop;
    static int atkCombo = 0;

    public static void lvUp(){                          //il lv-up dei mostri automatico

        if (player.lv > enemy.lv) {
            
            for(int i=enemy.lv; i<player.lv; i++) {

                enemy.expDrop += 15;

                Random rand = new Random();
                int randStats = rand.nextInt(1, 7);
                switch (randStats) {

                    case 1:
                        enemy.max_HP += 3;
                        enemy.HP = enemy.max_HP;
                        break;
                    case 2:
                        enemy.AD += 1;
                        break;
                    case 3:
                        enemy.AP += 1;
                        break;
                    case 4:
                        enemy.def += 1;
                        break;
                    case 5:
                        enemy.mres += 1;
                        break;
                    case 6:
                        enemy.luck += 1;
                        break;
                    default:
                        break;
                        
                }
            enemy.lv +=1;                
            }
        }
    }


    public static void  chooseGoblin(){                  //evocare un goblin

        enemy.name = "goblin";
        enemy.max_HP = 20;
        enemy.HP = enemy.max_HP;
        enemy.AD = 1;
        enemy.AP = 1;
        enemy.def = 1;
        enemy.mres = 1;
        enemy.luck = 1;
        enemy.lv = 1;
        enemy.expDrop = 30;

        enemy.lvUp();

    }


    public static void  chooseOgre(){                  //evocare un orco

        enemy.name = "orco";
        enemy.max_HP = 30;
        enemy.HP = enemy.max_HP;
        enemy.AD = 2;
        enemy.AP = 0;
        enemy.def = 3;
        enemy.mres = 1;
        enemy.luck = 0;
        enemy.lv = 2;
        enemy.expDrop = 75;

        enemy.lvUp();

    }
    
    public static void  chooseLitch(){                  //evocare uno stregone

        enemy.name = "stregone";
        enemy.max_HP = 50;
        enemy.HP = enemy.max_HP;
        enemy.AD = 1;
        enemy.AP = 3;
        enemy.def = 1;
        enemy.mres = 4;
        enemy.luck = 1;
        enemy.lv = 4;
        enemy.expDrop = 155;

        enemy.lvUp();

    }


    public static void getStats(){                       //returna le statistiche

        System. out. print("\033[H\033[2J");
        System.out.println("nome: "+ name +"\nlv: "+ lv +"\nexp drop: "+ expDrop +"\nvita "+ HP + " / " + max_HP);
        System.out.println("\nforza "+ AD +"\nmagia "+ AP +"\ndifesa "+ def +"\nresistenza "+ mres +"\nfortuna "+ luck);
    }

}
