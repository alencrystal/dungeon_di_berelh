import java.util.Scanner;
public class tutorial {
    
    public static void Fight() throws InterruptedException {


        //tutorial combattimento

        Scanner sc=new Scanner(System.in);
        System. out. print("\033[H\033[2J");
        player.getStats();
        System.out.println("\n\ncosa vuoi sapere? \n 1 vedere gli attacchi  che hai disponibili \n 2 come sbloccare gli attacchi?\n 3 esc");
        String info = sc.nextLine();

        switch(info){

            case "1":
                System. out. print("\033[H\033[2J");
                if (player.atkSlot[0] == true) {
                    System.out.println("spada (1)");
                }
                if (player.atkSlot[1] == true) {
                    System.out.println("dardo incantato (2)");
                }
                if (player.atkSlot[2] == true) {
                    System.out.println("mani brucianti (3)");
                }
                if (player.atkSlot[3] == true) {
                    System.out.println("lancia suprema (4)");
                }
                if (player.atkSlot[4] == true) {
                    System.out.println("palla di fuoco (5)");
                }
                System.out.println("pozione curativa (6)");
                Thread.sleep(5000);
                break;
            case "2":
                System. out. print("\033[H\033[2J");
                System.out.println("il primo attacco che possiedi viene determinato in base alla classe,");
                System.out.println("il secondo viene scelto casualmente,\nmentre quelli successivi vengono assegnati salendo di livello");
                Thread.sleep(5000);
                break;
            default:
                break;
        }
    }
}
