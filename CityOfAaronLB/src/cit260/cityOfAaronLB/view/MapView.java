/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Map;
import cit260.cityOfAaronLB.model.Location;

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
      Location[][] locations = map.getLocations(); // retreive the locations from map
        // Build the heading of the map
        System.out.print("  |");
        for( int column = 0; column < locations[0].length; column++){
          // print col numbers to side of map
          System.out.print("  " + column + " |"); 
        }
        // Now build the map.  For each row, show the column information
        System.out.println();
        for( int row = 0; row < locations.length; row++){
         System.out.print(row + " "); // print row numbers to side of map
          for( int column = 0; column < locations[row].length; column++){
            // set default indicators as blanks
            leftIndicator = " ";
            rightIndicator = " ";
            if(locations[row][column] == map.getCurrentLocation()){
              // Set star indicators to show this is the current location.
              leftIndicator = "*"; 
              rightIndicator = "*"; 
            } 
            else if(locations[row][column].isVisited()){
               // Set < > indicators to show this location has been visited.
               leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
               rightIndicator = "<"; // same as above
            }
           System.out.print("|"); // start map with a |
            if(locations[row][column].getScene() == null)
            {
                 // No scene assigned here so use ?? for the symbol
                 System.out.print(leftIndicator + "??" + rightIndicator);
            }
            else
              System.out.print(leftIndicator
                 + locations[row][column].getScene().getMapSymbol()
                 + rightIndicator);
          }
         System.out.println("|");
        }
     }


//    public void displayMap() {
//        System.out.println(
//                  "       0          1          2          3          4      \n"
//                + "   __________ __________ __________ __________ __________ \n"
//                + "  |          |          |          |          |          |\n"
//                + "0 | Temple(1)| Wheat(2) | Wheat(3) | River(4) |Granary(5)|\n"
//                + "  |__________|__________|__________|__________|__________|\n"
//                + "  |          |          |          |          |          |\n"
//                + "1 | Wheat(6) | Wheat(7) | River(8) | Wheat(9) | Wheat(10)|\n"
//                + "  |__________|__________|__________|__________|__________|\n"
//                + "  |          |          |  Rulers  |          |          |\n"
//                + "2 | Wheat(11)| River(12)| Court(13)| Wheat(14)|Storehouse|\n"
//                + "  |__________|__________|__________|__________|___(15)___|\n"
//                + "  |          |          |          |          |          |\n"
//                + "3 | River(16)| Wheat(17)| Wheat(18)| Wheat(19)| Wheat(20)|\n"
//                + "  |__________|__________|__________|__________|__________|\n"
//                + "  |          |          |          |          |          |\n"
//                + "4 |Undevelop |Undevelop |Undevelop | Villiage |Undevelop |\n"
//                + "  |___(21)___|__(22)____|___(23)___|___(24)___|___(25)___|\n");
//    }
}
