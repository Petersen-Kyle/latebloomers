/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.model.Animals;
import cit260.cityOfAaronLB.model.Item;
import java.util.Arrays;

/**
 *
 * @author lafon
 */
public class SortControl {
    
    public int[] sortAnimal(){
        int[] animal = new int[6];
        animal[0] = Animals.Bat.getAdjustments();
        animal[1] = Animals.Chicken.getAdjustments();
        animal[2] = Animals.Cow.getAdjustments();
        animal[3] = Animals.Mouse.getAdjustments();
        animal[4] = Animals.Ox.getAdjustments();
        animal[5] = Animals.Rabbit.getAdjustments();
        
        Arrays.sort(animal);
        for(int x : animal){
            if(x <= animal.length){
                System.out.println(x);
            }
        }
        return animal;
    }
        
}
