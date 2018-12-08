/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import cit260.cityOfAaronLB.control.MoveLocation;
import cit260.cityOfAaronLB.control.SortControl;
import cit260.cityOfAaronLB.control.calcFeedThePeopleControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
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
                + "4. Storehouse\n"
                + "5. Reports Menu\n"
                + "6. Animal Adjustments\n"
                + "7. Feed the People \n"
                + "8. Save Game\n"
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
                    break;
                case "3":
                    clearScreen();
                    this.console.println("Current Population: " + game.getPopulation()
                            + "\n Current Acres Owned: " + game.getAcres()
                            + "\n Current Wheat in Storage: " + game.getWheat());
                    LandControlView controlLand = new LandControlView();
                    controlLand.display();
                    break;
//            case "":
//                BuyLandView buyland = new BuyLandView();
//                buyland.display();
//                break;
                case "4":
                    StorehouseMenu newStorehouseMenu = new StorehouseMenu();
                    newStorehouseMenu.display();
                    break;
                case "5":
                    for (int clear = 0; clear < 1000; clear++) {
                        System.out.println("\b");
                    }
                    ReportView newReports = new ReportView();
                    newReports.display();
                    break;
                case "6":
                    SortControl sort = new SortControl();
                    sort.sortAnimal();
                    break;
                case "7": {
                    try {
                        int wheatLeftover = calcFeedThePeopleControl.calcFeedThePeople(5, 5, 5, 5, -1);
                        this.console.println("Wheat Leftover = " + wheatLeftover);
                    } catch (GameControlException ex) {
                        this.console.println(ex.getMessage());
                    }
                }
                break;
                case "8":
//                this.console.println("Save your game");
                    this.saveGame();
                    break;
                case "9":
                    HelpMenu newHelp = new HelpMenu();
                    newHelp.display();
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
