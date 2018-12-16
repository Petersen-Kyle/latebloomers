/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.view.EndOfYearView;

/**
 *
 * @author lafon
 */
public class LandHarvestControl {

    public static int calcLandHarvested(String acres, Game game) throws GameControlException {
        game.setAcresPlanted(Integer.parseInt(acres));

        if (game.isAcresTheyPlanted() && game.getAcresPlanted() >= 0) {
            System.out.println("You have already harvested acres.\n");
            EndOfYearView end = new EndOfYearView();
            end.display();
        }

        game.setAcresTheyPlanted(false);

        if (game.getAcresPlanted() >= 0) {
            game.setAcresTheyPlanted(true);
        }

        if (game.getAcresPlanted() > game.getAcres()) {
            throw new GameControlException("You don't have enough acres to plant");
        } else if (game.getAcresPlanted() > 10 * game.getPopulation()) {
            throw new GameControlException("You don't have enough people to plant the wheat.");
        } else if (game.getAcresPlanted() / 2 > game.getWheat()) {
            throw new GameControlException("You don't have enough wheat in storage to plant");
        } else if (game.getAcresPlanted() <= 1) {
            throw new GameControlException("You need to enter a positive number");
        }
        game.setWheat(game.getWheat() - (game.getAcresPlanted() / 2));
        game.setHarvestReturn(game.getAcresPlanted() * game.getPerAcre());
        game.setAcresPlanted(0);
        return game.getAcresPlanted();
    }
}
