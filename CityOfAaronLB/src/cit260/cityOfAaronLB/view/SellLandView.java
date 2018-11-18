/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

/**
 *
 * @author pytha
 */

public class SellLandView extends View {
    
    public SellLandView() {
        super("Enter the amount of land to sell: ");
    
}
    @Override
    public boolean doAction(String inputs) {
         //   sellLandControl newSell = new sellLandControl();
            System.out.println("You sold + inputs + land.");
            return true;
    }
        
    
}
   

