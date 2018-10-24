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

/**
 *
 * @author lafon
 */
public class InverntoryItemControlTest {
    
    public InverntoryItemControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcFeedThePeople method, of class InverntoryItemControl.
     */
    @Test
    public void testCalcFeedThePeople() {
        System.out.println("calcFeedThePeople");
        
        //Test Case 1
        System.out.println("\tTest Case 1");
        
        //Define the input variables
        int wheatInStorage = 500;
        int wheatHarvested = 200;
        int tithes = 10;
        int eatenByRats = 50;
        int peopleToFeed = 20;
        
        //Define the expected output variable
        int expResult = 240;
        
        //Call the method
        int result = InverntoryItemControl.calcFeedThePeople(wheatInStorage, wheatHarvested, tithes, eatenByRats, peopleToFeed);
        
        //Test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
