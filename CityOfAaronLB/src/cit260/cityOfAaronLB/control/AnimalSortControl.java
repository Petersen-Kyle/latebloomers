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

    public int[] sortAnimal() {
        String[] name = new String[6];
        int[] animal = new int[6];

        name[0] = Animals.Bat.getItemName();
        name[1] = Animals.Chicken.getItemName();
        name[2] = Animals.Cow.getItemName();
        name[3] = Animals.Mouse.getItemName();
        name[4] = Animals.Ox.getItemName();
        name[5] = Animals.Rabbit.getItemName();

        for (String y : name) {
            System.out.println(y);
        }

        return animal;
    }

}
