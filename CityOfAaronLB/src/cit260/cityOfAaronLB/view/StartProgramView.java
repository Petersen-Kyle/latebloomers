/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import java.util.Scanner;

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
                System.out.println("Thanks for playing Late Bloomers City of Aaron");
                System.exit(0);
            case "":
                System.out.println("You must enter a non-blank value");
            default:
                String name = "";
                inputs = name;
                System.out.println("Welcome to the City of Aaron " + name);
                MainMenu newMainMenu = new MainMenu();
                newMainMenu.display();
        }
        return true;

    }
}