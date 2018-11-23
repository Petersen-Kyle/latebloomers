/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;
import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.model.Player;

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
                + "Choose one or (E to Exit the game): ");
    }

    @Override
    public boolean doAction(String inputs) {
        switch (inputs) {
            case "1":
                System.out.println("Welcome to a new game in the City of Aaron");
                Player playersName = new Player();
                Player player = GameControl.savePlayer(playersName);
                GameMenuView newGame = new GameMenuView();
                newGame.display();
                break;
            case "2":
                System.out.println("Welcome back to the City of Aaron");
                break;
            case "3":
                HelpMenu newHelp = new HelpMenu();
                newHelp.display();
                break;

        }
        return false;
    }

}
