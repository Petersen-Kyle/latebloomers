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
public enum Adjustments {
    
    
    bowAndArrow("Weapon", "Bow and Arrow", (int) (Math.random() * (20 + 1)) + -10, "A Bow and Arrow can also shoot nerf arrows. Wheat is added to the storehouse.", "The bow and the arrow get in a fight as to who is sharper mentally and/or physically. You lose wheat in the storehouse."),
    sling("Weapon", "Sling", (int) (Math.random() * (10 + 1)) + -5, "The sling gains a pet rock. Wheat is added to the storehouse.", "The sling decided it likes holding puppies instead of stones. Wheat is lost from the storehouse."),
    spear("Weapon", "Spear", (int) (Math.random() * (20 + 1)) + -10, "The spear has confused itself as a magical sphere and begins to tell the future and grant wishes. Wheat is added to the storehouse.", "The spear lies about its whereabouts last night. Wheat is lost from the storehouse."),
    bolo("Weapon", "Bolo", (int) (Math.random() * (10 + 1)) + -5, "The bolo has found a purpose other than cutting open coconuts. Wheat has been added to the storehouse.", "The bolo has found a machete and they are getting married. Wheat is lost from the storehouse."),
    knife("Weapon", "Knife", (int) (Math.random() * (10 + 1)) + -5, "The knife just went through boot camp. They put him through the grind and sharpened him up. Wheat has been added to your storehouse.", "The knife realized that he is sharp. So he buys a tuxedo and goes on the bachelor. You lose wheat from your storehouse."),
    javelin("Weapon", "Javelin", ((int) (Math.random() * (18 + 1)) + -9), "Turns out the javelin can also be used as a replacement air guitar. Wheat has been added to the storehouse.", "The javelin is heartbroken when he finds out that the knife was chosen for the bachelor instead of him. Wheat is lost from the storehouse."),
    mouse("Animal", "Mouse", (int) (Math.random() * (2 + 1)) + -1, "The mouse found out he has a distant cousin a few farms over and goes to visit him. Wheat is added to the storehouse.", "The mouse had babies with his friends, cousins, aunts, uncles, next door neighbors, son. Wheat is lost from your storehouse."),
    cow("Animal", "Cow", (int) (Math.random() * (12 + 1)) + -6, "The cow has deemed herself queen of the cows. Wheat is added to your storehouse.", "The cow has had enough of your smart alec comments and refuses to work. Wheat is taken from the storehouse."),
    ox("Animal", "Ox", (int) (Math.random() * (8 + 1)) + -4, "The ox has a dance off with you. He loses. Wheat is added to the storehouse", "The ox comes down with the chicken pox. Wheat is lost from your storehouse."),
    chicken("Animal", "Chicken", (int) (Math.random() * (4 + 1)) + -2, "The chicken is running around with its legs cut off. Wheat is added to your supply", "The lock ness monster appears out of no where and tears down the chickens fence. Wheat is eaten by tjhe chickens."),
    rabbit("Animal", "Rabbit", (int) (Math.random() * (4 + 1)) + -2, "The rabbits become rabid and no longer have a hunger for wheat. Wheat is added to your storehouse", "The rabbits decided to boogie all night. They are very hungry now. Wheat is taken from the storehouse." ),
    bat("Animal", "Bat", (int) (Math.random() * (6 + 1)) + -3, "The bat has a lip sync battle with the birds. Winner takes wheat. Turns out both are terrible at it. Wheat is added to the storehouse.", "The bat turns into a vampire and sucks the blood of all the cows. Wheat is taken from the storehouse."),
    plow("Tool", "Plow", (int) (Math.random() * (20 + 1)) + -10, "The plow has found its new purpose in life. Wheat is added to the storehouse.", "Your shiny new plow was stolen by the ghost of christmas past. You lose wheat from the storehouse."),
    hammer("Tool", "Hammer", (int) (Math.random() * (10 + 1)) + -5, "The hammer bonds with the nails. They make incredible silos togeher. Wheat is added to the storehouse", "Your hammer decides that it would rather be with a screwdriver than you. You lose wheat from the storehouse."),
    sickle("Tool", "Sickle", (int) (Math.random() * (6 + 1)) + -3, "The sickle has been waltching tutorials on the best way to harvest wheat. Wheat is added to the storehouse", "The grim reaper comes back to repo your sickle. Wheat has been taken from the storehouse."),
    shovel("Tool", "Shovel", (int) (Math.random() * (4 + 1)) + -2, "The shovel was inspired by the movie holes. Wheat is added to the storehouse.", "You had to use your shovel to break the window in your car after you locked the keys in it. You lose wheat from the storehouse."),
    rulersCourt("Rulers Court", "place of refuge", 0, "The Rulers Court is a place of refuge.", "The Rulers Court is a place of refuge.");
    
    private String itemType;
    private String itemName;
    private int adjustments;
    private String positiveDescription;
    private String negativeDescription;

    Adjustments(String itemType, String itemName, int adjustments, String positiveDescription, String negativeDescription){
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

 
    
    
    


