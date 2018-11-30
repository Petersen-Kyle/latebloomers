/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import cit260.cityOfAaronLB.control.MapControl;
import static cit260.cityOfAaronLB.control.MapControl.movePlayer;
import cit260.cityOfAaronLB.model.Game;
import cit260.cityOfAaronLB.model.Location;
import cit260.cityOfAaronLB.model.Map;

/**
 *
 * @author lafon
 */
public class MoveLocation extends View {

    public MoveLocation() {
        super("Enter where you would like to go:");
    }

    @Override
    public boolean doAction(String mapOption) {
        return false;
    }

}
