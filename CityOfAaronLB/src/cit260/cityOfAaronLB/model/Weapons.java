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
    spear("Weapon", "Spear", 10, "The spear adds 10 food to your store");
    
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

