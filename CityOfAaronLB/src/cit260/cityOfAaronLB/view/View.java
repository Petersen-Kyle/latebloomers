/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lafon
 */
public abstract class View implements ViewInterface {

    public View() {

    }

    @Override
    public void display() {
        boolean endView = false;
        try {
            do {
                String inputs = this.getInputs();
                if (inputs.equals('e')) {
                    System.exit(0);
                }
                endView = doAction(inputs);
            } while (endView != true);
        } catch (IOException e) {

        }
    }

    @Override
    public String getInput(String promptMessage) {
        String[] inputs = new String[1];
        boolean valid = false;
        try {
            while (valid == false) {
                char choice;
                choice = (char) System.in.read();
                inputs[0].equals(choice);
                if (choice == ' ') {
                }
                valid = true;
            }
        } catch (IOException e) {

        }
        return null;
    }

    public boolean doAction(String inputs) throws IOException {
        if (inputs.equals('2')) {
            WheatField newField = new WheatField();
            newField.wheatField();
        } else if (inputs.equals('1')) {
            Temple newTemple = new Temple();
            newTemple.temple();
        }
        return true;

    }

}
