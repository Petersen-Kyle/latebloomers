/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.model;
/**
 *
 * @author lafon
 */
public enum Animals{
    
        Mouse("Animal", "Mouse", -1, "The mouse subtracts one from the wheat supply"),
        Cow("Animal", "Cow", 5, "The cow feeds 5 people"),
        Ox("Animal", "Ox", 5, "The ox adds 5 acres of plowed land"),
        Chicken("Animal", "Chicken", 2, "The chicken feeds 2 people");
        
        private String itemType;
        private String itemName;
        private int adjustments;
        private String description;
        
        Animals(String itemType, String itemName, int adjustments, String description){
            this.itemType = itemType;
            this.itemName = itemName;
            this.adjustments = adjustments;
            this.description = description;
        }
    }
    

