/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.exceptions.GameControlException;

/**
 *
 * @author lafon
 */
public class calcFeedThePeopleControl {

    public static void calcFeedThePeople(int wheatInStorage, int wheatHarvested, int tithes, int eatenByRats, int peopleToFeed) {
        throws GameControlException{
        
            int wheatTotal = wheatInStorage + wheatHarvested - tithes - eatenByRats;

            if (wheatInStorage < 0) { //Wheat in storage is negative
                throw new GameControlException("");
            } else if (peopleToFeed <= 0) { //Number is negative
                throw new GameControlException("");
            } else if (wheatHarvested < 0) { //Wheat harvested is negative
                throw new GameControlException("");
            } else if (peopleToFeed > wheatTotal / 20) { //Not enough wheat in storage
                throw new GameControlException("");
            }

            int wheatLeftover = wheatTotal - peopleToFeed * 20;

        
    }
    }
}
