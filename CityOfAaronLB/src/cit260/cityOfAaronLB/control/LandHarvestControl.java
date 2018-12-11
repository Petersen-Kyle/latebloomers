/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

/**
 *
 * @author lafon
 */
public class LandHarvestControl {
    public static int calcLandHarvested(int population, int userPlanting, int acresAvailable, int wheatInStorage){
        if(userPlanting>acresAvailable){
            return -1;
        }
        else if(userPlanting>10*population){
            return -2;
        }
        else if(userPlanting/2>wheatInStorage){
            return -3;
        }
        else if(userPlanting<=1){
            return -4;
        }
        wheatInStorage=wheatInStorage-userPlanting/2;
        return wheatInStorage;
    }
}
