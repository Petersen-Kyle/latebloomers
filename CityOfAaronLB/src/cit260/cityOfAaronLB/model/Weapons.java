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
    
    bowAndArrow("Weapon", "Bow and Arrow", 5, "A Bow and Arrow gains 5 food to your store"),
    sling("Weaopn", "Sling", -5, "The sling gives the chance for rats to eat food"),
    spear("Weapon", "Spear", 10, "The spear adds 10 food to your store"),
    bolo("Weapon", "Bolo", 5, "The bolo is used to snare small animals on the run"),
    knife("Weapon", "Knife", 5, "A knife can be used to better prepare meat so there is no waste"),
    javelin("Weapon", "Javelin", 9, "A javelin can be thrown to bring down small game");
    
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

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Weapons{" + "itemType=" + itemType + ", itemName=" + itemName + ", adjustments=" + adjustments + ", description=" + description + '}';
    }
    
    
}

