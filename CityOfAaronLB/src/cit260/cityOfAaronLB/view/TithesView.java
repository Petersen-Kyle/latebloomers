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
        super("Enter the amount of wheat to pay in tithes: ");

    }

    @Override
    public boolean doAction(String inputs) {
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int newTithe = -1;
        try {
            newTithe = TithesControl.tithes(inputs, game);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
        double perTithe = (Integer.parseInt(inputs) / game.getIncrease());
        if (newTithe >= 0) {
            this.console.println("You paid " + perTithe + "% of your increase in tithes.");
            this.console.println("You paid " + game.getTithe() + " bushels of wheat in tithing");
//            this.console.println("You got " + game.getPerAcre() + " bushels of wheat per acre for paying " + perTithe + "% of tithing\n");
//            this.console.println("Unfortunately while you were away paying tithing, the rats ate " + game.getRatsEat() + " bushels of wheat.\n");
            this.console.println("You now have " + game.getWheat() + " Wheat in storage.\n");
        }
            return true;
        }
}
