/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.model.Player;
import java.util.InputMismatchException;

/**
 *
 * @author pytha
 */
public class MainMenu extends View {

    public MainMenu() {
        super("Main Menu\n"
                + "1. Start a new game\n"
                + "2. Load a saved game\n"
                + "3. Help\n"
                + "Choose one or (Q to Quit the game): ");
    }

    @Override
    public boolean doAction(String inputs) {
        try {
            switch (inputs) {
                case "1":
                    this.console.println("Welcome to a new game in the City of Aaron");
                    Player playersName = CityOfAaronLB.getPlayer();

//                Player player = GameControl.savePlayer(playersName);
                    GameControl.createNewGame(playersName);
                    GameMenuView newGame = new GameMenuView();
                    newGame.display();
                    break;
                case "2":
                    this.console.println("Welcome back to the City of Aaron");
                    break;
                case "3":
                    HelpMenu newHelp = new HelpMenu();
                    newHelp.display();
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
