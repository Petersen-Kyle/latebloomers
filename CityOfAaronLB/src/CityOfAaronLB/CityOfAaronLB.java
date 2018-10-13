/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityOfAaronLB;

import cit260.cityOfAaron.model.*;
import cit260.cityOfAaron.model.Author;


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
