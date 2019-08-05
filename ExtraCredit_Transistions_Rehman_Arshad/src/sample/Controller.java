package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Controller {

    // Ch 22: Java FX Graphics and Multi Media:

    @FXML private Rectangle rectangle;
    @FXML private Button startButton;

    // configure and start the transition animation :
    @FXML
    private void startButtonPressed(ActionEvent event){

        // transition that changes a shapes'd fill
        FillTransition fillTransition = new FillTransition(Duration.seconds(1));
        fillTransition.setToValue(Color.CYAN);
        fillTransition.setCycleCount(2);



        // each even cycle plays transition in reverse to restore original:
        fillTransition.setAutoReverse(true);



        // transition that changes a shape's stroke over time
        StrokeTransition strokeTransition = new StrokeTransition(Duration.seconds(1));
        strokeTransition.setToValue(Color.BLUE);
        strokeTransition.setCycleCount(2);
        strokeTransition.setAutoReverse(true);



        // parallelize's multiple transitions:
        ParallelTransition parallelTransition = new ParallelTransition(fillTransition, strokeTransition);



        // transition that changes a node's opacity over time
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setFromValue(1.0);       // opaque
        fadeTransition.setToValue(0.0);         // transparent
        fadeTransition.setCycleCount(2);
        fadeTransition.setAutoReverse(true);



        // transition that rotates a node:
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(1));
        rotateTransition.setByAngle(360.0);
        rotateTransition.setCycleCount(2);
        rotateTransition.setInterpolator(Interpolator.EASE_BOTH);
        rotateTransition.setAutoReverse(true);



        // transition that moves a node along a Path:
        Path path = new Path(new MoveTo(45,90), new LineTo(45, 0), new LineTo(90,0), new LineTo(90,90), new LineTo(0,90));
        PathTransition translateTransition = new PathTransition(Duration.seconds(2), path);
        translateTransition.setCycleCount(2);
        translateTransition.setInterpolator(Interpolator.EASE_IN);
        translateTransition.setAutoReverse(true);



        // transition that scales a shape to make it larger or smaller:
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(1));
        scaleTransition.setByX(0.75);
        scaleTransition.setByY(0.75);
        scaleTransition.setCycleCount(2);
        scaleTransition.setInterpolator(Interpolator.EASE_OUT);
        scaleTransition.setAutoReverse(true);



        // transition that applies a sequence of transitions to a node:
        SequentialTransition sequentialTransition = new SequentialTransition(rectangle, parallelTransition, fadeTransition, rotateTransition, translateTransition ,scaleTransition);
        sequentialTransition.play();     // play the sequence of transitions

    }

}
