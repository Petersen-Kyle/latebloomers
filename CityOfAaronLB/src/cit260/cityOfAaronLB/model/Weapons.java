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
    
    bowAndArrow("Weapon", "Bow and Arrow", (int) (Math.random() * 3) + -3, "A Bow and Arrow gained wheat to your store", "It is a broken bow, you lost wheat in your storehouse"),
    sling("Weapon", "Sling", (int) (Math.random() * 5) + -5, "The sling has been added wheat to your storehouse", "The sling is broken, you lost wheat in your storehouse"),
    spear("Weapon", "Spear", (int) (Math.random() * 10) + -10, "The spear has added wheat to your storehouse.", "The spear is broken, you lost wheat in your storehouse."),
    bolo("Weapon", "Bolo", (int) (Math.random() * 5) + -5, "The bolo is used to snare small animals who have taken wheat and are on the run. Wheat has been added to the storehouse.", "The bolo is broken, small animals have taken some wheat from the storehouse."),
    knife("Weapon", "Knife", (int) (Math.random() * 5) + -5, "A knife can be used to better harvest wheat so there is no waste, wheat has been added to your storehouse.", "The knife is broken, you are not able to ahrvest wheat. Wheat has been taken from the storehouse."),
    javelin("Weapon", "Javelin", ((int) (Math.random() * 9) + -9), "A javelin can be thrown to bring down small game preventing them from taking wheat. Wheat has been added to the storehouse.", "The javelin is broken. small game have taken wheat from your storehouse.");

    private String itemType;
    private String itemName;
    private int adjustments;
    private String positiveDescription;
    private String negativeDescription;

    Weapons(String itemType, String itemName, int adjustments, String positiveDescription, String negativeDescription){
            this.itemType = itemType;
            this.itemName = itemName;
            this.adjustments = adjustments;
            this.positiveDescription = positiveDescription;
            this.negativeDescription = negativeDescription;
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
    public String getPositiveDescription() {
        return positiveDescription;
    }

    public String getNegativeDescription() {
        return negativeDescription;
    }

    @Override
    public String toString() {
        return "Weapons{" + "itemType=" + itemType + ", itemName=" + itemName + ", adjustments=" + adjustments + ", positiveDescription=" + positiveDescription + ", negativeDescription=" + negativeDescription + '}';
    }
    
    }

 
    
    
    


