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
public class AnimalSortControl {
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
    
    public void sortAnimal(){
        int[] animal = new int[6];

        animal[0] = Animals.Bat.getAdjustments();
        animal[1] = Animals.Chicken.getAdjustments();
        animal[2] = Animals.Cow.getAdjustments();
        animal[3] = Animals.Mouse.getAdjustments();
        animal[4] = Animals.Ox.getAdjustments();
        animal[5] = Animals.Rabbit.getAdjustments();
        
        int[] arr1 = {animal[0], animal[1], animal[2], animal[3], animal[4], animal[5]};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }

}
