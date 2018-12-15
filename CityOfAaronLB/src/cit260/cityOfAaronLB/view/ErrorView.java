/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.view;

import CityOfAaronLB.CityOfAaronLB;
import java.io.PrintWriter;

/**
 *
 * @author pytha
 */
public class ErrorView {

    private static PrintWriter console = CityOfAaronLB.getOutPut();
    private static PrintWriter log = CityOfAaronLB.getLogFile();

    public ErrorView() {

    }

    public static void display(String className, String errorMessage) {
        console.println(
                "\n----ERROR------------------------------"
                + "\n" + errorMessage
                + "\n---------------------------------------");
        log.printf("%n%n%s", className + " - " + errorMessage);
    }

    public static PrintWriter getConsole() {
        return console;
    }

    public static void setConsole(PrintWriter console) {
        ErrorView.console = console;
    }

    public static PrintWriter getLog() {
        return log;
    }

    public static void setLog(PrintWriter log) {
        ErrorView.log = log;
    }

}
