/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.exceptions.GameControlException;
import java.util.Scanner;

/**
 *
 * @author lafon
 */
public class calcFeedThePeopleControl {

    public static int calcFeedThePeople(int wheatInStorage, int wheatHarvested, int tithes,
            int eatenByRats, int peopleToFeed) throws GameControlException {
//        System.out.println("How many people would you like to feed?");
//        Scanner inFile;
//        inFile = new Scanner(System.in);
//        peopleToFeed = inFile.nextInt();

//        wheatInStorage = 500;
//        wheatHarvested = 200;
//        tithes = 10;
//        eatenByRats = 50;

        int wheatTotal = wheatInStorage + wheatHarvested - tithes - eatenByRats;

        if (wheatInStorage < 0) { //Wheat in storage is negative
            throw new GameControlException("The wheat in storage is a negative number.");
        } else if (peopleToFeed <= 0) { //Number is negative
            throw new GameControlException("You need to enter a positive number");
        } else if (wheatHarvested < 0) { //Wheat harvested is negative
            throw new GameControlException("The wheat that is harvested is negative");
        } else if (peopleToFeed > wheatTotal / 20) { //Not enough wheat in storage
            throw new GameControlException("There is not enough wheat in storage");
        }

        int wheatLeftover = wheatTotal - peopleToFeed * 20;
//        System.out.println("Wheat Leftover in the StoreHouse: " + wheatLeftover);
           return wheatLeftover; 
    }
}