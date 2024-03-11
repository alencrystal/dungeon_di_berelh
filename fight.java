public class fight {
    
    public static void calculation (){

        int dmg = attack.dmg(1, 0, 1, 0);
        System.out.println("player dmg =" + dmg);
        player.HP = player.HP - dmg;
    }
    
}
