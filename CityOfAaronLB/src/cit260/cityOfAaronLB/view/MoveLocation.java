/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lafon
 */

public class MoveLocation {
    
    public void display(){
        boolean endOfView = false;

        do {

            String inputs = this.getInputs();
            if (inputs.equals("e")) {
                System.exit(0);
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    public String getInputs(){
        String inputs = "";
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter where you would like to go:");
            char choice;
            choice = (char) System.in.read();
            //inputs[0] = choice;
            if (choice == ' ') {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String inputs) {
        if (inputs.equals("2")) {
            WheatField newField = new WheatField();
            newField.wheatField();
        } else if (inputs.equals("1")) {
            Temple newTemple = new Temple();
            newTemple.temple();
        }
        return true;

    }
    
}