

import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        Characters.player.reName();
        GameSystem.getJob.chooseClass();
        Characters.player.exp += 100;
        GameSystem.dungeon.generate();  
    }  
}