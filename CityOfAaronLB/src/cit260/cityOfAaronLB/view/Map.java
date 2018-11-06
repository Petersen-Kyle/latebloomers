/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.util.Scanner;

/**
 *
 * @author lafon
 */
public class Map {
    
    
    public void displayMap(){
        System.out.println(
                    "   __________ __________ __________ __________ __________ \n" +
                    "  |          |          |          |          |          |\n" +
                    "0 |  Temple  |   Wheat  |  Wheat   |  River   | Granary  |\n" +
                    "  |__________|__________|__________|__________|__________|\n" +
                    "  |          |          |          |          |          |\n" +
                    "1 |  Wheat   |   Wheat  |  River   |  Wheat   |  Wheat   |\n" +
                    "  |__________|__________|__________|__________|__________|\n" +
                    "  |          |          |  Rulers  |          |          |\n" +
                    "2 |  Wheat   |  River   |  Court   |  Wheat   |Storehouse|\n" +
                    "  |__________|__________|__________|__________|__________|\n" +
                    "  |          |          |          |          |          |\n" +
                    "3 |  River   |  Wheat   |   Wheat  |  Wheat   |  Wheat   |\n" +
                    "  |__________|__________|__________|__________|__________|\n" +
                    "  |          |          |          |          |          |\n" +
                    "4 |Undevelop |Undevelop |Undevelop | Villiage |Undevelop |\n" +
                    "  |__________|__________|__________|__________|__________|\n" +
                    "       0          1          2          3           4       ");             
    }
}
