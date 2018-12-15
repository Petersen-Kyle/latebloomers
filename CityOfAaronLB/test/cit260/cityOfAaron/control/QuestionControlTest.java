///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package cit260.cityOfAaron.control;
//
//import cit260.cityOfAaronLB.control.QuestionControl;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author lafon
// */
//public class QuestionControlTest {
//    
//    public QuestionControlTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    /**
//     * Test of userInput method, of class QuestionControl.
//     */
//    @Test
//    public void testUserInput() {
//        System.out.println("userInput");
//        
//        //Test Case 1
//        System.out.println("\tTest Case 1");
//        
//        //Define the input variable
//        int userAnswer = 3;
//        
//        //Define the expected output variable
//        int expResult = 3;
//        
//        //Call the method
//        int result = QuestionControl.userInput(userAnswer);
//        
//        //Test to see if the result returned equals the expected result
//        assertEquals(expResult, result);
//        
//        //Test Case 2
//        System.out.println("\tTest Case 2");
//        
//        //Define the input variable
//        userAnswer = -2;
//        
//        //Define the expected output variable
//        expResult = -1;
//        
//        //Call the method
//        result = QuestionControl.userInput(userAnswer);
//        
//        //Test to see if the result returned equals the expected result
//        assertEquals(expResult, result);
//        
//        //Test Case 3
//        System.out.println("\tTest Case 3");
//        
//        //Define the input variable
//        userAnswer = 10;
//        
//        //Define the expected output variable
//        expResult = -2;
//        
//        //Call the method
//        result = QuestionControl.userInput(userAnswer);
//        
//        //Test to see if the result returned equals the expected result
//        assertEquals(expResult, result);
//        
//        //Test Case 4
//        System.out.println("\tTest Case 4");
//        
//        //Define the input variable
//        userAnswer = 1;
//        
//        //Define the expected output variable
//        expResult = 1;
//        
//        //Call the method
//        result = QuestionControl.userInput(userAnswer);
//        
//        //Test to see if the result returned equals the expected result
//        assertEquals(expResult, result);
//        
//        //Test Case 5
//        System.out.println("\tTest Case 5");
//        
//        //Define the input variable
//        userAnswer = 4;
//        
//        //Define the expected output variable
//        expResult = 4;
//        
//        //Call the method
//        result = QuestionControl.userInput(userAnswer);
//        
//        //Test to see if the result returned equals the expected result
//        assertEquals(expResult, result);
//    }
//    
//}
