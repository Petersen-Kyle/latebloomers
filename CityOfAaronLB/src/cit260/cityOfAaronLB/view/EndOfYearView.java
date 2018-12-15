/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;
import java.util.InputMismatchException;

/**
 *
 * @author pytha
 */
public class EndOfYearView extends View {

    public EndOfYearView() {
        super("End of the year\n"
                + "1. Feed the people\n"
                + "2. Plant acres\n"
                + "3. Pay tithing\n"
                + "4. End Year\n"
                + "Choose one or (Q to quit to game menu)");

    }

    @Override
    public boolean doAction(String inputs) {
        try {
            switch (inputs) {
                case "1":
                    FeedPeopleView feed = new FeedPeopleView();
                    feed.display();
                    break;
                case "2":
                    LandHarvestedView land = new LandHarvestedView();
                    land.display();
                    break;
                case "3":
                    TithesView tithes = new TithesView();
                    tithes.display();
                    break;
                case "4":
                    if (!game.isPeopleFed()) {
                        System.out.println("You need to Feed the People\n");
                        break;
                    } else if (!game.isAcresTheyPlanted()) {
                        System.out.println("You need to plant acres\n");
                        break;
                    } else if (!game.isTithesPaid()) {
                        System.out.println("You need to enter how much tithes you want to pay\n");
                        break;
                    } else {

                        if (game.getYear() > 10) {
                            this.console.println("Congratulations! You won!");
                            System.exit(0);
                        }
                        if (game.getPopulation() < 50) {
                            System.out.println("The people have dethroned you. Too many people starved.");
                            System.exit(0);
                        }

                        game.setPeopleFed(false);
                        game.setAcresTheyPlanted(false);
                        game.setTithesPaid(false);
                        game.setYear(game.getYear() + 1);
                        game.setNewPop((int) (Math.random() * 4) + 2);
                        game.setPopulation(game.getPopulation() + game.getNewPop());
                        game.setWheat(game.getWheat() + game.getIncrease());
                        this.console.println(game.getNewPop() + " people moved to the city");
                        this.console.println("Your population is now " + game.getPopulation() + " people\n");
                        System.out.println("Lord " + player.getName() + " you have: \n"
                                + "\nYear:               " + game.getYear()
                                + "\nPeople Starved:     " + game.getStarved()
                                + "\nMoved to City:      " + game.getNewPop()
                                + "\nCurrent Population: " + game.getPopulation()
                                + "\nAcres Owned:        " + game.getAcres()
                                + "\nReturn per Acre:    " + game.getPerAcre()
                                + "\nAcres Value:        " + game.getPerWheat()
                                + "\nWheat in Storage:   " + game.getWheat()
                                + "\nAmount of Tithes:   " + game.getTithe()
                                + "\nEaten by Rats:      " + game.getRatsEat()
                                + "\n");
                        break;
                    }
                default:
                    this.console.println("Invalid Input"
                            + "\nPlease enter a number 1 - 4 or Q to quit");
                    break;
            }
        } catch (InputMismatchException err) {
            this.console.println("\nINVALID INPUT!");
        }
        return false;
    }

}
