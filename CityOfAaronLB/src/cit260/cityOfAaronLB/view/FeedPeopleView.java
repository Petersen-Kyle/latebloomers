/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.FeedPeopleControl;
import cit260.cityOfAaronLB.exceptions.GameControlException;
import cit260.cityOfAaronLB.model.Game;

/**
 *
 * @author pytha
 */
public class FeedPeopleView extends View {

    public FeedPeopleView() {
        super("Enter the amount of people to feed: ");

    }

    @Override
    public boolean doAction(String inputs) {
        Game game = CityOfAaronLB.CityOfAaronLB.getGame();
        int feed = -1;
        try {
            feed = FeedPeopleControl.feedPeople(inputs, game);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
        if (feed >= 0) {
            this.console.println("You fed " + inputs + " people.");
            this.console.println("You now have " + game.getWheat() + " Wheat in storage.");
        }
            return true;
        }

    }
