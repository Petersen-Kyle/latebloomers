/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import static CityOfAaronLB.CityOfAaronLB.game;

/**
 *
 * @author lafon
 */
public class StorehouseMenu extends View {

    public StorehouseMenu() {
        super("Storehouse/Statistics\n"
                + "1. Current resources\n"
                + "2. Statistics\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                this.console.println("Current Resources");
                this.console.println("Acres of Land:    " + game.getAcres());
                this.console.println("Wheat in Storage: " + game.getWheat());
                this.console.println("Wheat per Acre:   " + game.getPerAcre());
                break;
            case "2":
                this.console.println("Statistics");
                this.console.println("\nYear:               " + game.getYear()
                        + "\nPeople Starved:     " + game.getStarved()
                        + "\nMoved to City:      " + game.getNewPop()
                        + "\nCurrent Population: " + game.getPopulation()
                        + "\nAmount of Tithes:   " + game.getTithe()
                        + "\nEaten by Rats:      " + game.getRatsEat());
                break;
        }
        System.out.println();
        return false;
    }
}
