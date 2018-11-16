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
/**
public class SellLandView{
    public sellLandView() {
        
    }
    public void display() throws IOException {
        boolean endView = false;
        do {
            char input = this.getInputs();
            if (input[0] = 'q') {
                System.exit(0);
            }
                endView = getInputs(input)
            } while (endView != true);
    }
    public String[] getInputs() {
        String input = new String[1];
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the amount of land to sell: ");
            String choice;
            choice = (char)System.in.read();
            
        }
        
    }
    public void doAction() {
    
}
   
}
*/