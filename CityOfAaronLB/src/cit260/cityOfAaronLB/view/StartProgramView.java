/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import cit260.cityOfAaronLB.model.Player;


/**
 *
 * @author lafon
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("                   City Of Aaron                          \n"
                + "                                               /\\      /\\\n"
                + "                                               ||______||\n"
                + "                                               || ^  ^ ||\n"
                + "                                               \\| |  | |/\n"
                + "                                                |______|\n"
                + "              __                                |  __  |\n"
                + "             /  \\       ________________________|_/  \\_|__\n"
                + "            / ^^ \\     /=========================/ ^^ \\===|\n"
                + "           /  []  \\   /=========================/  []  \\==|\n"
                + "          /________\\ /=========================/________\\=|\n"
                + "       *  |        |/==========================|        |=|\n"
                + "      *** | ^^  ^^ |---------------------------| ^^  ^^ |--\n"
                + "     *****| []  [] |           _____           | []  [] | |\n"
                + "    *******        |          /_____\\          |      * | |\n"
                + "   *********^^  ^^ |  ^^  ^^  |  |  |  ^^  ^^  |     ***| |\n"
                + "  ***********]  [] |  []  []  |  |  |  []  []  | ===***** |\n"
                + " *************     |         @|__|__|@         |/ |*******|\n"
                + "***************   ***********--=====--**********| *********\n"
                + "***************___*********** |=====| **********|***********\n"
                + " *************     ********* /=======\\ ******** | *********\n"
                + "			        ,,,                      ,,,\n"
                + "			       {{{}}    ,,,             {{{}}    ,,,\n"
                + "			    ,,, ~Y~    {{{}},,,      ,,, ~Y~    {{{}},,, \n"
                + "			   {{}}} |/,,,  ~Y~{{}}}    {{}}} |/,,,  ~Y~{{}}}\n"
                + "			    ~Y~ \\|{{}}}/\\|/ ~Y~  ,,, ~Y~ \\|{{}}}/\\|/ ~Y~  ,,,\n"
                + "			    \\|/ \\|/~Y~  \\|,,,|/ {{}}}\\|/ \\|/~Y~  \\|,,,|/ {{}}}\n"
                + "			    \\|/ \\|/\\|/  \\{{{}}/  ~Y~ \\|/ \\|/\\|/  \\{{{}}/  ~Y~\n"
                + "			    \\|/\\\\|/\\|/ \\\\|~Y~//  \\|/ \\|/\\\\|/\\|/ \\\\|~Y~//  \\|/\n"
                + "			    \\|//\\|/\\|/,\\\\|/|/|// \\|/ \\|//\\|/\\|/,\\\\|/|/|// \\|/\n"
                + "			   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                + "\n"
                + "\n"
                + "Enter your name: ");
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "e":
                this.console.println("Thanks for playing Late Bloomers City of Aaron");
                System.exit(0);
                break;
            case "":
                this.console.println("You must enter a non-blank value");
                break;
            default:
                Player player = new Player();
                player.setName(inputs);
                CityOfAaronLB.setPlayer(player);
                for (int clear = 0; clear < 1000; clear++) {
                    System.out.println("\b");
                }
                this.console.println("Welcome to the City of Aaron, Lord " + player.getName());
                MainMenu newMainMenu = new MainMenu();
                newMainMenu.display();
                break;
        }
        return true;

    }
}