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
         locations[2][3].setDescription("A freshly husked field is laid before your eyes. \n"
                                      + "You are excited to replant as the sun goes down on \n"
                                      + "a days hard work.");
         locations[2][3].setSceneSymbol("WF");
         locations[2][4].setName("Storehouse");
         locations[2][4].setDescription("You can tell that hard work has been done \n"
                                      + "as the shelves are filled with items of all \n"
                                      + "kinds.");
         locations[2][4].setSceneSymbol("SH");
         locations[3][0].setName("River");
         locations[3][0].setDescription("You hear the frogs croak as the river makes \n"
                                      + "its way through. Water cascading down over \n"
                                      + "rocks and fallen branches.");
         locations[3][0].setSceneSymbol("RV");
         locations[3][1].setName("Wheat Field");
         locations[3][1].setDescription("Children running thorugh the stalks playing hide \n"
                                      + "and seek fill your view and the stalks gently \n"
                                      + "sway from the tiny feet running past them.");
         locations[3][1].setSceneSymbol("WF");
         locations[3][2].setName("Wheat Field");
         locations[3][2].setDescription("The smell of wheat fills your nostrils as you \n"
                                      + "take in a deep breathe of the sweet aroma. The \n"
                                      + "colors of brown and yellow dance before your eyes \n"
                                      + "as the stalks sway in the wind.");
         locations[3][2].setSceneSymbol("WF");
         locations[3][3].setName("Wheat Field");
         locations[3][3].setDescription("Nothing but wheat for miles around. You stare \n"
                                      + "as the ensuing sunset casts shadows over the \n"
                                      + "the field illuminating it different colors.");
         locations[3][3].setSceneSymbol("WF");
         locations[3][4].setName("Wheat Field");
         locations[3][4].setDescription("The tall stalks brush across your face as you make \n"
                                      + "your way through the golden fields. The sun shines \n"
                                      + "even brighter as it glints off the stalks.");
         locations[3][4].setSceneSymbol("WF");
         locations[4][0].setName("Undeveloped");
         locations[4][0].setDescription("You smell the sweet aroma of flowers as you gaze \n "
                                      + "at the beauty around you. Weeds liter the ground \n"
                                      + "with bits of color scaterred between them.");
         locations[4][0].setSceneSymbol("??");
         locations[4][1].setName("Undeveloped");
         locations[4][1].setDescription("Trees loom high above you as you watch in awe \n"
                                      + "at the birds fluttering about. you catch a glimpse \n"
                                      + "of a deer making its way through the brush.");
         locations[4][1].setSceneSymbol("??");
         locations[4][2].setName("Undeveloped");
         locations[4][2].setDescription("Tall greass liters that land with all kinds of \n"
                                      + "flowers growing between the blades. It seems \n"
                                      + "peaceful as the sun warms your face.");
         locations[4][2].setSceneSymbol("??");
         locations[4][3].setName("Villiage");
         locations[4][3].setDescription("Humble homes line the streets and children are running \n"
                                      + "through the streets as you enter the villiage. People \n"
                                      + "greet you as you make your way down the dirt roads worn \n"
                                      + "by many feet bustling about. You see people going about \n "
                                      + "tending to fields and cattle preparing to feed thier\n"
                                      + "families and those in need.");
         locations[4][3].setSceneSymbol("VG");
         locations[4][4].setName("Undeveloped");
         locations[4][4].setDescription("You enter a large field of dirt and fresh mud \n"
                                      + "created from the freshly fallen rain. You watch \n"
                                      + "your step as you move around envisioning the \n"
                                      + "potential the land has to become something great.");
         locations[4][4].setSceneSymbol("??");
         
     return locations;    
     }
     
}
