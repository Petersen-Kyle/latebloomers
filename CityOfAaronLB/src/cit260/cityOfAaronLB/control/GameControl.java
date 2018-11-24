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
         locations[0][0].setDescription("The beautiful white temple stands on the hill a sparkling bastion of peace.  A steady line of the faithful wind thier way ever closer to worship at the beautiful ediface.  You are humbled by its shear magisty and the sacrifice made by the people to make it so beautiful.");
         locations[0][0].setSceneSymbol("TE");
         locations[0][1].setName("Wheat Field");
         locations[0][1].setDescription("The Wheat Field is flowing in the breeze, ready to harvest");
         locations[0][1].setSceneSymbol("WF");         
         locations[0][2].setName("Wheat Field");
         locations[0][2].setDescription("The golden wheat field glows in the noon day sun");
         locations[0][2].setSceneSymbol("WF");
         locations[0][3].setName("River");
         locations[0][3].setDescription("The great river Sidon enters the Land of Aaron here.  Its rushing waters bring life to all the lands that it touches.  Care must be taken not to live or plant too near the river due to its nature to flood in the spring.");
         locations[0][3].setSceneSymbol("RV");
         locations[0][4].setName("Granary");
         locations[0][4].setDescription("This large set of granary bins is used by all the people of the area to store the surplus wheat.  In times of famine these grain bins provide a steady source of food for the people of Aaron.");
         locations[0][4].setSceneSymbol("GN");
         locations[1][0].setName("Wheat Field");
         locations[1][0].setDescription("This field is full of new rising wheat plants.  You can see people from the village carefully weeding the rows, destroying bugs that might cause harm to the growing plants.");
         locations[1][0].setSceneSymbol("WF");
         locations[1][1].setName("Wheat Field");
         locations[1][1].setDescription("The tender shoots of a newly planted field are just visable after the recent rain.  Strange looking scarecrows are stationed stratigicly throughout the area to keep the wild birds from eating the tiny growths.");
         locations[1][1].setSceneSymbol("WF");
         locations[1][2].setName("River");
         locations[1][2].setDescription("The river speads out in this area. Slowing its rapid flow and making an easy crossing point for travelers.  You can see youth spashing around in the water cooling off in the heat of the day.  ");
         locations[1][2].setSceneSymbol("RV");
         locations[1][3].setName("Wheat Field");
         locations[1][3].setDescription("This wheat field is almost completely grown.  Nearly ready to harvest, villagers are bringing in baskets, and setting up a treshing floor so that once the harvest begins it can be completed quickly.");
         locations[1][3].setSceneSymbol("WF");
         locations[1][4].setName("Wheat Field");
         locations[1][4].setDescription("The nearly grown wheat in this field is completly unattended.  Only the soft breeze, the sound of small insects and the distant river can be heard here.");
         locations[1][4].setSceneSymbol("WF");
         locations[2][0].setName("Wheat Field");
         locations[2][0].setDescription("The land here slopes down slightly from the river with irrigation furrows carrying the water to the wheat plants.  Several men and youth are working to deepen and stabalize the irragation furrows to keep the plants watered. ");
         locations[2][0].setSceneSymbol("WF");
         locations[2][1].setName("River");
         locations[2][1].setDescription("The river becomes very deep here, flowing quickly through the area.  Lined by huge trees on both sides, fishermen often come to this area catching the fish that hide in the shadows from the trees.");
         locations[2][1].setSceneSymbol("RV");
         locations[2][2].setName("Rulers Court");
         locations[2][2].setDescription("Deeply dug trenches lead to tall mounds of earth topped with wodden pickets.  Soldiers patrol the walls, taking turns at watch on the towers, watching for attacks from any direction.  The threat of Lamanite attack is always possible, and Captain Moroni has ordered that a constant watch be kept.  Swift riders are stationed near the entrance to bring word of attack to the outlieing areas.  Durning an attack all the poeple of the village, and surrounding area would come to the rulers court for protection from the invaders.");
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
