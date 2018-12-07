/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

/**
 *
 * @author kpetersen
 */
public class BuyLandView extends View {
    
    public BuyLandView() {
        super ("Enter the amount of land you want to buy");
        
    }
    
    @Override
    public boolean doAction(String inputs) {
        
        this.console.println("You bought" + inputs + " land.");
        
        return true;
    }
    
    
}
