/*
 * Name: Change Circle Color
 * Author: Leah Boalich
 * Date: September 25, 2024
 * Descriotion: This program displays a white circle.  When the mouse is pressed it changes to black.  When the mouse is released it changes back to white.
 */

//Imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

// Display white circle that changes to black when pressed
public class ChangeCircleColor extends Application {
    // Create pane to hold circle
    private CirclePane circlePane = new CirclePane();

    // Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {
        // Create border pane
        BorderPane borderPane = new BorderPane();
        // Place circle pane in center of border pane
        borderPane.setCenter(circlePane);

        // Change circle color to black while mouse pressed
        circlePane.setOnMousePressed(e -> circlePane.changeColorOnPress());
        // Chnage circle color back to white when mouse released
        circlePane.setOnMouseReleased(e -> circlePane.changeColorOnRelease());

        /* Create a scene and place it in the stage */
        Scene scene = new Scene(borderPane, 200, 150);
        // Set the stage title
        primaryStage.setTitle("ChangeCircleColor");
        // Place the scene in the stage
        primaryStage.setScene(scene);
        // Display the stage
        primaryStage.show();
    }

    // Run the program
    public static void main(String[] args) {
        Application.launch(args);
    }
}

// Define circle pane to hold circle
class CirclePane extends StackPane {
    // Create circle with radius of 50
    private Circle circle = new Circle(50);

    // Circle pane constructor
    public CirclePane() {
        // Add circle to pane
        getChildren().add(circle);
        // Set circle stroke color to black
        circle.setStroke(Color.BLACK);
        // Set circle color to white
        circle.setFill(Color.WHITE);
    }

    // Change circle color to black
    public void changeColorOnPress() {
        // Set circle color to black
        circle.setFill(Color.BLACK);
    }

    // Change circle color to white
    public void changeColorOnRelease() {
        // Set circle color to white
        circle.setFill(Color.WHITE);
    }
}
