/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.control;

import cit260.cityOfAaronLB.control.sellLandControl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        int landPrice = 27;
        int acresAvailable = 100;
        int acresPlanted = 80;
        int wheatInStorage = 150;
        int expResult = 690;
        int result = sellLandControl.sellLand(userLandSell, landPrice, acresAvailable, acresPlanted, wheatInStorage);
        assertEquals(expResult, result);

        userLandSell = 10;
        landPrice = 27;
        acresAvailable = 100;
        acresPlanted = 80;
        wheatInStorage = 150;
        expResult = 420;
        result = sellLandControl.sellLand(userLandSell, landPrice, acresAvailable, acresPlanted, wheatInStorage);
        assertEquals(expResult, result);

        userLandSell = -10;
        landPrice = 27;
        acresAvailable = 100;
        acresPlanted = 80;
        wheatInStorage = 150;
        expResult = -1;
        result = sellLandControl.sellLand(userLandSell, landPrice, acresAvailable, acresPlanted, wheatInStorage);
        assertEquals(expResult, result);
        
        userLandSell = 30;
        landPrice = 27;
        acresAvailable = 100;
        acresPlanted = 80;
        wheatInStorage = 150;
        expResult = -2;
        result = sellLandControl.sellLand(userLandSell, landPrice, acresAvailable, acresPlanted, wheatInStorage);
        assertEquals(expResult, result);
        
        userLandSell = 1;
        landPrice = 27;
        acresAvailable = 100;
        acresPlanted = 80;
        wheatInStorage = 150;
        expResult = 177;
        result = sellLandControl.sellLand(userLandSell, landPrice, acresAvailable, acresPlanted, wheatInStorage);
        assertEquals(expResult, result);
    }
    
}
