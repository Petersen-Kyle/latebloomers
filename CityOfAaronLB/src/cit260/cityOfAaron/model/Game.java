/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.model;
import java.io.Serializable;

/**
 *
 * @author pytha
 */
public class Game implements Serializable{

    private int currentPopulation;
    private int acresOwned;
    private int wheatInStroage;
            
    public Game() {
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
        return wheatInStroage;
    }

    public void setWheatInStroage(int wheatInStroage) {
        this.wheatInStroage = wheatInStroage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.currentPopulation;
        hash = 31 * hash + this.acresOwned;
        hash = 31 * hash + this.wheatInStroage;
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
        if (this.wheatInStroage != other.wheatInStroage) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "game{" + "currentPopulation=" + currentPopulation + ", acresOwned=" + acresOwned + ", wheatInStroage=" + wheatInStroage + '}';
    }
    
    
    
}
