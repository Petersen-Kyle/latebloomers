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
public class FeedPeopleControl {

    public static int feedPeople(String peopleToFeed, Game game) throws GameControlException {
        int bushelsToFeed = Integer.parseInt(peopleToFeed);
        
        if (game.isPeopleFed() && bushelsToFeed >= 0) {
            System.out.println("You have already fed the people\n");
            EndOfYearView end = new EndOfYearView();
            end.display();
        }

        game.setPeopleFed(false);

        if (bushelsToFeed >= 0) {
            game.setPeopleFed(true);
        }

        if (bushelsToFeed <= 0) { //Number is negative
            throw new GameControlException("You need to enter a positive number");
        } else if (bushelsToFeed > game.getWheat()) { //Not enough wheat in storage
            throw new GameControlException("There is not enough wheat in storage");
        }

        game.setWheat(game.getWheat() - bushelsToFeed);
        game.setStarved(game.getPopulation() - bushelsToFeed / 20);
        game.setPopulation(game.getPopulation() - game.getStarved());
        return game.getWheat();
    }

}
