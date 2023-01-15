/**
 * Samuel CARON
 * TP2 Calculatrice
 * 2020-2021
 * IUT de Calais
 * Number.java
 */

 // package
package com.example;

// imports
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

// class Number
public class Number extends VBox {
    
    // constructor
    public Number(int n) {
        
        // Création des bouttons 
        Button button = new Button(Integer.toString(n));

        // actions
        button.setOnAction(e -> {
            if(Numbers.state == false) {
                Numbers.nbr1 = Numbers.nbr1 * 10 + n;
                Results.result.setText(Double.toString(Numbers.nbr1) + Operator.operator + Double.toString(Numbers.nbr2));
            } else {
                Numbers.nbr2 = Numbers.nbr2 * 10 + n;
                Results.result.setText(Double.toString(Numbers.nbr1) + Operator.operator + Double.toString(Numbers.nbr2));
            }
        });
        this.getChildren().add(button);
    }

}
 