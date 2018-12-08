/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;
import cit260.cityOfAaronLB.model.Animals;
import cit260.cityOfAaronLB.model.Location;
import java.util.ArrayList;
import java.util.Arrays;
import javax.tools.DocumentationTool;



/**
 *
 * @author pytha
 */
public class SortMTS {
    
    public SortMTS(){
        
//        String[] weapons = {"Bow and Arrow", "Sling", "Spear", "Bolo", "Knife", "Javelin"};
//        ArrayList<String> list = new ArrayList();
//        for(int i = 0; i < weapons.length; i++) {
//            if(weapons[i] != null){
//                list.add(weapons[i]);
//            }
//        }
//        weapons = list.toArray(new String[list.size()]);
//        Arrays.sort(weapons);
//        System.out.println(Arrays.asList(weapons));
    
    }
    public static String getReportStr() {
        String[] weapons = {"Bow and Arrow", "Sling", "Spear", "Bolo", "Knife", "Javelin"};
        ArrayList<String> list = new ArrayList();
        for(int i = 0; i < weapons.length; i++) {
            if(weapons[i] != null){
                list.add(weapons[i]);
            }
        }
        weapons = list.toArray(new String[list.size()]);
        Arrays.sort(weapons);
//        System.out.println(Arrays.asList(weapons));
        return Arrays.asList(weapons).toString();
    }
    
    public static String getWeaponList() {
        String reportStr = "     Report Weapon List\r\n";
        String formater = "%-15s%-40s\r\n";
        reportStr += String.format(formater, "Name", "Description");
        reportStr += String.format(formater, "====", "===========");
        for (Animals animal : Animals.values()) {
            reportStr += String.format(formater, animal.getItemName(), animal.getDescription());
     
//        Location[][] locations = CityOfAaronLB.CityOfAaronLB.getGame().getMap().getLocations();
//        for (Location location : locations){
        }
        return reportStr;
        
    }
    
}


