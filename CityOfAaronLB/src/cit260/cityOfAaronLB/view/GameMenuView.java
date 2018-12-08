/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.MoveLocation;
import cit260.cityOfAaronLB.control.SortControl;
import cit260.cityOfAaronLB.control.calcFeedThePeopleControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;

/**
 *
 * @author pytha
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("Game Menu\n"
                + "1. View the Map\n"
                + "2. Move to a new location\n"
                + "3. Sell Land\n"
                + "4. Buy Land\n"
                + "5. Storehouse\n"
                + "6. Reports Menu\n"
                + "7. Animal Adjustments\n"
                + "8. Feed the People \n"
                + "9. Save Game\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs) {

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
                SellLandView sellLand = new SellLandView();
                sellLand.display();
                break;
            case "4":
                BuyLandView buyland = new BuyLandView();
                buyland.display();
                break;
            case "5":
                StorehouseMenu newStorehouseMenu = new StorehouseMenu();
                newStorehouseMenu.display();
                break;
            case "6":
                this.console.println("Open the reports menu");
                break;
            case "7":
                SortControl sort = new SortControl();
                sort.sortAnimal();
                break;
            case "8": {
                try {
                    int wheatLeftover = calcFeedThePeopleControl.calcFeedThePeople(5, 5, 5, 5, -1);
                    this.console.println("Wheat Leftover = " + wheatLeftover);
                } catch (GameControlException ex) {
                    this.console.println(ex.getMessage());
                }
            }
            break;
            case "9":
                this.console.println("Save your game");
//                this.saveGame();
                break;

        }
        this.console.println();
        return false;
    }

    public void displayMap() {
        MapView newMap = new MapView();
        newMap.displayMap();

    }

//    public static void saveGame(CityOfAaronLB.CityOfAaronLB game, String filePath) {
//        SaveGameView saveGameView = new SaveGameView();
//        saveGameView.display();
//    }

}
