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
public enum Tools {
    
    plow("Tool", "Plow", 10, "The plow plows 10 fields"),
    hammer("Tool", "Hammer", 5, "The hammer gains 5 people"),
    sickle("Tool", "Sickle", 1, "The sickle adds 1 harvested acre"),
    shovel("Tool", "Shovel", 2, "The shovel prepares 2 fields");
    
    private String itemType;
    private String itemName;
    private int adjustments;
    private String description;

    Tools(String itemType, String itemName, int adjustments, String description){
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
        return "Tools{" + "itemType=" + itemType + ", itemName=" + itemName + ", adjustments=" + adjustments + ", description=" + description + '}';
    }
    
    
}
