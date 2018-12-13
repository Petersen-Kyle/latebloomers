/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;
import cit260.cityOfAaronLB.control.FeedPeopleControl;
import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pytha
 */
public class EndOfTheYear extends View {

    public EndOfTheYear() {
        super("Enter the amount of wheat to feed your people: (or Q to quit back to Game Menu)");

    }

    @Override
    public boolean doAction(String inputs) {
        String amountToFeed = inputs;
        String amountToPlant = getInput("Enter the amount of acres to plant: ");
        if (amountToPlant.toUpperCase().trim().equals("Q")) {
            this.console.println("You are not ready to end the year? ");
            return true;
        }
        String amountToTithe = getInput("Enter the amount you want to tithe: ");
        if (amountToTithe.toUpperCase().trim().equals("Q")) {
            this.console.println("You are not ready to end the year? ");
            return true;
        }
        Game game = CityOfAaronLB.getGame();

        int intToFeed = Integer.parseInt(amountToFeed);
        int intToPlant = Integer.parseInt(amountToPlant);
        int intToTithe = Integer.parseInt(amountToTithe);
        int peopleFed = -1;
        int tithePercent = -1;

        try {
            if (intToFeed <= 0) {
                throw new GameControlException("You need to enter a positive number");
            } else if (intToFeed >= 0) {
                game.setWheat(game.getWheat() - intToFeed);
                peopleFed = (intToFeed / 20);
            } else if (intToFeed > game.getWheat()) {
                throw new GameControlException("There is not enough wheat in storage.");
            }
            if (intToPlant * 1 > game.getWheat()) {
                throw new GameControlException("There is not enough wheat in storage.");
            } else if (intToPlant > game.getAcres()) {
                throw new GameControlException("You dont own enough land to plant that much wheat.");
            } else {
                game.setAcresPlanted(intToPlant);
            }
            if (intToTithe >= game.getWheat()) {
                game.setWheat(game.getWheat() - intToTithe);
                game.setTithe(intToTithe);
                tithePercent = ((game.getTithe() / game.getWheat()) * 100);
            }
        } catch (GameControlException ex) {
            Logger.getLogger(EndOfTheYear.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearScreen();
        this.console.println("Lord " + player.getName() + " you have: \n"
                + "\nYear:               " + game.getYear()
                + "\nPeople Starved:     " + game.getStarved()
                + "\nMoved to City:      " + game.getNewPop()
                + "\nCurrent Population: " + game.getPopulation()
                + "\nAcres Owned:        " + game.getAcres()
                + "\nWheat per Acre:     " + game.getPerAcre()
                + "\nWheat in Storage:   " + game.getWheat()
                + "\nAmount of Tithes:   " + game.getTithe()
                + "\nEaten by Rats:      " + game.getRatsEat()
                + "\n");
        this.console.println("You fed " + peopleFed + " people.");
        this.console.println("You planted " + game.getAcresPlanted());
        this.console.println(" and now have " + game.getWheat() + " Wheat in storage.");
        this.console.println("Your population is now " + game.getPopulation());
        this.console.println(game.getStarved() + " people died of starvation");
        EndOfTheYear nextYear = new EndOfTheYear();
        nextYear.display();
        return false;
    }

}
