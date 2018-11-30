/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.AnimalSortControl;
import cit260.cityOfAaronLB.control.MapControl;
import cit260.cityOfAaronLB.model.Map;


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
                + "7. Save Game\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs) {

        switch(inputs) {
        case "1":
            System.out.println("City of Aaron Map");
            MapView newMap = new MapView();
            newMap.displayMap();
            break;
        case "2":
            MoveLocation move = new MoveLocation();
            move.display();
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
            AnimalSortControl sort = new AnimalSortControl();
            sort.sortAnimal();
            break;
        case "7":
            System.out.println("Save your game");
            break;
         
                       
    }
    System.out.println();
        return false;
    }
    
}
