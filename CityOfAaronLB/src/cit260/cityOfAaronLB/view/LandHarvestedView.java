/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import cit260.cityOfAaronLB.control.LandHarvestControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;

/**
 *
 * @author lafon
 */
public class LandHarvestedView extends View{
    public LandHarvestedView() {
        super("You have " + game.getWheat() + " wheat in storage.\n"
                + "You can plant 2 acres with 1 bushel of wheat.\n"
               + "Enter the amount of acres you want to plant: ");

    }

    @Override
    public boolean doAction(String inputs) {
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int land = -1;
        try {
            land = LandHarvestControl.calcLandHarvested(inputs, game);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
        if (land >= 0) {
            this.console.println("You have planted " + inputs + " acres");
            this.console.println("You now have " + game.getWheat()+ " wheat in storage.\n");
        }
            return true;
        }
}
