/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.util.Scanner;

/**
 *
 * @author lafon
 */
public abstract class View implements ViewInterface {

    private String defaultMessage;

    public View() {

    }

    public View(String msg) {
        defaultMessage = msg;
    }

    @Override
    public void display() {
        display(defaultMessage);

    }

    @Override
    public void display(String message) {
        boolean endView = false;
        do {
            String inputs = this.getInput(message);
            if (inputs.toLowerCase().trim().equals("q")) {
                System.out.println("Thanks for playing Late Bloomers City of Aaron");
                return;
            } 
            endView = doAction(inputs);
        } while (endView != true);
    }

    @Override
    public String getInput() {
        return getInput(defaultMessage);
    }

    @Override
    public String getInput(String promptMessage) {
        String choice = "";
        Scanner inChoice;
        inChoice = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.println(promptMessage);
            choice = inChoice.nextLine().trim();
            if (choice.equals("")) {
                System.out.println("Entry can not be blank. ");
            } else {
                valid = true;
            }
        }

        return choice;
    }
}
