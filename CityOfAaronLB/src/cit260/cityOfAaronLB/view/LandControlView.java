/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;
import cit260.cityOfAaronLB.control.GameControl;

/**
 *
 * @author mtsmith
 */
public class LandControlView extends View {

    public LandControlView() {
        super("Would you like to buy or sell land? "
                + "\n 1. Buy Land"
                + "\n 2. Sell Land"
                + "\n Choose one option or Q to quit");

    }

    @Override
    public boolean doAction(String inputs) {
        try {
            switch (inputs) {
                case "1":
                    try {
                        BuyLandView buyland = new BuyLandView();
                        buyland.display();
                    } catch (Exception e) {
                        this.console.println("You must enter a number.\n");
                    }
                    break;
                case "2":
                    try {
                        GameControl.endOfYear(game);
                        SellLandView sellLand = new SellLandView();
                        sellLand.display();
                    } catch (Exception e) {
                        this.console.println("You must enter a number.\n");
                    }
                    break;
                default:
                    this.console.println("Invalid Input"
                            + "\nPlease enter a number 1 - 2 or Q to quit");
                    break;

            }
        } catch (Exception err) {
            this.console.println("\nINVALID INPUT!\n");
        }
        clearScreen();
        this.console.println("Lord " + player.getName() + "you have: \n"
                + "\nYear:               " + game.getYear()
                + "\nPeople Starved:     " + game.getStarved()
                + "\nMoved to City:      " + game.getNewPop()
                + "\nCurrent Population: " + game.getPopulation()
                + "\nAcres Owned:        " + game.getAcres()
                + "\nCost per Arce:      " + game.getPerWheat()
                + "\nReturn per Acre:    " + game.getPerAcre()
                + "\nWheat in Storage:   " + game.getWheat()
                + "\nAmount of Tithes:   " + game.getTithe()
                + "\nEaten by Rats:      " + game.getRatsEat()
                + "\n");
        return false;

    }

}
