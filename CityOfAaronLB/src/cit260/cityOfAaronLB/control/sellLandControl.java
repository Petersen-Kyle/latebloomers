/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;
import java.util.Random;
        
/**
 *
 * @author pytha
 */
public class sellLandControl {
    public static int sellLand(String inputs, int landPrice, int acresAvailable, int acresPlanted, int wheatInStorage){
        if (landPrice == 0) {
            landPrice = 27;
            acresAvailable = 100;
            acresPlanted = 80;
            wheatInStorage = 500;
        }
        
        int userLandSell = Integer.parseInt(inputs);
        if(userLandSell<=0){
            return -1;
        } 
        else if(userLandSell > acresAvailable - acresPlanted){
            return -2;
        }
        landPrice=(int)(Math.random()*10)+17;
        acresAvailable=acresAvailable-userLandSell;
        wheatInStorage=wheatInStorage+(userLandSell*landPrice);
        return wheatInStorage;
    }
}
