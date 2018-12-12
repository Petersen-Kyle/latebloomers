/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

import cit260.cityOfAaronLB.model.Animals;
import cit260.cityOfAaronLB.model.Tools;
import cit260.cityOfAaronLB.model.Weapons;

/**
 *
 * @author pytha
 */
public class ReportControl {

    public void ReportControl() {

    }

    public static String getWeaponList() {
        String reportStr = "     Report Weapon List\r\n";
        String formater = "%-15s%-40s%-5s\r\n";
        reportStr += String.format(formater, "Name");
        reportStr += String.format(formater, "====");
        for (Weapons weapon : Weapons.values()) {
            reportStr += String.format(formater, weapon.getItemName());
        }
        return reportStr;
    }

    public static String getAnimalList() {
        String reportStr = "     Report Animal List\r\n";
        String formater = "%-15s%-40s\r\n";
        reportStr += String.format(formater, "Name", "Description");
        reportStr += String.format(formater, "====", "===========");
        for (Animals animal : Animals.values()) {
            reportStr += String.format(formater, animal.getItemName(), animal.getDescription());
        }
        return reportStr;
    }

        public static String getToolList() {
        String reportStr = "     Report Tool List\r\n";
        String formater = "%-15s%-40s\r\n";
        reportStr += String.format(formater, "Name", "Description");
        reportStr += String.format(formater, "====", "===========");
        for (Tools tool : Tools.values()) {
            reportStr += String.format(formater, tool.getItemName(), tool.getDescription());
        }
        return reportStr;
    }
}


//        Location[][] locations = CityOfAaronLB.CityOfAaronLB.getGame().getMap().getLocations();
//        for (Location location : locations){