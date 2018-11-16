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
public class MoveLocation extends View {
    
    
   String moveLocation = this.getInput("\nEnter where you would like to go: ");
    inputs[0] = moveLocation;
    
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
