/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityOfAaronLB;

import cit260.cityOfAaron.model.*;
import cit260.cityOfAaron.model.Author;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author lafon
 */
public class CityOfAaronLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test new player
        Player playerOne = new Player();
        playerOne.setName("George Jetson");
        String playerOneName = playerOne.getName();
        System.out.println(playerOne.toString());
        
        Animals.Mouse.getItemType();
        Animals.Mouse.getDescription();
        Animals.Mouse.getItemName();
        Animals.Mouse.getAdjustments();
        System.out.println(Animals.Mouse.toString());
        
        Author.Michael.getFirstname();
        Author.Michael.getLastname();
        System.out.println(Author.Michael.toString());
        
        Game gameOne = new Game();
        gameOne.setAcresOwned(1000);
        gameOne.setCurrentPopulation(100);
        gameOne.setWheatInStroage(100);
        System.out.println(gameOne.toString());
        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityOfAaronLB;

import cit260.cityOfAaron.model.*;
import cit260.cityOfAaron.model.Author;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author lafon
 */
public class CityOfAaronLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test new player
        Player playerOne = new Player();
        playerOne.setName("George Jetson");
        String playerOneName = playerOne.getName();
        System.out.println(playerOne.toString());
        InventoryItem itemOne = new InventoryItem();
        itemOne.setItemType("Tool");
        itemOne.setItemName("Hammer");
        itemOne.setDescription("This is a solid tool used for building houses for your settlers");
        itemOne.setAdjustments(+5);
        System.out.println(itemOne.toString());
        
        Animals.Mouse.getItemType();
        Animals.Mouse.getDescription();
        Animals.Mouse.getItemName();
        Animals.Mouse.getAdjustments();
        System.out.println(Animals.Mouse.toString());
        
        Author.Michael.getFirstname();
        Author.Michael.getLastname();
        System.out.println(Author.Michael.toString());
        
        Game gameOne = new Game();
        gameOne.setAcresOwned(1000);
        gameOne.setCurrentPopulation(100);
        gameOne.setWheatInStroage(100);
        System.out.println(gameOne.toString());
        

        //creating Scene object
        Scene wheatfield = new Scene();
        wheatfield.setName("Wheat Field");
        wheatfield.setDescription("You have entered a golden wheat field where workers are harvesting");
        System.out.println(wheatfield.toString());
        
        //creating point Object
        Point pointOne = new Point();
        pointOne.setRow (1);
        pointOne.setColumn(1);
        System.out.println(pointOne.toString());
        Question introText = new Question();
        introText.setQuestionText("What would you like to do?");
        introText.setAnswer1("1 - Start a new game");
        introText.setAnswer2("2 - Load a saved game");
        introText.setAnswer3("3 - Help");
        introText.setAnswer4("4 - Quit");
        introText.setUserAnswer(1);
        System.out.println(introText.toString());
        
        Locations gameLocation = new Locations();
        gameLocation.setColumn(4);
        gameLocation.setRow(0);
        gameLocation.setVisited(true);
        System.out.println(gameLocation.toString());
     
        
    }
    
}
