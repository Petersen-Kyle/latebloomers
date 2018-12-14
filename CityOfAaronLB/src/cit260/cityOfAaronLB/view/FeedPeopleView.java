/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import cit260.cityOfAaronLB.control.FeedPeopleControl;
import cit260.cityOfAaronLB.model.Game;

/**
 *
 * @author lafon
 */
public class FeedPeopleView extends View {

    public FeedPeopleView() {
        super("Your population is " + game.getPopulation() + "\n"
                + "Your wheat in storage is " + game.getWheat() + "\n"
                + "You need 20 bushels to feed 1 person.\n"
                + "Enter the amount of wheat to feed your people:\n");
    }

    @Override
    public boolean doAction(String inputs) {
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int intFeed = Integer.parseInt(inputs);
        int feed = -1;
        try {
            feed = FeedPeopleControl.feedPeople(inputs, game);
        } catch (Exception ex) {
            this.console.println(ex.getMessage());
        }
        if (feed >= 0) {
            this.console.println("You fed " + intFeed / 20 + " people.");
            this.console.println("You now have " + game.getWheat() + " wheat in storage");
            this.console.println(game.getStarved() + " people starved");
            this.console.println("Your population is now " + game.getPopulation() + "\n");
        }
        return true;

    }
}
