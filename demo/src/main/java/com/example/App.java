/**
 * Samuel CARON
 * TP2 Calculatrice
 * 2020-2021
 * IUT de Calais
 * App.java
 */

// package
package com.example;

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        // constructor
        Numbers nbr = new Numbers();
        nbr.setSpacing(5);
        Operator op = new Operator();
        op.setSpacing(10);
        Results res = new Results();

         // create the scene
        var scene = new Scene(new VBox(nbr,op,res), 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    // Main function 
    public static void main(String[] args) {
        launch();
    }

}