/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.io.IOException;

/**
 *
 * @author lafon
 */
public abstract class View implements ViewInterface {
    public void view() throws IOException{
        boolean endOfView = false;

        do {

            char[] inputs = this.getInput();
            if (inputs[0] == 'q') {
                System.exit(0);
            }

        } while (endOfView != true);

    }
    public char[] getInput() throws IOException{
        char[] inputs = new char[1];
        boolean valid = false;
        while (valid == false) {
            char choice;
            choice = (char) System.in.read();
            inputs[0] = choice;
            if (choice == '\n' || choice == ' ') {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return inputs;
    }
    private boolean doAction(char[] inputs) throws IOException{
        if (inputs[0] == '2') {
            WheatField newField = new WheatField();
            newField.wheatField();
        } else if (inputs[0] == '1') {
            Temple newTemple = new Temple();
            newTemple.temple();
        }
        return true;

        }
}
