/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import cit260.cityOfAaronLB.control.ToolSortControl;
import java.util.InputMismatchException;

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
                + "4. How to play the game\n"
                + "5. Starting Resources\n"
                + "6. Tools Bonus Adjustments\n"
                + "Choose one or (Q to Quit to Main Menu): ");
    }

    @Override
    public boolean doAction(String inputs) {
        try {
            switch (inputs) {
                case "1":
                    this.console.println("The Histor of the City of Aaron");
                    this.console.println("According to The Book of Mormon, \n"
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
                    this.console.println("The goal of the game");
                    this.console.println("You are the new king of the City of Aaron \n"
                            + "As the new leader you should visit the lands under \n"
                            + "your control and find ways to help your people to  \n"
                            + "become more productive as well as direct the planting \n"
                            + "efforts to feed you people and expand your population \n");
                    break;
                case "3":
                    this.console.println("How to make a move");
                    this.console.println("1. Go to 'Move to a new location on the Game Menu\n"
                                       + "2. Enter the row and the column numbers of the place you wish to visit.");
                    
                    break;
                case "4":
                    this.console.println("How to play the game");
                    break;
                case "5":
                    this.console.println("Starting resource");
                    this.console.println("Here is a list of your beginning resourses \n"
                            + "Population = 100 \n"
                            + "Acres of Land = 1000 \n"
                            + "Wheat in Storage = 2700 \n");
                    break;
                case "6":
                    ToolSortControl sort = new ToolSortControl();
                    sort.sortTools();
                    break;
                default:
                    this.console.println("Invalid Input"
                            + "\nPlease enter a number 1 - 7 or Q to quit");
                    break;
            }
        } catch (InputMismatchException err) {
            this.console.println("\nINVALID INPUT!");
        }
        this.console.println();
        return false;
    }
}
