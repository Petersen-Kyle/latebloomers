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
 * @author pytha
 */
public class sellLandControl {

    public static int sellLand(String desiredToSell, Game game) throws GameControlException {

        int landPrice;
        int userLandSell = -1;
        try {
            userLandSell = Integer.parseInt(desiredToSell);
        } catch (NumberFormatException e) {
            throw new GameControlException("Invalid entry, must be an number...");
        }

        if (userLandSell <= 0) {
            throw new GameControlException("Must be a greater than zero...");
        } else if (userLandSell > game.getAcres() - game.getAcresPlanted()) {
            throw new GameControlException("Your dont have enough land to sell...");
        }
        landPrice = (int) (Math.random() * 10) + 17;
        game.setAcres(game.getAcres() - userLandSell);
        game.setWheat(game.getWheat() + (userLandSell * landPrice));

        return game.getWheat();
    }

}
