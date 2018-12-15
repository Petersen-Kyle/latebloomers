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
public class Location implements Serializable {

    private int column;
    private int row;
    private boolean visited;
    private String name;
    private String description;
    private Question question;
    private Item item;
    private String sceneSymbol;

    public Location() {
    }

    public String getSceneSymbol() {
        return sceneSymbol;
    }

    public void setSceneSymbol(String sceneSymbol) {
        this.sceneSymbol = sceneSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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
        int hash = 5;
        hash = 83 * hash + this.column;
        hash = 83 * hash + this.row;
        hash = 83 * hash + (this.visited ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + Objects.hashCode(this.question);
        hash = 83 * hash + Objects.hashCode(this.sceneSymbol);
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
        final Location other = (Location) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.sceneSymbol, other.sceneSymbol)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "column=" + column + ", row=" + row + ", visited=" + visited + ", name=" + name + ", description=" + description + ", question=" + question + ", sceneSymbol=" + sceneSymbol + '}';
    }

}
