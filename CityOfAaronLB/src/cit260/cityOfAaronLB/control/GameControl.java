/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;



/**
 *
 * @author pytha
 */
public class GameControl {
    
    public static Player savePlayer(String name) {
            System.out.println("***savePLayer() called ***");
            return new Player();  
    }
    public static void creatNewGame(Player player) {
            System.out.println("***createNewGame() called ***");
            return new newGame();
        
    }
    
}
