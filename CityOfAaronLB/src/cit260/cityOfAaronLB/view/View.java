/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

/**
 *
 * @author kpetersen
 */
public abstract class View implements ViewInterface{

    @override
    public void display(){
       
            boolean endOfView = false;

        do {

            char[] inputs = this.getInputs();
            if (inputs[0] == 'e') {
                System.exit(0);
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
         
    }    


    }


