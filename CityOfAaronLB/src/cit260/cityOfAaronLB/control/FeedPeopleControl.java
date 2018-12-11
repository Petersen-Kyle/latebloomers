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
public class FeedPeopleControl {

    public static int feedPeople(String peopleToFeed, Game game) throws GameControlException {
        int peopleFed = Integer.parseInt(peopleToFeed);
        if (peopleFed <= 0) { //Number is negative
            throw new GameControlException("You need to enter a positive number");
        } else if (peopleFed > game.getWheat() / 20) { //Not enough wheat in storage
            throw new GameControlException("There is not enough wheat in storage");
        }
        game.setWheat (game.getWheat() - peopleFed * 20);
        game.setDeathToll(game.getPopulation() - peopleFed);
        game.setPopulation(game.getPopulation() - game.getDeathToll());
        return game.getWheat(); 
    }
}