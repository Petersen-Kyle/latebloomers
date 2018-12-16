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

    public static int buyLand(String desiredToBuy, Game game) throws GameControlException {


            int userLandBuy = Integer.parseInt(desiredToBuy);

        if (userLandBuy <= 0) {
            throw new GameControlException("Must be a greater than zero...");
        } else if (userLandBuy > (game.getWheat() / game.getPerWheat())) {
            throw new GameControlException("Your dont have enough wheat to buy that much land...");
        }

        game.setAcres(game.getAcres() + userLandBuy);
        game.setWheat(game.getWheat() - (userLandBuy * game.getPerWheat()));

        return game.getWheat();
    }

}