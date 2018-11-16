/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;
import cit260.cityOfAaronLB.control.sellLandControl;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author pytha
 */

public class SellLandView {
    public void display() throws IOException{
        boolean endOfView = false;
        do {
            String inputs = this.getInputs();
            if (inputs.equals('q')) {
                System.exit(0);
            }
                endOfView = doAction(inputs);
            } while (endOfView != true);
    }
    public String getInputs() throws IOException{
        String[] inputs = new String[1];
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the amount of land to sell: ");
            Scanner inChoice;
            inChoice = new Scanner(System.in);
            String choice = inChoice.nextLine().trim();
 //           inputs[0].equals(choice);
            if (choice.equals(' ')) {
                System.out.println("You must enter a non-blank value");
            }
            valid = true;
        }
        return null;
    }
    public boolean doAction(String inputs) {
            sellLandControl newSell = new sellLandControl();
            System.out.println();
            return true;
    }
        
    
}
   

