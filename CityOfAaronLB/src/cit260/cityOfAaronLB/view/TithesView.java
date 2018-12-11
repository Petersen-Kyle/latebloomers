/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.TithesControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;

/**
 *
 * @author lafon
 */
public class TithesView extends View {
    public TithesView() {
        super("Enter the percent of tithes you wish to pay: ");

    }

    @Override
    public boolean doAction(String inputs) {
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int tithe = -1;
        try {
            tithe = TithesControl.tithes(inputs, game);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
        if (tithe >= 0) {
            this.console.println("You paid " + inputs + "% of tithes.");
            this.console.println("You now have " + game.getWheat() + " Wheat in storage.");
            this.console.println("You got " + game.getTitheBonus() + " extra bushels for paying " + inputs + "% of tithing");
        }
            return true;
        }
}
