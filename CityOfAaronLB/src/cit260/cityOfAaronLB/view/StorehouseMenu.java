/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.io.IOException;

/**
 *
 * @author lafon
 */
public class StorehouseMenu {

    public void storeHouseMenu() throws IOException {

        char choice, ignore;
        for (;;) {
            do {
                System.out.println("Store House");
                System.out.println("1. Current resources");
                System.out.println("2. How to use the resources");
                System.out.println("Choose one or (Q to Quit to Main Menu): ");
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '2' & choice != 'q' & choice != 'Q');

            if (choice == 'q' | choice == 'Q') {
                break;
            }

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Current Resources");
                    break;
                case '2':
                    System.out.println("How to use the resources");
                    break;
            }
            System.out.println();
        }
    }
}
