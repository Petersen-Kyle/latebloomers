/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.control;

import cit260.cityOfAaronLB.control.calcLandHarvestControl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lafon
 */
public class calcLandHarvestControlTest {
    
    public calcLandHarvestControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcLandHarvested method, of class calcLandHarvestControl.
     */
    @Test
    public void testCalcLandHarvested() {
        System.out.println("calcLandHarvested");
        
        //Test case 1
        System.out.println("\tTest Case 1");
        int population = 25;
        int userPlanting = 50;
        int acresAvailable = 60;
        int wheatInStorage = 30;
        int expResult = 5;
        int result = calcLandHarvestControl.calcLandHarvested(population, userPlanting, acresAvailable, wheatInStorage);
        assertEquals(expResult, result);
        
        //Test case 2
        System.out.println("\tTest Case 2");
        population = 3;
        userPlanting = 30;
        acresAvailable = 50;
        wheatInStorage = 15;
        expResult = 0;
        result = calcLandHarvestControl.calcLandHarvested(population, userPlanting, acresAvailable, wheatInStorage);
        assertEquals(expResult, result);
        
        //Test case 3
        System.out.println("\tTest Case 3");
        population = 25;
        userPlanting = 80;
        acresAvailable = 60;
        wheatInStorage = 30;
        expResult = -1;
        result = calcLandHarvestControl.calcLandHarvested(population, userPlanting, acresAvailable, wheatInStorage);
        assertEquals(expResult, result);
        
        //Test case 4
        System.out.println("\tTest Case 4");
        population = 5;
        userPlanting = 60;
        acresAvailable = 60;
        wheatInStorage = 70;
        expResult = -2;
        result = calcLandHarvestControl.calcLandHarvested(population, userPlanting, acresAvailable, wheatInStorage);
        assertEquals(expResult, result);
        
        //Test case 5
        System.out.println("\tTest Case 5");
        population = 25;
        userPlanting = 60;
        acresAvailable = 60;
        wheatInStorage = 25;
        expResult = -3;
        result = calcLandHarvestControl.calcLandHarvested(population, userPlanting, acresAvailable, wheatInStorage);
        assertEquals(expResult, result);
        
        //Test case 6
        System.out.println("\tTest Case 6");
        population = 25;
        userPlanting = -20;
        acresAvailable = 60;
        wheatInStorage = 30;
        expResult = -4;
        result = calcLandHarvestControl.calcLandHarvested(population, userPlanting, acresAvailable, wheatInStorage);
        assertEquals(expResult, result);
        
        //Test case 7
        System.out.println("\tTest Case 7");
        population = 25;
        userPlanting = 2;
        acresAvailable = 60;
        wheatInStorage = 70;
        expResult = 69;
        result = calcLandHarvestControl.calcLandHarvested(population, userPlanting, acresAvailable, wheatInStorage);
        assertEquals(expResult, result);
    }
    
}
