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
                +"\n"
                +"\n"
                +"Enter your name: ");
    }
    
    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "e":
                System.out.println("Thanks for playing Late Bloomers City of Aaron");
                System.exit(0);
            
            
        }



public void display() {
        boolean endOfView = false;

        do {

            String[] inputs = this.getInputs();
            if (inputs[0] == "e") {
                System.exit(0);
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    public String[] getInputs() {
        System.out.println(
                "                   City Of Aaron                          \n"
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
                + "			   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        String[] inputs = new String[1];
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter your name:");
            Scanner inFile;
            inFile = new Scanner(System.in);
            String name = inFile.nextLine().trim();

            if (name.equalsIgnoreCase("e")) {
                System.out.println("Thanks for playing Late Bloomers City of Aaron");
                System.exit(0);
            } else if (name.length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            inputs[0] = name;
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called ****");
        System.out.println("Welcome to the City of Aaron " + inputs[0]);
        MainMenu newMainMenu = new MainMenu();
        newMainMenu.mainMenu();
        return true;

    }
}
