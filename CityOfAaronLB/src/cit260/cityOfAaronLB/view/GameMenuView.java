/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;
import cit260.cityOfAaronLB.control.AdjustmentsControl;
//import cit260.cityOfAaronLB.control.AdjustmentsControl;
import cit260.cityOfAaronLB.control.MoveLocation;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;
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
                + "6. Feed the People\n"
                + "7. Save Game \n"
                + "8. Help Menu\n"
                + "9. Tithes \n"
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
                    AdjustmentsControl adjustments = new AdjustmentsControl();                   
                    adjustments.adjustments();
                    
                    break;
                case "3":
                    clearScreen();
                    this.console.println("Lord " + player.getName() + "you have: \n"
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
                    LandControlView controlLand = new LandControlView();
                    controlLand.display();

                    break;
                case "4":
                    StorehouseMenu newStorehouseMenu = new StorehouseMenu();
                    newStorehouseMenu.display();
                    break;
                case "5":
                    clearScreen();
                    ReportView newReports = new ReportView();
                    newReports.display();
                    break;
                case "6":
                    FeedPeopleView feedPeople = new FeedPeopleView();
                    feedPeople.display();
                    break;
                case "7":
//                this.console.println("Save your game");
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
