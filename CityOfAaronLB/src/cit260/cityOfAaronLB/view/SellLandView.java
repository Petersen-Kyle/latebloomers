/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.sellLandControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;

/**
 *
 * @author pytha
 */
public class SellLandView extends View {

    public SellLandView() {
        super("Enter the amount of land to sell: ");

    }

    @Override
    public boolean doAction(String inputs) {
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int newSell = -1;
        try {
            newSell = sellLandControl.sellLand(inputs, game);
        } catch (GameControlException ex) {
            System.out.println(ex.getMessage());
        }
        if (newSell >= 0) {
            System.out.println("You sold " + newSell + " achers of land.");
            System.out.println("You now have " + game.getWheatInStroage() + " Wheat in Storage");
        }
        return true;
    }

}
