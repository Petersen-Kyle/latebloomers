/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Map;
import cit260.cityOfAaronLB.view.View;

/**
 *
 * @author lafon
 */
public class MoveLocation extends View {

    public MoveLocation() {
        super("Enter Row(Q to quit): ");
    }

    @Override
    public boolean doAction(String inputs) {
        String row = inputs;
        String col = getInput("Enter Column(Q to quit): ");
        if (col.toUpperCase().trim().equals("Q")) {
            this.console.println("You didnt want to move...");
            return true;
        }

        int inRow = -1;
        int inCol = -1;
        try {
            inRow = Integer.parseInt(row);
            inCol = Integer.parseInt(col);
        } catch (NumberFormatException e) {
            this.console.println("Invalid entry, must be an number...");
            return false;
        }

        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        Map map = game.getMap();
        this.console.println();

        try {
            GameControl.movePlayer(map, inRow, inCol);
        } catch (ArrayIndexOutOfBoundsException e) {
            this.console.println("Invalid range.");
        }
        return true;

    }

}
