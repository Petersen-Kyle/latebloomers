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
    
    public void moveLocation() {
        String moveLocation = this.getInput("\nWhere would you like to go: ");
        inputs[0] = moveLocation;
    }

    @Override
    public String getInputs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    


    

    
    
}
