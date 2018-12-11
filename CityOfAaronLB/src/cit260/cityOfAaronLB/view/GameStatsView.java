/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;

/**
 *
 * @author mtsmith
 */
public class GameStatsView {
    
    public GameStatsView() {
        
    }
    
    public boolean gameStats() {
        System.out.println("Lord " + player.getName() + "you have: \n" +
              "\nYear:               " + game.getYear() +
              "\nPeople Starved:     " + game.getStarved() +
              "\nMoved to City:      " + game.getNewPop() +
              "\nCurrent Population: " + game.getPopulation() +
              "\nAcres Owned:        " + game.getAcres() +
              "\nWheat per Acre:     " + game.getPerAcre() +
              "\nWheat in Storage:   " + game.getWheat() +
              "\nAmount of Tithes:   " + game.getTithe() +
              "\nEaten by Rats:      " + game.getRatsEat() +
              "\n");
        
        return true;
    }

}
