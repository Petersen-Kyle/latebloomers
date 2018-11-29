/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;
import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author pytha
 */
public class SortMTS {
    
    public SortMTS(){
        
        String[] weapons = {"Bow and Arrow", "Sling", "Spear", "Bolo", "Knife", "Javelin"};
        ArrayList<String> list = new ArrayList();
        for(int i = 0; i < weapons.length; i++) {
            if(weapons[i] != null){
                list.add(weapons[i]);
            }
        }
        weapons = list.toArray(new String[list.size()]);
        Arrays.sort(weapons);
        System.out.println(Arrays.asList(weapons));
    
    }
    
    
}
