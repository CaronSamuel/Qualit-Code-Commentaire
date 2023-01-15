/**
 * Samuel CARON
 * TP2 Calculatrice
 * 2020-2021
 * IUT de Calais
 * Operator.java
 */

// package
package com.example;

// imports
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

// classe Operator
public class Operator extends HBox {
    
    // constructor
    public static Button division = new  Button("/");
    public static Button multiplication = new  Button("*");
    public static Button substraction = new  Button("-");
    public static Button addition = new  Button("+");
    public static char operator;

    public Operator() {
    
        this.getChildren().addAll(division, multiplication, substraction, addition);

        // actions
        division.setOnAction(e -> {
            Numbers.state = true;
            operator = '/';
        });
        multiplication.setOnAction(e -> {
            Numbers.state = true;
            operator = '*';
        });
        substraction.setOnAction(e -> {
            Numbers.state = true;
            operator = '-';
        });
        addition.setOnAction(e -> {
            Numbers.state = true;
            operator = '+';
        });
    }
}
