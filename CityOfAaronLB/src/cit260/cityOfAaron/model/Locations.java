/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaron.model;

import java.util.Objects;

/**
 *
 * @author lafon
 */
public class Locations {
    private int column;
    private int row;
    private boolean visited;

    public Locations() {
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.column;
        hash = 13 * hash + this.row;
        hash = 13 * hash + (this.visited ? 1 : 0);
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
        final Locations other = (Locations) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

 

    @Override
    public String toString() {
        return "Locations{" + "column=" + column + ", row=" + row + ", visited=" + visited + '}';
    }
    
    
}
