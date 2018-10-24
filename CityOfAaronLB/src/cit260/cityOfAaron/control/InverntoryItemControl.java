/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.control;

/**
 *
 * @author lafon
 */
public class InverntoryItemControl {
    public static int calcFeedThePeople(int wheatInStorage, int wheatHarvested, int tithes, int eatenByRats, int peopleToFeed){
        int wheatTotal = wheatInStorage + wheatHarvested - tithes - eatenByRats;
        
        if(peopleToFeed>wheatTotal/20){ //Not enough wheat in storage
            return -1;
        }
        else if(wheatInStorage<0){ //Wheat in storage is negative
            return -2;
        }
        else if(peopleToFeed<=0){ //Number is negative
            return -3;
        }
        else if(wheatHarvested<0){ //Wheat harvested is negative
            return -4;
        }
        
        int wheatLeftover = wheatTotal - peopleToFeed*20;
        return wheatLeftover;

    }
}
