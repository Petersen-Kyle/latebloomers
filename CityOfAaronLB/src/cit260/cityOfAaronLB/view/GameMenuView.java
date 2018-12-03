/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.SortControl;
import cit260.cityOfAaronLB.control.MapControl;
import cit260.cityOfAaronLB.control.calcFeedThePeopleControl;
import static cit260.cityOfAaronLB.control.calcFeedThePeopleControl.calcFeedThePeople;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pytha
 */
public class GameMenuView extends View{
    
    public GameMenuView() {
        super("Game Menu\n"
                + "1. View the Map\n"
                + "2. Move to a new location\n"
                + "3. Manage Crops and Land\n"
                + "4. Storehouse\n"
                + "5. Reports Menu\n"
                + "6. Animal Adjustments\n"
                + "7. Feed the People \n"
                + "8. Save Game\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs){

        switch(inputs) {
        case "1":
            System.out.println("City of Aaron Map");
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
            StorehouseMenu newStorehouseMenu = new StorehouseMenu();
            newStorehouseMenu.display();
            break;
        case "5":
            System.out.println("Open the reports menu");
            break;  
        case "6":
            SortControl sort = new SortControl();
            sort.sortAnimal();
            break;
        case "7":
        {
            try {
                int wheatLeftover = calcFeedThePeopleControl.calcFeedThePeople(-1,5,5,5,5);
                System.out.println("Wheat Leftover = " + wheatLeftover);
            } catch (GameControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
            break;
        case "8":
            System.out.println("Save your game");
            break;
         
                       
    }
    System.out.println();
        return false;
    }
    
    public void displayMap(){
            MapView newMap = new MapView();
            newMap.displayMap();
    }
    
}
