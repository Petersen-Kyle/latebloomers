/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.view.EndOfYearView;

/**
 *
 * @author lafon
 */
public class TithesControl {

    public static int tithes(String tithesPaid, Game game) throws GameControlException {
        int tithesToPay = Integer.parseInt(tithesPaid);
        
        if (game.isTithesPaid()) {
            System.out.println("You have already paid tithes this year.\n");
            EndOfYearView end = new EndOfYearView();
            end.display();
        }

        game.setTithesPaid(false);

        if (tithesToPay >= 0) {
            game.setTithesPaid(true);
        }

        if (tithesToPay < 0) {
            throw new GameControlException("You need to enter a positive number");
        } else if (tithesToPay > game.getWheat()) {
            throw new GameControlException("You dont have that much Wheat");
        } else if (((tithesToPay / game.getIncrease()) * 100) <= 8) {
            game.setPerAcre((int) (Math.random() * 2) + 1);
        } else if (((tithesToPay / game.getIncrease()) * 100) >= 12) {
            game.setPerAcre((int) (Math.random() * 3) + 2);
        } else {
            game.setPerAcre((int) (Math.random() * 2) + 2);
        }
        
        int chanceOfRats = ((int) (Math.random() * 100) + 1);
        if (chanceOfRats < 30 && ((tithesToPay / game.getIncrease()) * 100) < 8 ) {
            game.setRatsEat(game.getWheat() * (((int)(Math.random() * 4) + 6) / 100));
        } else if (chanceOfRats < 30 && ((tithesToPay / game.getIncrease()) * 100) > 12){
            game.setRatsEat(game.getWheat() * (((int)(Math.random() * 2) + 3) / 100));
        } else {game.setRatsEat(game.getWheat() * (((int)(Math.random() * 4) + 3) / 100));        
        }

        game.setTithe(tithesToPay);
        game.setWheat(game.getWheat() - game.getTithe());
        game.setIncrease(1);
        return game.getWheat();
    }
}
