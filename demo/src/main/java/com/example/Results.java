/**
 * Samuel CARON
 * TP2 Calculatrice
 * 2020-2021
 * IUT de Calais
 * Results.java
 */

// package
package com.example;

// imports
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

// class Results
public class Results extends VBox {
    
    public static TextField result = new TextField("Results");
    public static Button calculate = new Button("Calculate");
    public static Button erase = new Button("Erase");

    public Results() {

        // constructor
        this.getChildren().addAll(result, calculate, erase);

        // actions
        erase.setOnAction(e -> {
            Numbers.nbr1 = 0;
            Numbers.nbr2 = 0;
            Numbers.state = false;
            result.setText("Results");
        });

        calculate.setOnAction(e -> {
            double res = cal(Operator.operator, Numbers.nbr1, Numbers.nbr2);
            result.setText(Double.toString(res));
            Numbers.nbr1 = res;
            Numbers.nbr2 = 0;
            Numbers.state = true;
            System.out.println(String.format( "%f %f", Numbers.nbr1, Numbers.nbr2));
        });

    }

    // Méthode de calcul
    public static double cal(char op, double a, double b) {
        switch(op) {
            case '+':
                return a + b ;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0.0f;
        }
    }
}
