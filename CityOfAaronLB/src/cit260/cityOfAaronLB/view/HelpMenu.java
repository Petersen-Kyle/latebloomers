/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;
import java.io.IOException;

/**
 *
 * @author pytha
 */
public class HelpMenu {

    public static void helpMenu() throws IOException {
  
    char choice, ignore;  
    for(;;) {
    do {
        System.out.println("Help Menu");
        System.out.println("1. History of the City of Aaron?");
        System.out.println("2. What is the goal of the game?");
        System.out.println("3. How to make a move?");
        System.out.println("4. Tips and Hints");
        System.out.println("5. Starting Resources");
        System.out.println("Choose one (Q to Quit): ");
        choice = (char) System.in.read();
        
        do{
        ignore = (char) System.in.read();
        } while(ignore != '\n');
    } while(choice < '1' | choice > '5' & choice !='q');
    
    if (choice == 'q') break;
            
    System.out.println("\n");
    
    switch(choice) {
        case '1':
            
            break;
        case '2':
            
            break;
        case '3':
            
            break;
        case '4':
            
            break;
        case '5':    
           
            break;
    }
    System.out.println();
    }
    }
    
}



