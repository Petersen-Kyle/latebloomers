/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import CityOfAaronLB.CityOfAaronLB;
import static cit260.cityOfAaronLB.control.MapControl.createMap;
import cit260.cityOfAaronLB.model.Animals;
import cit260.cityOfAaronLB.model.Player;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;
import cit260.cityOfAaronLB.model.Item;
import cit260.cityOfAaronLB.model.Tools;
import cit260.cityOfAaronLB.model.Weapons;

/**
 *
 * @author pytha
 */
public class GameControl {

    public static int createNewGame(Player player) {

        Game currentGame = new Game();
        currentGame.setPlayer(player);
        CityOfAaronLB.setGame(currentGame);
        //items = Item.createItems(); //Need to create later!!
        Map map = createMap(currentGame, 5, 5);
        if (map == null) {
            return -2;
        }
        currentGame.setMap(map);
        return 1;

    }
}
