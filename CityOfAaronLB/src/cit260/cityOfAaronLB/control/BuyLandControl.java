/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;
/**
 *
 * @author kpetersen
 */
public class BuyLandControl {
    public static int calcBuyLand(String amountToBuy, Game game) throws GameControlException{
        
        int acrePrice;
        int acresToBuy = -1;
        acrePrice = (int) (Math.random() * 10) +17;
        
        try{
            acresToBuy = Integer.parseInt(amountToBuy);
        } catch (NumberFormatException e) {
            throw new GameControlException("Invalid entry, must be a number.");
        }
        
        if (acresToBuy < 0){
		throw new GameControlException("You must enter a number greater than 0");}
	else if (game.getWheat()-(acrePrice * acresToBuy) < 0){
		throw new GameControlException("You do not have ennough wheat for this purchase");}
	else if ((acresToBuy + game.getAcres())/10 > game.getPopulation()){
		throw new GameControlException("You do not have enough people to harvest that amount of land");}
	        
	game.setAcres(game.getAcres()+acresToBuy);
        
        return game.getAcres();
    }
            
}