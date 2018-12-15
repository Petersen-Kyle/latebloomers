/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;
import cit260.cityOfAaronLB.control.AdjustmentsControl;
import cit260.cityOfAaronLB.control.MoveLocation;
import java.util.InputMismatchException;

/**
 *
 * @author pytha
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("Game Menu\n"
                + "1. View the Map\n"
                + "2. Move to a new location\n"
                + "3. Buy/Sell Land\n"
                + "4. Storehouse/Statistics\n"
                + "5. Reports Menu\n"
                + "6. End of the year \n"
                + "7. Save Game \n"
                + "8. Help Menu\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs) {

        try {
            switch (inputs) {
                case "1":
                    this.console.println("City of Aaron Map");
                    displayMap();
                    break;
                case "2":
                    MoveLocation move = new MoveLocation();
                    move.display();
                    displayMap();
                    AdjustmentsControl.adjustments();
                    
                    break;
                case "3":
                    clearScreen();
                    this.console.println("Lord " + player.getName() + "you have: \n"
                            + "\nYear:               " + game.getYear()
                            + "\nPeople Starved:     " + game.getStarved()
                            + "\nMoved to City:      " + game.getNewPop()
                            + "\nCurrent Population: " + game.getPopulation()
                            + "\nAcres Owned:        " + game.getAcres()
                            + "\nReturn per Acre:    " + game.getPerAcre()
                            + "\nCost per Acre:      " + game.getPerWheat()
                            + "\nWheat in Storage:   " + game.getWheat()
                            + "\nAmount of Tithes:   " + game.getTithe()
                            + "\nEaten by Rats:      " + game.getRatsEat()
                            + "\n");
                    LandControlView controlLand = new LandControlView();
                    controlLand.display();

                    break;
                case "4":
                    StorehouseMenu storehouse = new StorehouseMenu();
                    storehouse.display();
                    break;
                case "5":
                    clearScreen();
                    ReportView newReports = new ReportView();
                    newReports.display();
                    break;
                case "6":
                    EndOfYearView eOTY = new EndOfYearView();
                    eOTY.display();
                    break;
                case "7":
                    this.saveGame();
                    break;
                case "8":
                    HelpMenu newHelp = new HelpMenu();
                    newHelp.display();
                    break;
                case "9":
                    TithesView tithes = new TithesView();
                    tithes.display();
                    break;
                default:
                    this.console.println("Invalid Input"
                            + "\nPlease enter a number 1 - 8 or Q to quit");
                    break;

            }
        } catch (InputMismatchException err) {
            this.console.println("\nINVALID INPUT!");
        }
        this.console.println();
        return false;
    }

    public void displayMap() {
        MapView newMap = new MapView();
        newMap.displayMap();

    }

    public void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }
}
