/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.io.IOException;



/**
 *
 * @author pytha
 */

public class SellLandView {
    public void display() throws IOException{
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs.equals('q')) {
                System.exit(0);
            }
                endView = doAction(inputs);
            } while (endView != true);
    }
    public String[] getInputs() throws IOException{
        String[] inputs = new String[1];
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the amount of land to sell: ");
                    String choice;
            choice = System.in.read();
            inputs[0].equals(choice);
            if (choice.equals(' ')) {
                System.out.println("You must enter a non-blank value");
            }
            valid = true;
        }
    }
    public void doAction() {
        if (inputs[0].equals('2')) {
            
        } else if (inputs[0].equals('1'))
        
    
}
   
}
