/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.view.EndOfTheYear;

/**
 *
 * @author lafon
 */
public class LandHarvestControl {

    public static int calcLandHarvested(String acres, Game game) throws GameControlException {
        int acresPlanted = Integer.parseInt(acres);

        if (game.isAcresTheyPlanted()) {
            System.out.println("You have already harvested acres.\n");
            EndOfTheYear end = new EndOfTheYear();
            end.display();
        }

        game.setAcresTheyPlanted(false);

        if (acresPlanted >= 0) {
            game.setAcresTheyPlanted(true);
        }

        if (acresPlanted > game.getAcres()) {
            throw new GameControlException("You don't have enough acres to plant");
        } else if (acresPlanted > 10 * game.getPopulation()) {
            throw new GameControlException("You don't have enough people to plant the wheat.");
        } else if (acresPlanted / 2 > game.getWheat()) {
            throw new GameControlException("You don't have enough wheat in storage to plant");
        } else if (acresPlanted <= 1) {
            throw new GameControlException("You need to enter a positive number");
        }
        game.setWheat(game.getWheat() - acresPlanted / 2);
        return acresPlanted;
    }
}
