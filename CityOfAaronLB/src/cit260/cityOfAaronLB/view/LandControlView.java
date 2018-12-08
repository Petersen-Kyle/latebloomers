/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import java.util.InputMismatchException;

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
                BuyLandView buyland = new BuyLandView();
                buyland.display();
                break;
            case "2":
                SellLandView sellLand = new SellLandView();
                sellLand.display();
                break;
            default:
                this.console.println("Invalid Input"
                        + "\nPlease enter a number 1 - 2 or Q to quit");
                break;

        }
        } catch (InputMismatchException err){
            this.console.println("\nINVALID INPUT!");
        }
        for (int clear = 0; clear < 1000; clear++) {
            System.out.println("\b");
        }
        this.console.println("Current Population: " + game.getPopulation()
                + "\n Current Acres Owned: " + game.getAcres()
                + "\n Current Wheat in Storage: " + game.getWheat());
        return false;

    }

}
