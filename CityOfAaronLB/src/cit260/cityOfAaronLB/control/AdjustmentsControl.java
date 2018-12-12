/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

/**
 *
 * @author lafon
 */
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static CityOfAaronLB.CityOfAaronLB.game;
import cit260.cityOfAaronLB.model.Adjustments;
import cit260.cityOfAaronLB.model.Item;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;

/**
 *
 * @author lafon
 */
public class AdjustmentsControl {

    public Item adjustments() {
        Map map = game.getMap();
        Location location = map.getCurrentLocation();
        System.out.println("\nYou found a " + location.getItem().getItemName());
        Item item = new Item();
        item.setAdjustments(location.getItem().getAdjustments());
        if (item.getAdjustments() < 0) {
            item.setDescription(location.getItem().getNegativeDescription());
        } else if (item.getAdjustments() > 0) {
            item.setDescription(location.getItem().getPositiveDescription());
        } else {
            item.setDescription(location.getItem().getPositiveDescription() + "\nOut of luck, the wind was strong and blew away the extra wheat.");
        }
        System.out.println(item.getDescription());
        System.out.println("The adjustment is: " + location.getItem().getAdjustments());
        game.setWheat(game.getWheat() + item.getAdjustments());
        System.out.println("\nYou now have " + game.getWheat() + " wheat in storage");
        return item;
    }
}


