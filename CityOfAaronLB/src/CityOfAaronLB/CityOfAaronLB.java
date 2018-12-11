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
    private static PrintWriter outPut = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile(){
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        CityOfAaronLB.logFile = logFile;
    }
    
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

    public static PrintWriter getOutPut() {
        return outPut;
    }

    public static void setOutPut(PrintWriter outPut) {
        CityOfAaronLB.outPut = outPut;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaronLB.inFile = inFile;
    }

    public static void main(String[] args) {
        for (int clear = 0; clear < 1000; clear++) {
            System.out.println("\b");
        }
        try {
            logFile = new PrintWriter("logFile.txt");
            CityOfAaronLB.inFile = new BufferedReader(new InputStreamReader(System.in));
            CityOfAaronLB.outPut = new PrintWriter(System.out, true);

            StartProgramView newStart = new StartProgramView();
            newStart.display();
            return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        } finally {
            try {

                if (logFile != null) {
                    logFile.close();
                }
                if (CityOfAaronLB.inFile != null) {
                    CityOfAaronLB.inFile.close();
                }
                if (CityOfAaronLB.outPut != null) {
                    CityOfAaronLB.outPut.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

}
