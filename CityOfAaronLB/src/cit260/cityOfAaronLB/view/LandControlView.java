/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;

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
