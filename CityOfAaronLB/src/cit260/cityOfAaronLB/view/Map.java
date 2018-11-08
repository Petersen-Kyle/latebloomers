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
                    " __________ __________ __________ __________ __________ \n" +
                    "|          |          |          |          |          |\n" +
                    "| Temple(1)| Wheat(2) | Wheat(3) | River(4) |Granary(5)|\n" +
                    "|__________|__________|__________|__________|__________|\n" +
                    "|          |          |          |          |          |\n" +
                    "| Wheat(6) | Wheat(7) | River(8) | Wheat(9) | Wheat(10)|\n" +
                    "|__________|__________|__________|__________|__________|\n" +
                    "|          |          |  Rulers  |          |          |\n" +
                    "| Wheat(11)| River(12)| Court(13)| Wheat(14)|Storehouse|\n" +
                    "|__________|__________|__________|__________|___(15)___|\n" +
                    "|          |          |          |          |          |\n" +
                    "| River(16)| Wheat(17)| Wheat(18)| Wheat(19)| Wheat(20)|\n" +
                    "|__________|__________|__________|__________|__________|\n" +
                    "|          |          |          |          |          |\n" +
                    "|Undevelop |Undevelop |Undevelop | Villiage |Undevelop |\n" +
                    "|___(21)___|__(22)____|___(23)___|___(24)___|___(25)___|\n");
        
        System.out.println("Select where you would like to go:");
            Scanner inFile;
            inFile = new Scanner(System.in);
            String selection = inFile.nextLine().trim();
            
    }
        
 }

