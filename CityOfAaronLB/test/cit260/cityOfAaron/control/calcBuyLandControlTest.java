/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.control;

import cit260.cityOfAaronLB.control.calcBuyLandControl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kpetersen
 */
public class calcBuyLandControlTest {
    
    public calcBuyLandControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcBuyLand method, of class calcBuyLandControl.
     */
    @Test
    public void testCalcBuyLand() {
        System.out.println("calcBuyLandControl");
        
        //Test case 1
        System.out.println("calcBuyLand");
        System.out.println("\tTest Case 1");
        int rnd1 = 20;
        int toBuy = 100;
        int wheatInStorage = 5000;
        int population = 50;
        int totalAcres = 100;
        int expResult = 200;
        int result = calcBuyLandControl.calcBuyLand(rnd1, toBuy, wheatInStorage, population, totalAcres);
        assertEquals(expResult, result);
        System.out.println("\t\t"+result);
        
         //Test case 2
        System.out.println("\tTest Case 2");
        rnd1 = 20;
        toBuy = -20;
        wheatInStorage = 5000;
        population = 50;
        totalAcres = 100;
        expResult = -1;
        result = calcBuyLandControl.calcBuyLand(rnd1, toBuy, wheatInStorage, population, totalAcres);
        assertEquals(expResult, result);
        System.out.println("\t\t"+result);
        
          //Test case 3
        System.out.println("\tTest Case 3");
        rnd1 = 20;
        toBuy = 100;
        wheatInStorage = 50;
        population = 50;
        totalAcres = 100;
        expResult = -2;
        result = calcBuyLandControl.calcBuyLand(rnd1, toBuy, wheatInStorage, population, totalAcres);
        assertEquals(expResult, result);
        System.out.println("\t\t"+result);
        
          //Test case 4
        System.out.println("\tTest Case 4");
        rnd1 = 20;
        toBuy = 100;
        wheatInStorage = 5000;
        population = 10;
        totalAcres = 100;
        expResult = -3;
        result = calcBuyLandControl.calcBuyLand(rnd1, toBuy, wheatInStorage, population, totalAcres);
        assertEquals(expResult, result);
        System.out.println("\t\t"+result);
        
          //Test case 5
        System.out.println("\tTest Case 5");
        rnd1 = 20;
        toBuy = 100;
        wheatInStorage = 2000;
        population = 50;
        totalAcres = 100;
        expResult = 200;
        result = calcBuyLandControl.calcBuyLand(rnd1, toBuy, wheatInStorage, population, totalAcres);
        assertEquals(expResult, result);
        System.out.println("\t\t"+result);
    }
    
}
