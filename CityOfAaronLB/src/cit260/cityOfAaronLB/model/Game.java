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


    private int population;
    private int acres;
    private int wheat;
//    private Player player;
    private Map map;
    private int acresPlanted;
    
    
    public Game() {
        population = 100;
        acres = 1000;
        wheat = 3000;
        
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

    
//    public Player getPlayer() {
//        return player;
//    }
//    
//
//    public void setPlayer(Player player) {
//        this.player = player;
//    }
    
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAcres() {
        return acres;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public int getWheatInStroage() {
        return wheat;
    }

    public void setWheatInStroage(int wheatInStroage) {
        this.wheat = wheatInStroage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.population;
        hash = 31 * hash + this.acres;
        hash = 31 * hash + this.wheat;
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
        if (this.population != other.population) {
            return false;
        }
        if (this.acres != other.acres) {
            return false;
        }
        if (this.wheat != other.wheat) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "game{" + "currentPopulation=" + population + ", acresOwned=" + acres + ", wheatInStroage=" + wheat + '}';
    }
    
    
    
}
