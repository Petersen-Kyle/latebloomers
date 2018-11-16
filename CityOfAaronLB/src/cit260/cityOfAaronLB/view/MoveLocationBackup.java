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
/**
public class MoveLocation {
    
    public void moveLocation() throws IOException{
        boolean endOfView = false;

        do {

            char[] inputs = this.getInputs();
            if (inputs[0] == 'e') {
                System.exit(0);
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    public char[] getInputs() throws IOException{
        char[] inputs = new char[1];
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter where you would like to go:");
            char choice;
            choice = (char) System.in.read();
            inputs[0] = choice;
            if (choice == ' ') {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(char[] inputs) throws IOException {
        if (inputs[0] == '2') {
            WheatField newField = new WheatField();
            newField.wheatField();
        } else if (inputs[0] == '1') {
            Temple newTemple = new Temple();
            newTemple.temple();
        }
        return true;

    }
    
}
*/