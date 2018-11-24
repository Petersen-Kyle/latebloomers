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
         locations[0][0].setDescription("The beautiful white temple");
         locations[0][0].setSceneSymbol("TE");
         locations[0][1].setName("Wheat Field");
         locations[0][1].setDescription("The Wheat Field is flowing in the breeze, ready to harvest");
         locations[0][1].setSceneSymbol("WF");         
         locations[0][2].setName("Wheat Field");
         locations[0][2].setDescription("The golden wheat field glows in the noon day sun");
         locations[0][2].setSceneSymbol("WF");
         locations[0][3].setName("River");
         locations[0][3].setDescription("Description");
         locations[0][3].setSceneSymbol("RV");
         locations[0][4].setName("Granary");
         locations[0][4].setDescription("Description");
         locations[0][4].setSceneSymbol("GN");
         locations[1][0].setName("Wheat Field");
         locations[1][0].setDescription("Description");
         locations[1][0].setSceneSymbol("WF");
         locations[1][1].setName("Wheat Field");
         locations[1][1].setDescription("Description");
         locations[1][1].setSceneSymbol("WF");
         locations[1][2].setName("River");
         locations[1][2].setDescription("Description");
         locations[1][2].setSceneSymbol("RV");
         locations[1][3].setName("Wheat Field");
         locations[1][3].setDescription("Description");
         locations[1][3].setSceneSymbol("WF");
         locations[1][4].setName("Wheat Field");
         locations[1][4].setDescription("Description");
         locations[1][4].setSceneSymbol("WF");
         locations[2][0].setName("Wheat Field");
         locations[2][0].setDescription("Description");
         locations[2][0].setSceneSymbol("WF");
         locations[2][1].setName("River");
         locations[2][1].setDescription("Description");
         locations[2][1].setSceneSymbol("RV");
         locations[2][2].setName("Rulers Court");
         locations[2][2].setDescription("Description");
         locations[2][2].setSceneSymbol("RC");
         locations[2][3].setName("Wheat Field");
         locations[2][3].setDescription("Description");
         locations[2][3].setSceneSymbol("WF");
         locations[2][4].setName("Storehouse");
         locations[2][4].setDescription("Description");
         locations[2][4].setSceneSymbol("SH");
         locations[3][0].setName("River");
         locations[3][0].setDescription("Description");
         locations[3][0].setSceneSymbol("RV");
         locations[3][1].setName("Wheat Field");
         locations[3][1].setDescription("Description");
         locations[3][1].setSceneSymbol("WF");
         locations[3][2].setName("Wheat Field");
         locations[3][2].setDescription("Description");
         locations[3][2].setSceneSymbol("WF");
         locations[3][3].setName("Wheat Field");
         locations[3][3].setDescription("Description");
         locations[3][3].setSceneSymbol("WF");
         locations[3][4].setName("Wheat Field");
         locations[3][4].setDescription("Description");
         locations[3][4].setSceneSymbol("WF");
         locations[4][0].setName("Undeveloped");
         locations[4][0].setDescription("Description");
         locations[4][0].setSceneSymbol("??");
         locations[4][1].setName("Undeveloped");
         locations[4][1].setDescription("Description");
         locations[4][1].setSceneSymbol("??");
         locations[4][2].setName("Undeveloped");
         locations[4][2].setDescription("Description");
         locations[4][2].setSceneSymbol("??");
         locations[4][3].setName("Villiage");
         locations[4][3].setDescription("Description");
         locations[4][3].setSceneSymbol("VG");
         locations[4][4].setName("Undeveloped");
         locations[4][4].setDescription("Description");
         locations[4][4].setSceneSymbol("??");
         
     return locations;    
     }
     
}
