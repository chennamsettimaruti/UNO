
import edu.nus.uno.Game;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kishore
 */
public class TestGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.createNewGame(UUID.randomUUID().toString());
        
        game.addPlayer("player#1", "Elsa");
        game.addPlayer("player#2", "Enna");
        game.addPlayer("player#3", "Barbie");
        game.addPlayer("player#4", "Balerina");
        game.addPlayer("player#5", "Dora");
        
        
        // start game
        game.changeGameStatus();
        
        System.out.println(game.toString());
    }
}
