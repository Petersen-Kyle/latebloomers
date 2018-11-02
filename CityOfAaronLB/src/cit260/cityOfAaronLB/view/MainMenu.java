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
public class MainMenu {
    
public void mainMenu() throws IOException {
  
    char choice, ignore;  
    for(;;) {
    do {
        System.out.println("Main Menu");
        System.out.println("1. Start a new game");
        System.out.println("2. Load a saved game");
        System.out.println("3. Help");
        System.out.println("Choose one (Q to Quit): ");
        choice = (char) System.in.read();
        
        do{
        ignore = (char) System.in.read();
        } while(ignore != '\n');
    } while(choice < '1' | choice > '3' & choice !='q');
    
    if (choice == 'q') break;
            
    System.out.println("\n");
    
    switch(choice) {
        case '1':
            
            break;
        case '2':
            
            break;
        case '3':
            
            break;

    }
    System.out.println();
    }
    }

}  
