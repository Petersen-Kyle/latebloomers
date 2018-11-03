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
public class GameMenuView {

public void gameMenuView() throws IOException {
  
    char choice, ignore;  
    for(;;) {
    do {
        System.out.println("Game Menu");
        System.out.println("1. View the Map");
        System.out.println("2. Move to a new location");
        System.out.println("3. Manage Crops and Land");
        System.out.println("4. Reports Menu");
        System.out.println("5. Save Game");
        System.out.println("Choose one or (Q to Exit the game): ");
        choice = (char) System.in.read();
        
        do{
        ignore = (char) System.in.read();
        } while(ignore != '\n');
    } while(choice < '1' | choice > '5' & choice !='q' & choice !='Q');
    
    if (choice == 'q' | choice == 'Q') break;
            
    System.out.println("\n");
    
    switch(choice) {
        case '1':
            System.out.println("City of Aaron Map");
            break;
        case '2':
            System.out.println("Where would you like to move to? ");
            break;
        case '3':
            System.out.println("Open Land Management");
            break;
        case '4':
            System.out.println("Open the reports menu");
            break;            
        case '5':
            System.out.println("Save your game");
            break;
         
                       
    }
    System.out.println();
    }
    }    
}
