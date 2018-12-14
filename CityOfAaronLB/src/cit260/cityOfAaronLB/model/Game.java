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

    private int starved; //number of people who didnt get fed
    private int newPop; //random number of people who moved to town
    private int year; //current year
    private int perAcre; // random amount of wheat returned when planted
    private int tithe; //amount of wheat paid to tithe
    private int increase; //amount of wheat harvested after planting
    private int titheBonus; // not used
    private int perWheat; //random value of 1 acre of land
    private int ratsEat; //amount that rats ate
    private int population; //number of people in the city
    private int acres; //number of acres owned
    private int wheat; //amount of wheat in storage
    private Map map;
    private int acresPlanted; //number of acres that were planted
    private boolean peopleFed;
    private boolean acresTheyPlanted;
    private boolean tithesPaid;
    
    
    public Game() {
        increase = 1;
        year = 1;
        starved = 0;
        newPop = 0;
        population = 100;
        acres = 1000;
        perWheat = ((int) (Math.random() * 10) + 17);
        perAcre = ((int) (Math.random() * 3) + 1);
        wheat = 3000;
        tithe = 1;
        ratsEat = 0;
        
    }

    public int getIncrease() {
        return increase;
    }

    public void setIncrease(int increase) {
        this.increase = increase;
    }

    
    public boolean isTithesPaid() {
        return tithesPaid;
    }

    public void setTithesPaid(boolean tithesPaid) {
        this.tithesPaid = tithesPaid;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }



    public boolean isPeopleFed() {
        return peopleFed;
    }

    public void setPeopleFed(boolean peopleFed) {
        this.peopleFed = peopleFed;
    }

    public boolean isAcresTheyPlanted() {
        return acresTheyPlanted;
    }

    public void setAcresTheyPlanted(boolean acresTheyPlanted) {
        this.acresTheyPlanted = acresTheyPlanted;
    }


    
    public int getTitheBonus() {
        return titheBonus;
    }

    public void setTitheBonus(int titheBonus) {
        this.titheBonus = titheBonus;
    }
    

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public int getStarved() {
        return starved;
    }

    public void setStarved(int starved) {
        this.starved = starved;
    }

    public int getNewPop() {
        return newPop;
    }

    public void setNewPop(int newPop) {
        this.newPop = newPop;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPerAcre() {
        return perAcre;
    }

    public void setPerAcre(int perAcre) {
        this.perAcre = perAcre;
    }

    public int getTithe() {
        return tithe;
    }

    public void setTithe(int tithe) {
        this.tithe = tithe;
    }

    public int getPerWheat() {
        return perWheat;
    }

    public void setPerWheat(int perWheat) {
        this.perWheat = perWheat;
    }

    public int getRatsEat() {
        return ratsEat;
    }

    public void setRatsEat(int ratsEat) {
        this.ratsEat = ratsEat;
    }

   
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

    public int getWheat() {
        return wheat;
    }

    public void setWheat(int wheat) {
        this.wheat = wheat;
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
        return "Game{" + "population=" + population + ", acres=" + acres + ", wheat=" + wheat + ", map=" + map + ", acresPlanted=" + acresPlanted + '}';
    }


    
    
    
}
