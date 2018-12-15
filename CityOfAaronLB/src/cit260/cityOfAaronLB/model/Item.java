/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lafon
 */
public class Item implements Serializable {

    private String itemType;
    private String itemName;
    private int adjustments;
    private String description;
    private String negativeDescription;
    private String positiveDescription;
    private Tools tools;
    private Adjustments weapons;

    public Item() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Adjustments getWeapons() {
        return weapons;
    }

    public void setWeapons(Adjustments weapons) {
        this.weapons = weapons;
    }

    public Tools getTools() {
        return tools;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(int adjustments) {
        this.adjustments = adjustments;
    }

    public String getNegativeDescription() {
        return negativeDescription;
    }

    public void setNegativeDescription(String negativeDescription) {
        this.negativeDescription = negativeDescription;
    }

    public String getPositiveDescription() {
        return positiveDescription;
    }

    public void setPositiveDescription(String positiveDescription) {
        this.positiveDescription = positiveDescription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.itemType);
        hash = 23 * hash + Objects.hashCode(this.itemName);
        hash = 23 * hash + this.adjustments;
        hash = 23 * hash + Objects.hashCode(this.negativeDescription);
        hash = 23 * hash + Objects.hashCode(this.positiveDescription);
        hash = 23 * hash + Objects.hashCode(this.tools);
        hash = 23 * hash + Objects.hashCode(this.weapons);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.adjustments != other.adjustments) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.positiveDescription, other.positiveDescription)) {
            return false;
        }
        if (!Objects.equals(this.negativeDescription, other.negativeDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", itemName=" + itemName + ", adjustments=" + adjustments + ", negativeDescription=" + negativeDescription + ", positiveDescription=" + positiveDescription + ", tools=" + tools + ", weapons=" + weapons + '}';
    }

    static class itemName {

        public itemName() {
        }
    }

}
