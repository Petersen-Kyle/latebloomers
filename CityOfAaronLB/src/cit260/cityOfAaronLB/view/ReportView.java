/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.control.ReportControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import java.util.InputMismatchException;

/**
 *
 * @author mtsmith
 */
public class ReportView extends View {

    public ReportView() {
        super("Which report would you like to see? "
                + "\n 1. MTS Report"
                + "\n 2. MJL Report"
                + "\n 3. K7P Report"
                + "\n Choose one or Q to quit: ");
    }

    @Override
    public boolean doAction(String inputs) {
        try {
            switch (inputs) {
                case "1":
                    String weaponStr = ReportControl.getWeaponList();
                    this.console.println(weaponStr);
                    String wepResponse = this.getInput("Do you want to save this report y/n?");
                    if (wepResponse.compareToIgnoreCase("y") == 0) {
                        wepResponse = this.getInput("Enter your file name: ");
                        try {
                            if (GameControl.saveReport(wepResponse, weaponStr)) {
                                this.console.println("Your report was properly saved.");
                            }
                        } catch (GameControlException ex) {
                            ErrorView.display(this.getClass().getName(), ex.getMessage());
                        }
                    }
                    break;
                case "2":
                    String animalStr = ReportControl.getAnimalList();
                    this.console.println(animalStr);
                    String aniResponse = this.getInput("Do you want to save this report y/n?");
                    if (aniResponse.compareToIgnoreCase("y") == 0) {
                        aniResponse = this.getInput("Enter your file name: ");
                        try {
                            if (GameControl.saveReport(aniResponse, animalStr)) {
                                this.console.println("Your report was properly saved.");
                            }
                        } catch (GameControlException ex) {
                            ErrorView.display(this.getClass().getName(), ex.getMessage());
                        }
                    }
                    break;
                case "3":
                    String toolStr = ReportControl.getToolList();
                    this.console.println(toolStr);
                    String toolResponse = this.getInput("Do you want to save this report y/n?");
                    if (toolResponse.compareToIgnoreCase("y") == 0) {
                        toolResponse = this.getInput("Enter your file name: ");
                        try {
                            if (GameControl.saveReport(toolResponse, toolStr)) {
                                this.console.println("Your report was properly saved.");
                            }
                        } catch (GameControlException ex) {
                            ErrorView.display(this.getClass().getName(), ex.getMessage());
                        }
                    }
                    break;
                default:
                    this.console.println("Invalid Input"
                            + "\nPlease enter a number 1 - 3 or Q to quit");
                    break;
            }
        } catch (InputMismatchException err) {
            this.console.println("\nINVALID INPUT!");
        }
        return false;
    }
}
