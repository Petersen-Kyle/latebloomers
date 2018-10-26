/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cit260.cityOfAaron.control.sellLandControl;


/**
 *
 * @author pytha
 */
public class sellLandControlTest {
    
    public sellLandControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sellLand method, of class sellLandControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int userLandSell = 20;
        int acresAvailable = 100;
        int acresPlanted = 80;
        int wheatInStorage = 150;
        int expResult = landPrice*20+150;
        int result = sellLandControl.sellLand(userLandSell, acresAvailable, acresPlanted, wheatInStorage);
        assertEquals(expResult, result);

    }
    
}
