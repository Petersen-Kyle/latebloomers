/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.model;

/**
 *
 * @author kpetersen
 */
public enum Author {
    
    Michael("Michael","Smith","CIT260"),
    MJ("MJ","LaFond","CIT260"),
    Donovan("Donovan","Jones","CIT260"),
    Kyle("Kyle","Petersen","CIT260");
    
    private String firstname;
    private String lastname;
    private String classname;

    Author(String firstname, String lastname, String classname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.classname = classname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getClassname() {
        return classname;
    }

    @Override
    public String toString() {
        return "Author{" + "firstname=" + firstname + ", lastname=" + lastname + ", classname=" + classname + '}';
    }
    
    
}
