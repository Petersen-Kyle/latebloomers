/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Item;
import cit260.cityOfAaronLB.model.Map;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Player;

/**
 *
 * @author lafon
 */
public class MapView {

    public void displayMap() {
        String leftIndicator;
        String rightIndicator;
        Game game = CityOfAaronLB.getGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Player player = CityOfAaronLB.getPlayer();
        Location[][] locations = map.getLocations(); // retreive the locations from map
        Location currentLocation = map.getCurrentLocation();
        for (int clear = 0; clear < 1000; clear++) {
                    System.out.println("\b");
                }
        // Build the heading of the map
        System.out.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            // print col numbers to side of map
            System.out.print("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == currentLocation) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
//            if(locations[row][column].getSceneSymbol() = null) {
//                 // No scene assigned here so use ?? for the symbol
//                 System.out.print(leftIndicator + "??" + rightIndicator);
//            }
//            else
                System.out.print(leftIndicator
                        + locations[row][column].getSceneSymbol()
                        + rightIndicator);
            }

            System.out.println("|");

        }
        
        System.out.println("\nLord " + player.getName() + " you have entered " + currentLocation.getName());
        System.out.println("\n" + currentLocation.getDescription());
        System.out.println("\nYou found a " + currentLocation.getItem().getItemName());
        System.out.println("\n" + currentLocation.getItem().getNegativeDescription());
        System.out.println("\nYou now have " + game.getWheat() + " wheat in storage");
    }
}
