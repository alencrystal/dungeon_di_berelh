import java.util.Scanner;
public class test {
    
    public static void main(String[] args){
        
        
        Scanner sc=new Scanner(System.in);

        System. out. print("\033[H\033[2J");
        System.out.println("inserisci il tuo nome");
        String newName = sc.nextLine();
        player.reName(newName);
        getJob.chooseClass();
        player.newLv();
        enemy.chooseGoblin(); 
        fight.calculation();


        sc.close();
    }

    
}
