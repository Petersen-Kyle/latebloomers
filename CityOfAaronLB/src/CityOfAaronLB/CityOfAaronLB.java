/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author lafon
 */

package CityOfAaronLB;

import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Player;
import cit260.cityOfAaronLB.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class CityOfAaronLB {
    
    public static Player player;
    public static Game game;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player currentPlayer) {
        player = currentPlayer;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game currentGame) {
        game = currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaronLB.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaronLB.inFile = inFile;
    }

    
    public static void main(String[] args) {
    
        try {
        CityOfAaronLB.inFile = new BufferedReader(new InputStreamReader(System.in));
        CityOfAaronLB.outFile = new PrintWriter(System.out, true);
                
        StartProgramView newStart = new StartProgramView();
        newStart.display();
        return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        }
        
        finally {
            try {
                if (CityOfAaronLB.inFile != null)
                    CityOfAaronLB.inFile.close();
                if (CityOfAaronLB.outFile != null)
                    CityOfAaronLB.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    
}
