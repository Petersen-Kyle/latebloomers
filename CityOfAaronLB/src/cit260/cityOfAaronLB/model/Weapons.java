/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.model;

/**
 *
 * @author lafon
 */
public enum Weapons {
    
    bowAndArrow("Weapon", "Bow and Arrow", (int) (Math.random() * 3) + -3, "A bow and arrow kills game to eat"),
    sling("Weapon", "Sling", (int) (Math.random() * 5) + -5, "The sling kills small animals"),
    spear("Weapon", "Spear", (int) (Math.random() * 10) + -10, "The spear kills small animals."),
    bolo("Weapon", "Bolo", (int) (Math.random() * 5) + -5, "The bolo is used to snare small animals who have taken wheat and are on the run."),
    knife("Weapon", "Knife", (int) (Math.random() * 5) + -5, "A knife can be used to better harvest wheat."),
    javelin("Weapon", "Javelin", ((int) (Math.random() * 9) + -9), "A javelin can be thrown to bring down small game preventing them from taking wheat.");

    private String itemType;
    private String itemName;
    private int adjustments;
    private String description;

    Weapons(String itemType, String itemName, int adjustments, String description){
            this.itemType = itemType;
            this.itemName = itemName;
            this.adjustments = adjustments;
            this.description = description;

        }

    public String getItemType() {
        return itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAdjustments() {
        return adjustments;
    }
    public String getdescription() {
        return description;
    }



    @Override
    public String toString() {
        return "Weapons{" + "itemType=" + itemType + ", itemName=" + itemName + ", adjustments=" + adjustments + ", description=" + description + '}';
    }
    
    }

 
    
    
    


