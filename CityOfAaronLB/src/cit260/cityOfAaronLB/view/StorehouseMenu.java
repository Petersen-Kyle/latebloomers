/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;


/**
 *
 * @author lafon
 */
public class StorehouseMenu extends View{
    
    public StorehouseMenu() {
        super("Store House\n"
                + "1. Current resources\n"
                + "2. How to use the resources\n"
                + "3. Manage Crops and Land\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
                case "1":
                    this.console.println("Current Resources");
                    break;
                case "2":
                    this.console.println("How to use the resources");
                    break;
            }
    System.out.println();
        return false;
    }
}
