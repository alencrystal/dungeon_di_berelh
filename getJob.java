import java.util.Scanner;

public class getJob {

    public static void warrior(){               //classe combattente con le sue stats 
        player.role = "combattente";
        player.max_HP = 20;
        player.HP = player.max_HP;
        player.AD = 2;
        player.AP = 0;
        player.def = 2;
        player.mres = 1;
        player.luck = 0;
        player.lv = 1;
        player.atkSlot[0] = true;
        player.atkSlot[1] = false;
        player.atkSlot[2] = false;
        player.atkSlot[3] = false;
        player.atkSlot[4] = false;

    }

    public static void wizard(){                 //classe mago con le sue stats 
        player.role = "mago";
        player.max_HP = 15;
        player.HP = player.max_HP;
        player.AD = 0;
        player.AP = 3;
        player.def = 1;
        player.mres = 2;
        player.luck = 0;
        player.lv = 1;
        player.atkSlot[0] = false;
        player.atkSlot[1] = true;
        player.atkSlot[2] = false;
        player.atkSlot[3] = false;
        player.atkSlot[4] = false;
    }

    public static void rogue(){                  //classe esperto con le sue stats 
        player.role = "esperto";
        player.max_HP = 18;
        player.HP = player.max_HP;
        player.AD = 1;
        player.AP = 1;
        player.def = 1;
        player.mres = 1;
        player.luck = 1;
        player.lv = 1;
        player.atkSlot[0] = false;
        player.atkSlot[1] = false;
        player.atkSlot[2] = true;
        player.atkSlot[3] = false;
        player.atkSlot[4] = false;
    }
    
    public static void chooseClass(){

        boolean syntax = false;
        Scanner sc=new Scanner(System.in);
        
        while (syntax == false) {

            System. out. print("\033[H\033[2J");
            System.out.println("scegli la classe (mago, combattente, esperto)");
            String lavoro = sc.nextLine();
            
            switch (lavoro) {

                case "mago":
                    getJob.wizard();
                    syntax = true;
                    break;
                case "combattente":
                    getJob.warrior();
                    syntax = true;
                    break;
                case "esperto":
                    getJob.rogue();
                    syntax = true;
                    break;
                default:
                    break;
                
            }
            
        }
        System. out. print("\033[H\033[2J");  
    }
}



