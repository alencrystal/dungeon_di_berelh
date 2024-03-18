import java.util.Scanner;
public class tutorial {
    
    public static void Fight() throws InterruptedException {

        Scanner sc=new Scanner(System.in);
        System. out. print("\033[H\033[2J");
        System.out.println("cosa vuoi sapere? \n 1 vedere gli attacchi  che hai disponibili \n 2  come sbloccare gli attacchi?");
        int info = sc.nextInt();

        switch(info){

            case 1:
                System.out.println("cipolla");
                break;
            case 2:
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
