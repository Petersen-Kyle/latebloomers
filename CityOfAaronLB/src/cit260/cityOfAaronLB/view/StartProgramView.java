/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;
import java.util.Scanner;



/**
 *
 * @author lafon
 */
public class StartProgramView {
    
    
    public StartProgramView(){
    }  
    public void DisplayBanner(){    
        System.out.println(
"                   City Of Aaron                          \n" +
"                                               /\\      /\\\n" +
"                                               ||______||\n" +
"                                               || ^  ^ ||\n" +
"                                               \\| |  | |/\n" +
"                                                |______|\n" +
"              __                                |  __  |\n" +
"             /  \\       ________________________|_/  \\_|__\n" +
"            / ^^ \\     /=========================/ ^^ \\===|\n" +
"           /  []  \\   /=========================/  []  \\==|\n" +
"          /________\\ /=========================/________\\=|\n" +
"       *  |        |/==========================|        |=|\n" +
"      *** | ^^  ^^ |---------------------------| ^^  ^^ |--\n" +
"     *****| []  [] |           _____           | []  [] | |\n" +
"    *******        |          /_____\\          |      * | |\n" +
"   *********^^  ^^ |  ^^  ^^  |  |  |  ^^  ^^  |     ***| |\n" +
"  ***********]  [] |  []  []  |  |  |  []  []  | ===***** |\n" +
" *************     |         @|__|__|@         |/ |*******|\n" +
"***************   ***********--=====--**********| *********\n" +
"***************___*********** |=====| **********|***********\n" +
" *************     ********* /=======\\ ******** | *********\n" +
"			        ,,,                      ,,,\n" +
"			       {{{}}    ,,,             {{{}}    ,,,\n" +
"			    ,,, ~Y~    {{{}},,,      ,,, ~Y~    {{{}},,, \n" +
"			   {{}}} |/,,,  ~Y~{{}}}    {{}}} |/,,,  ~Y~{{}}}\n" +
"			    ~Y~ \\|{{}}}/\\|/ ~Y~  ,,, ~Y~ \\|{{}}}/\\|/ ~Y~  ,,,\n" +
"			    \\|/ \\|/~Y~  \\|,,,|/ {{}}}\\|/ \\|/~Y~  \\|,,,|/ {{}}}\n" +
"			    \\|/ \\|/\\|/  \\{{{}}/  ~Y~ \\|/ \\|/\\|/  \\{{{}}/  ~Y~\n" +
"			    \\|/\\\\|/\\|/ \\\\|~Y~//  \\|/ \\|/\\\\|/\\|/ \\\\|~Y~//  \\|/\n" +
"			    \\|//\\|/\\|/,\\\\|/|/|// \\|/ \\|//\\|/\\|/,\\\\|/|/|// \\|/\n" +
"			   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");                  
                
    }
    public void DisplayStartProgramView(){ 
        boolean endOfView = false;
    
    do {
       
        String[] inputs = this.getInputs();                
        if (inputs.length < 1 || inputs[0] == "Q"){
                      
        }        
        endOfView = doAction(inputs);
        
        } 
        while (endOfView != true); 
    
       
    }
    
    
    
    private String[] getInputs(){

        System.out.println("Enter your name:");
        Scanner inFile;
        inFile = new Scanner(System.in);
        String name = inFile.nextLine();
        System.out.println("Welcome to the City of Aaron " + name);
        
        
        String [] inputs = new String[1];
        inputs[0] = ("testInput");
        return inputs;
       
    }
       
    private boolean doAction(String[] inputs){
        System.out.println("**** doAction() called ****");
        System.out.println("\tinputs =" + inputs[0]);
        return true;
    }  
    
    }
    
    
    
    

