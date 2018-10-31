
        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityOfAaronLB;

import cit260.cityOfAaronLB.model.Question;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Animals;
import cit260.cityOfAaronLB.model.Weapons;
import cit260.cityOfAaronLB.model.Scene;
import cit260.cityOfAaronLB.model.Point;
import cit260.cityOfAaronLB.model.Player;
import cit260.cityOfAaronLB.model.Map;
import cit260.cityOfAaronLB.model.Locations;
import cit260.cityOfAaronLB.model.InventoryItem;
import cit260.cityOfAaronLB.model.Tools;
import cit260.cityOfAaronLB.model.Author;
import cit260.cityOfAaronLB.view.StartProgramView;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

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
        System.out.println(playerOne.toString());
        
        InventoryItem itemOne = new InventoryItem();
        itemOne.setItemType("Tool");
        itemOne.setItemName("Hammer");
        itemOne.setDescription("This is a solid tool used for building houses for your settlers");
        itemOne.setAdjustments(+5);
        System.out.println(itemOne.toString());

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
        Scene wheatField = new Scene();
        wheatField.setName("Wheat Field");
        wheatField.setDescription("You have entered a golden wheat field where workers are harvesting");
        System.out.println(wheatField.toString());
        
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
     
        System.out.println(Weapons.spear.toString());
        
        System.out.println(Tools.plow.toString());
        
        Map newMap = new Map();
        newMap.setColumn(0);
        newMap.setRow(0);
        System.out.println(newMap.toString());
        
        StartProgramView newStart = new StartProgramView();
        newStart.DisplayBanner();
        newStart.DisplayStartProgramView();
        
        
    }
    
}
