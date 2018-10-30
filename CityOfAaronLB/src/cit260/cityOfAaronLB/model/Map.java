/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lafon
 */
public class Map implements Serializable {
    Locations location = new Locations();
    private Point currentLocation;
    private int row;
    private int column;

    public Map() {
    }
    
    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Objects.hashCode(this.currentLocation);
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
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
        final Map other = (Map) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "location=" + location + ", currentLocation=" + currentLocation + ", row=" + row + ", column=" + column + '}';
    }
    
    
    
}
