/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;
import static CityOfAaronLB.CityOfAaronLB.player;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;

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

                        if (game.getYear() >= 10) {
                            this.console.println("Congratulations! You won!");
                            System.exit(0);
                        }
                        if (game.getPopulation() < game.getStarved()) {
                            System.out.println("The people have dethroned you. Too many people starved.");
                            System.exit(0);
                        }

                        game.setPeopleFed(false);
                        game.setAcresTheyPlanted(false);
                        game.setTithesPaid(false);
                        
                        Map map = game.getMap();
                        Location location = new Location();
                        Location[][] locations = map.getLocations();
                        for (int row = 0; row < locations.length; row++) {
                            location.setRow(row);
                            map.setCurrentRow(row);
                            for (int column = 0; column < locations.length; column++) {
                                location.setColumn(column);
                                map.setCurrentColumn(column);
                                locations[row][column].setVisited(false);
                                locations[row][column].getItem().setAdjustments((int) (Math.random() * (200 + 10)) + -100);
                            }
                        }

                        game.setYear(game.getYear() + 1);
                        game.setNewPop((int) (Math.random() * 4) + 2);
                        game.setPopulation(game.getPopulation() + game.getNewPop());
                        game.setWheat(game.getWheat() + game.getHarvestReturn());
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

                    }
                    break;
                default:
                    this.console.println("Invalid Input"
                            + "\nPlease enter a number 1 - 4 or Q to quit");
                    break;
            }
        } catch (Exception err) {
            this.console.println("\nINVALID INPUT!\n");
        }
        return false;
    }

}
