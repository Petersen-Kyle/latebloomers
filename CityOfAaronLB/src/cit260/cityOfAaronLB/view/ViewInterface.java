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
public interface ViewInterface {

    public void display();

    public void display(String message);

    public String getInput();

    public String getInput(String promptMessage);

    public boolean doAction(String inputs);
}
