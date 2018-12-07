/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author lafon
 */
public abstract class View implements ViewInterface {

    private String defaultMessage;

    protected final BufferedReader keyboard = CityOfAaronLB.getInFile();
    protected final PrintWriter console = CityOfAaronLB.getOutPut();

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
                this.console.println("Thanks for playing Late Bloomers City of Aaron");
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
        String selection = null;
        boolean valid = false;
        try {
            while (!valid) {
                this.console.println(promptMessage);
                selection = this.keyboard.readLine();
                selection = selection.trim();
                if (selection.length() < 1) {
                    this.console.println("Entry can not be blank. ");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            this.console.println("Error reading input: " + e.getMessage());
        }

        return selection;
    }
}
