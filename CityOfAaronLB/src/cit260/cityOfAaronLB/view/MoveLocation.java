/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import cit260.cityOfAaronLB.control.GameControl;
import cit260.cityOfAaronLB.control.MapControl;
import static cit260.cityOfAaronLB.control.MapControl.movePlayer;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;

/**
 *
 * @author lafon
 */
public class MoveLocation extends View{

    
    public void moveLocation() {
        String row = getInput("Enter Row(Q to quit): ");
        if (row.toUpperCase().trim().equals("q")){
            System.out.println("You didnt want to move...");
            return;
        }
        String col = getInput("Enter Column(Q to quit): ");
        if (col.toUpperCase().trim().equals("q")){
            System.out.println("You didnt want to move...");
            return;
        }
        int inRow = -1;
        int inCol = -1;
        try {
            inRow = Integer.parseInt(row);
            inCol = Integer.parseInt(col); }
        catch (NumberFormatException e) {
            System.out.println("Invalid entry, must be an number...");
            return;
        }
        
//        Game game = Game.getCurrentGame();
//        Map map = Game.getMap();
        try {
//            GameControl.movePlayer(map, inRow, inCol);
//            displayMap();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid range.");
        }
    }
    @Override
    public boolean doAction(String inputs){

        return false;
    }

}
