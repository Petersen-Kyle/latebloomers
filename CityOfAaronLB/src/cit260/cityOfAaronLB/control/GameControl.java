/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import CityOfAaronLB.CityOfAaronLB;
import cit260.cityOfAaronLB.model.Player;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;



/**
 *
 * @author pytha
 */
public class GameControl {
    
     public static int createNewGame(Player player) {

            Game currentGame = new Game();
            currentGame.setPlayer(player);
            CityOfAaronLB.setGame(currentGame);
            // items = createItems(); Need to create later!!
            Map map = createMap(currentGame, 5, 5);
                if (map == null) {
                    return -2;
                }
                currentGame.setMap(map);
            return 1;
        
    }
     public static Map createMap(Game game, int noOfRows, int noOfColumns) {
         if (game == null || noOfRows <= 0 || noOfColumns <= 0){
             return null;
         }
         Map map = new Map();
         map.setRows(noOfRows);
         map.setColumns(noOfColumns);
         game.setMap(map);
         
        Location locations[][] = createLocations(noOfRows, noOfColumns); 
        map.setLocations(locations);
        return map;
         
     }
     public static Location[][] createLocations(int rows, int columns) {
         Location[][] locations = new Location[rows][columns];
         for (int row = 0; row < rows; row++)
             for (int column = 0; column < columns; column++){
                 Location location = new Location();
                 location.setRow(row);
                 location.setColumn(column);
                 location.setVisited(false);
                 locations[row][column] = location;
             }
         locations[0][0].setName("Temple");
         locations[0][0].setDescription("The beautiful white temple ");
         locations[0][0].setSceneSymbol("TE");
         locations[0][1].setName("Wheat Field");
         locations[0][1].setDescription("The beautiful white temple ");
         locations[0][1].setSceneSymbol("TE");         
         
     return locations;    
     }
     
}
