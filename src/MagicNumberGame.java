import java.util.Random;
import java.util.Scanner;
public class MagicNumberGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int nombreMagic = rand.nextInt(100);
        Game game = new Game();
        game.playGame(nombreMagic);
    }



}