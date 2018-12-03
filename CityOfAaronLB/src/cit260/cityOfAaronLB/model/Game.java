/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.model;
import java.io.Serializable;

/**
 *
 * @author pytha
 */
public class Game implements Serializable{


    private int currentPopulation;
    private int acresOwned;
    private int wheatInStorage;
    private Player player;
    private Map map;
    private int acresPlanted;
    
    
    public Game() {
        currentPopulation = 100;
        acresOwned = 1000;
        wheatInStorage = 2000;
        
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
    public Player getPlayer() {
        return player;
    }
    

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatInStroage() {
        return wheatInStorage;
    }

    public void setWheatInStroage(int wheatInStroage) {
        this.wheatInStorage = wheatInStroage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.currentPopulation;
        hash = 31 * hash + this.acresOwned;
        hash = 31 * hash + this.wheatInStorage;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.currentPopulation != other.currentPopulation) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatInStorage != other.wheatInStorage) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "game{" + "currentPopulation=" + currentPopulation + ", acresOwned=" + acresOwned + ", wheatInStroage=" + wheatInStorage + '}';
    }
    
    
    
}
