/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;


/**
 *
 * @author pytha
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("Enter file path: ");
    }

    @Override
    public boolean doAction(String inputs) {

        try {
            GameControl.saveGame(inputs);
            this.console.println("Your game is saved! ");
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

        return true;
    }

}
