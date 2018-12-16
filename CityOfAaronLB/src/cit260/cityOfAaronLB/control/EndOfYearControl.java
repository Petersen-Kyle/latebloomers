/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import static CityOfAaronLB.CityOfAaronLB.game;

/**
 *
 * @author pytha
 */
public class EndOfYearControl {
    
    public void EndOfYearControl() {
        
    }
    
    public static void endYear() {
        
                    game.setPeopleFed(false);
                    game.setAcresTheyPlanted(false);
                    game.setTithesPaid(false);
                    game.setYear(game.getYear() + 1);
                    game.setNewPop((int) (Math.random() * 4) + 2);
                    game.setPopulation(game.getPopulation() + game.getNewPop());
                    game.setWheat(game.getWheat() + game.getHarvestReturn());
       
    }
}
