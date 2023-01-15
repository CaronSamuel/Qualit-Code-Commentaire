/**
 * Samuel CARON
 * TP2 Calculatrice
 * 2020-2021
 * IUT de Calais
 * Numbers.java
 */

 // package
package com.example;
    
 // imports
import javafx.scene.layout.HBox;

// class Numbers
public class Numbers extends HBox {
    
    // constructor
    public static boolean state = false;
    public static double nbr1;
    public static double nbr2;

    public Numbers() {
        
        for(int i = 0; i < 10; i++) {
            Number number = new Number(i);
            this.getChildren().add(number);
        }

    }
}
