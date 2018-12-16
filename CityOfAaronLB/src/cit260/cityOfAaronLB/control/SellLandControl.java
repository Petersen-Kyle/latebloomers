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
public class SellLandControl {

    public static int sellLand(String desiredToSell, Game game) throws GameControlException {

        int userLandSell = Integer.parseInt(desiredToSell);

        if (userLandSell <= 0) {
            throw new GameControlException("Must be a greater than zero...");
        } else if (userLandSell > game.getAcres() - game.getAcresPlanted()) {
            throw new GameControlException("You dont have enough land to sell...");
        }

        game.setAcres(game.getAcres() - userLandSell);
        game.setWheat(game.getWheat() + (userLandSell * game.getPerWheat()));

        return game.getWheat();
    }

}
