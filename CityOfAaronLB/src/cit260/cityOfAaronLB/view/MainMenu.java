/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;
import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;
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
                    clearScreen();
                    GameMenuView newGame = new GameMenuView();
                    Player playersName = CityOfAaronLB.getPlayer();
                    GameControl.createNewGame(playersName);
                    this.console.println("Lord " + player.getName() + " you have: \n"
                            + "\nYear:               " + game.getYear()
                            + "\nPeople Starved:     " + game.getStarved()
                            + "\nMoved to City:      " + game.getNewPop()
                            + "\nCurrent Population: " + game.getPopulation()
                            + "\nAcres Owned:        " + game.getAcres()
                            + "\nWheat per Acre:     " + game.getPerAcre()
                            + "\nWheat in Storage:   " + game.getWheat()
                            + "\nAmount of Tithes:   " + game.getTithe()
                            + "\nEaten by Rats:      " + game.getRatsEat()
                            + "\n");
                    this.console.println("Welcome to a new game in the City of Aaron \r\n");
                    this.console.printf("\n According to The Book of Mormon, the city of Aaron was located near Nephihah, \n"
                            + "Nephihah, though constructed earlier. Prior to the construction of Nephihah, its \n"
                            + "nearest known neighbor was Moroni. The book first tells of the city of Aaron when \n"
                            + "Alma, rejected at Ammonihah, departed and took his journey toward the city of Aaron \n"
                            + "about 82 BC (Alma 8:13), but he stopped and returned to Ammonihah. The only other \n"
                            + "verse mentioning the city of Aaron is when the foundation is laid for the city of \n"
                            + "Nephihah around 72 BC. (Alma 50:14). In the index of the 1989 edition (and others) \n"
                            + "of the book, it is acknowledged that there may have been two cities by this name. \r\n\n\n");
                    newGame.display();
                    break;
                case "2":
                    this.console.println("Welcome back to the City of Aaron");
                    loadGame();
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
        } catch (Exception err) {
            this.console.println("\nINVALID INPUT!");
        }
        return false;
    }

    private void loadGame() {
        String filePath = getInput("Enter your saved game file: ");
        try {
            System.out.println("Lord " + player.getName() + "you have: \n"
                    + "\nYear:               " + game.getYear()
                    + "\nPeople Starved:     " + game.getStarved()
                    + "\nMoved to City:      " + game.getNewPop()
                    + "\nCurrent Population: " + game.getPopulation()
                    + "\nAcres Owned:        " + game.getAcres()
                    + "\nWheat per Acre:     " + game.getPerAcre()
                    + "\nWheat in Storage:   " + game.getWheat()
                    + "\nAmount of Tithes:   " + game.getTithe()
                    + "\nEaten by Rats:      " + game.getRatsEat()
                    + "\n");

            Game game = GameControl.loadGame(filePath);
            CityOfAaronLB.setGame(game);
            GameMenuView newGame = new GameMenuView();
            newGame.display();
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

}
