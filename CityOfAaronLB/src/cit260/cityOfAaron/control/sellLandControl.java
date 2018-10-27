/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.control;
import java.util.Random;
        
/**
 *
 * @author pytha
 */
public class sellLandControl {
    public static int sellLand(int userLandSell, int landPrice, int acresAvailable, int acresPlanted, int wheatInStorage){
        if(userLandSell<=0){
            return -1;
        } 
        else if(userLandSell > acresAvailable - acresPlanted){
            return -2;
        }
//        landPrice=(int)(Math.random()*10)+17;
        acresAvailable=acresAvailable-userLandSell;
        wheatInStorage=wheatInStorage+(userLandSell*landPrice);
        
        return wheatInStorage;
    }
}
