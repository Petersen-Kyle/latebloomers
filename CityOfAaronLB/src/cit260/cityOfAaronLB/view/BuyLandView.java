/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;
import cit260.cityOfAaronLB.control.buyLandControl;
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
    public boolean doAction(String inputs) {
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int acresToBuy = -1;
        try{
            acresToBuy = buyLandControl.calcBuyLand(inputs, game);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
        
        if (acresToBuy>=0){
            this.console.println("You now have " + acresToBuy + " acres of land.");
        }
        
        return true;
    }
    
    
}
