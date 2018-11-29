/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;
import cit260.cityOfAaronLB.control.SortMTS;
import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.model.Weapons;
import cit260.cityOfAaronLB.model.Weapons;
import java.util.EnumSet;

/**
 *
 * @author pytha
 */
public class HelpMenu extends View {

    public HelpMenu() {
        super("Help Menu\n"
                + "1. History of the City of Aaron\n"
                + "2. What is the goal of the game?\n"
                + "3. How to make a move\n"
                + "4. Tips and Hints\n"
                + "5. Starting Resources\n"
                + "6. Sort Locations\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                System.out.println("The Histor of the City of Aaron");
                System.out.println("According to The Book of Mormon, \n"
                        + "the city of Aaron was located near Nephihah, \n"
                        + "though constructed earlier. Prior to the \n"
                        + "construction of Nephihah, its nearest known \n"
                        + "neighbor was Moroni. The book first tells of \n"
                        + "the city of Aaron when Alma, rejected at \n"
                        + "Ammonihah, departed and took his journey \n"
                        + "toward the city of Aaron about 82 BC (Alma 8:13), \n"
                        + "but he stopped and returned to Ammonihah. The \n"
                        + "only other verse mentioning the city of Aaron \n"
                        + "is when the foundation is laid for the city of \n"
                        + "Nephihah around 72 BC. (Alma 50:14). In the \n"
                        + "index of the 1989 edition (and others) of the \n"
                        + "book, it is acknowledged that there may have been \n"
                        + "two cities by this name. ");
                break;
            case "2":
                System.out.println("The goal of the game");
                System.out.println("You are the new king of the City of Aaron \n"
                        + "As the new leader you should visit the lands under \n"
                        + "your control and find ways to help your people to  \n"
                        + "become more productive as well as direct the planting \n"
                        + "efforts to feed you people and expand your population \n");
                break;
            case "3":
                System.out.println("How to make a move");
                break;
            case "4":
                System.out.println("Tips and Hints");
                break;
            case "5":
                System.out.println("Starting resource");
                System.out.println("Here is a list of your beginning resourses \n"
                        + "Population = 100 \n"
                        + "Acres of Land = 1000 \n"
                        + "Wheat in Storage = 2700 \n");
                break;
            case "6":
                SortMTS sort = new SortMTS();
//                        
                break;
        }
        System.out.println();
        return false;
    }
}
