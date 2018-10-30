/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;

/**
 *
 * @author lafon
 */
public class QuestionControl {
    public static int userInput(int userAnswer){
        
        if(userAnswer <= 0){//User answer is negative or zero
            return -1;
        }
        else if(userAnswer > 4){//User enters a value greater than 4
            return -2;
        }
        else if(userAnswer == 1){
            return 1;
        }
        else if(userAnswer == 2){
            return 2;
        }
        else if(userAnswer == 3){
            return 3;
        }
        else{
            return 4;
        }
    }
}
