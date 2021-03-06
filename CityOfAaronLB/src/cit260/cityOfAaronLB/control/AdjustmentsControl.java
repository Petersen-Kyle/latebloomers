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
import cit260.cityOfAaronLB.model.Item;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;

/**
 *
 * @author lafon
 */
public class AdjustmentsControl {

    public static Item adjustments() {
        Map map = game.getMap();
        Item item = new Item();
        Location location = map.getCurrentLocation();
        Location[][] locations = map.getLocations();
            int row = map.getCurrentRow();
            int column = map.getCurrentColumn();
                if (locations[row][column].isVisited()) {
                    System.out.println("\nYou have already received the bonus for this spot.");
                    return item;
                } else if (!locations[row][column].isVisited()) {
                    System.out.println("\nYou found a " + location.getItem().getItemName());
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
                    map.getCurrentLocation().setVisited(true);
                    return item;
        }
        return item;
    }

}
