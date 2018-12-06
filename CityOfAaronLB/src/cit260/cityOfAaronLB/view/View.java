/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author lafon
 */
public abstract class View implements ViewInterface {

    private String defaultMessage;

    protected final BufferedReader keyboard = CityOfAaronLB.getInFile();
    protected final PrintWriter console = CityOfAaronLB.getOutFile();

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
        String inChoice = null;
        boolean valid = false;
        try {
            while (!valid) {
                System.out.println(promptMessage);
                inChoice = this.keyboard.readLine();
                inChoice = inChoice.trim();
                if (inChoice.length() < 1) {
                    System.out.println("Entry can not be blank. ");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        return inChoice;
    }
}
