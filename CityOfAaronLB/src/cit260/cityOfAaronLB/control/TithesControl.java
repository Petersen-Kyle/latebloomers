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
 * @author lafon
 */
public class TithesControl {

    public static int tithes(String tithesPaid, Game game) throws GameControlException {
        int tithesToPay = Integer.parseInt(tithesPaid);
        
        if (tithesToPay < 0) {
            throw new GameControlException("You need to enter a positive number");
        } else if (tithesToPay > 100) {
            throw new GameControlException("Number cannot be greater than 100");
        } else if (tithesToPay <= 8) {
            game.setTitheBonus((int) (Math.random() * 3) + 1 * game.getAcres());
        } else if (tithesToPay >= 12) {
            game.setTitheBonus((int) (Math.random() * 5) + 2 * game.getAcres());
        } else {
            game.setTitheBonus((int) (Math.random() * 4) + 2 * game.getAcres());
        }

        game.setTithe((tithesToPay) / 100 * game.getWheat());
        game.setWheat(game.getWheat() - game.getTithe() + game.getTitheBonus());
        return game.getTithe();
    }
}
