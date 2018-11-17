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
    
    public MoveLocation() {
        super("Enter where you would like to go:");
    }


    public boolean doAction(String inputs) {
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