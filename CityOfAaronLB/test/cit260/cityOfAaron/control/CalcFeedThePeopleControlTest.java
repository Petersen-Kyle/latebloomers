/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.control;

import cit260.cityOfAaronLB.control.calcFeedThePeopleControl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lafon
 */
public class CalcFeedThePeopleControlTest {
    
    public CalcFeedThePeopleControlTest() {
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
        int result = calcFeedThePeopleControl.calcFeedThePeople(wheatInStorage, wheatHarvested, tithes, eatenByRats, peopleToFeed);
        
        //Test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        
        //Test Case 2
        System.out.println("\tTest Case 2");
        
        //Define the input variables
        wheatInStorage = -200;
        wheatHarvested = 100;
        tithes = 20;
        eatenByRats = 50;
        peopleToFeed = 40;
        
        //Define the expected output variable
        expResult = -1;
        
        //Call the method
        result = calcFeedThePeopleControl.calcFeedThePeople(wheatInStorage, wheatHarvested, tithes, eatenByRats, peopleToFeed);
        
        //Test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        
        //Test Case 3
        System.out.println("\tTest Case 3");
        
        //Define the input variables
        wheatInStorage = 600;
        wheatHarvested = 200;
        tithes = 5;
        eatenByRats = 40;
        peopleToFeed = -30;
        
        //Define the expected output variable
        expResult = -2;
        
        //Call the method
        result = calcFeedThePeopleControl.calcFeedThePeople(wheatInStorage, wheatHarvested, tithes, eatenByRats, peopleToFeed);
        
        //Test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        
        //Test Case 4
        System.out.println("\tTest Case 4");
        
        //Define the input variables
        wheatInStorage = 700;
        wheatHarvested = -100;
        tithes = 10;
        eatenByRats = 30;
        peopleToFeed = 50;
        
        //Define the expected output variable
        expResult = -3;
        
        //Call the method
        result = calcFeedThePeopleControl.calcFeedThePeople(wheatInStorage, wheatHarvested, tithes, eatenByRats, peopleToFeed);
        
        //Test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        
        //Test Case 5
        System.out.println("\tTest Case 5");
        
        //Define the input variables
        wheatInStorage = 400;
        wheatHarvested = 100;
        tithes = 20;
        eatenByRats = 30;
        peopleToFeed = 300;
        
        //Define the expected output variable
        expResult = -4;
        
        //Call the method
        result = calcFeedThePeopleControl.calcFeedThePeople(wheatInStorage, wheatHarvested, tithes, eatenByRats, peopleToFeed);
        
        //Test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        
        //Test Case 6
        System.out.println("\tTest Case 6");
        
        //Define the input variables
        wheatInStorage = 700;
        wheatHarvested = 50;
        tithes = 20;
        eatenByRats = 20;
        peopleToFeed = 1;
        
        //Define the expected output variable
        expResult = 690;
        
        //Call the method
        result = calcFeedThePeopleControl.calcFeedThePeople(wheatInStorage, wheatHarvested, tithes, eatenByRats, peopleToFeed);
        
        //Test to see if the result returned equals the expected result
        assertEquals(expResult, result); 
    }
    
}
