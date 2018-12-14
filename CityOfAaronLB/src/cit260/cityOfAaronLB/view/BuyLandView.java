/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;
import cit260.cityOfAaronLB.control.BuyLandControl;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.exceptions.GameControlException;

/**
 *
 * @author kpetersen
 */
public class BuyLandView extends View {
    
    public BuyLandView() {
        super ("Enter the amount of land you want to buy");
        
    }
    
    @Override
    public boolean doAction(String inputs){
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int newBuy = -1;
        try{
            newBuy = BuyLandControl.buyLand(inputs, game);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
        
        if (newBuy >= 0){
            this.console.println("You baught " + newBuy + " acres of land.");
            this.console.println("You now have " + game.getWheat() + " Wheat in storage");
        }
        
        return true;
    }
    
    
}
