/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

/**
 *
 * @author kpetersen
 */
public class buyLandControl {
    public static int calcBuyLand(int rnd1, int toBuy, int wheatInStorage, int population, int totalAcres){
        if (toBuy < 0){
		return -1;}
	else if (wheatInStorage-(rnd1 * toBuy) < 0){
		return -2;}
	else if ((toBuy + totalAcres)/10 > population){
		return -3;}
	        
	totalAcres = totalAcres + toBuy;

              
        return totalAcres;
    }
            
}
