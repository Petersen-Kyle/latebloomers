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
public class EndOfTheYear extends View {

    public EndOfTheYear() {
        super("End of the year\n"
                + "1. Feed the people\n"
                + "2. Plant acres\n"
                + "3. Pay tithing\n"
                + "4. End Year\n"
                + "Choose one or (Q to quit to game menu)");
//        super("Enter the amount of wheat to feed your people: (or Q to quit back to Game Menu)");

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

                    break;
                case "3":
                    TithesView tithes = new TithesView();
                    tithes.display();
                    break;
                case "4":
                    if (!game.isPeopleFed()) {
                        System.out.println("You need to Feed the People\n");
                        break;
//                    } else if (game.getAcresTheyPlanted() == 0) {
//                        System.out.println("You need to plant acres\n");
                    } else if (!game.isTithesPaid()) {
                        System.out.println("You need to enter how much tithes you want to pay\n");
                        break;
                    } else {
                        System.out.println("Lord " + player.getName() + " you have: \n"
                                + "\nYear:               " + game.getYear()
                                + "\nPeople Starved:     " + game.getStarved()
                                + "\nMoved to City:      " + game.getNewPop()
                                + "\nCurrent Population: " + game.getPopulation()
                                + "\nAcres Owned:        " + game.getAcres()
                                + "\nWheat per Acre:     " + game.getPerAcre()
                                + "\nWheat in Storage:   " + game.getWheat()
                                + "\nAmount of Tithes:   " + game.getTithe()
                                + "\nEaten by Rats:      " + game.getRatsEat()
                                + "\n");
                    }
                    if (game.getYear() > 10) {
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
                    game.setYear(game.getYear() + 1);
                    game.setNewPop((int) (Math.random() * 4) + 2);
                    game.setPopulation(game.getPopulation() + game.getNewPop());
                    this.console.println(game.getNewPop() + " people moved to the city");
                    this.console.println("Your population is now " + game.getPopulation() + " people\n");
                    break;
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
//        String amountToFeed = inputs;
//        String amountToPlant = getInput("Enter the amount of acres to plant: ");
//        if (amountToPlant.toUpperCase().trim().equals("Q")) {
//            this.console.println("You are not ready to end the year? ");
//            return true;
//        }
//        String amountToTithe = getInput("Enter the amount you want to tithe: ");
//        if (amountToTithe.toUpperCase().trim().equals("Q")) {
//            this.console.println("You are not ready to end the year? ");
//            return true;
//        }
//        Game game = CityOfAaronLB.getGame();
//
//        int intToFeed = Integer.parseInt(amountToFeed);
//        int intToPlant = Integer.parseInt(amountToPlant);
//        int intToTithe = Integer.parseInt(amountToTithe);
//        int peopleFed = -1;
//        int tithePercent = -1;
//
//        try {
//            if (intToFeed <= 0) {
//                throw new GameControlException("You need to enter a positive number");
//            } else if (intToFeed >= 0) {
//                game.setWheat(game.getWheat() - intToFeed);
//                peopleFed = (intToFeed / 20);
//            } else if (intToFeed > game.getWheat()) {
//                throw new GameControlException("There is not enough wheat in storage.");
//            }
//            if (intToPlant * 1 > game.getWheat()) {
//                throw new GameControlException("There is not enough wheat in storage.");
//            } else if (intToPlant > game.getAcres()) {
//                throw new GameControlException("You dont own enough land to plant that much wheat.");
//            } else {
//                game.setAcresPlanted(intToPlant);
//            }
//            if (intToTithe >= game.getWheat()) {
//                game.setWheat(game.getWheat() - intToTithe);
//                game.setTithe(intToTithe);
//                tithePercent = ((game.getTithe() / game.getWheat()) * 100);
//            }
//        } catch (GameControlException ex) {
//            Logger.getLogger(EndOfTheYear.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        clearScreen();
//        this.console.println("Lord " + player.getName() + " you have: \n"
//                + "\nYear:               " + game.getYear()
//                + "\nPeople Starved:     " + game.getStarved()
//                + "\nMoved to City:      " + game.getNewPop()
//                + "\nCurrent Population: " + game.getPopulation()
//                + "\nAcres Owned:        " + game.getAcres()
//                + "\nWheat per Acre:     " + game.getPerAcre()
//                + "\nWheat in Storage:   " + game.getWheat()
//                + "\nAmount of Tithes:   " + game.getTithe()
//                + "\nEaten by Rats:      " + game.getRatsEat()
//                + "\n");
//        this.console.println("You fed " + peopleFed + " out of " + game.getPopulation() + " people.");
//        this.console.println("You planted " + game.getAcresPlanted() + " acres.");
//        this.console.println("You now have " + game.getWheat() + " wheat in storage.");
//        this.console.println("Your population is now " + game.getPopulation());
//        this.console.println(game.getStarved() + " people died of starvation");
//        EndOfTheYear nextYear = new EndOfTheYear();
//        nextYear.display();
//        return false;
//    }

}
