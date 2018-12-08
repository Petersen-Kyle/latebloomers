/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.util.InputMismatchException;

/**
 *
 * @author mtsmith
 */
public class ReportView extends View {

    public ReportView() {
        super("Which report would you like to see? "
                + "\n 1. MTS Report"
                + "\n Choose one or Q to quit: ");
    }

    @Override
    public boolean doAction(String inputs) {
        try {
            switch (inputs) {
                case "1":

                    break;
                default:
                    this.console.println("Invalid Input"
                            + "\nPlease enter a number 1 - 7 or Q to quit");
                    break;
            }
        } catch (InputMismatchException err){
            this.console.println("\nINVALID INPUT!");
        }
            return false;
        }
    }
