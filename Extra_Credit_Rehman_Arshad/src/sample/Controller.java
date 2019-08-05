package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import java.security.SecureRandom;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Transform;

public class Controller {

    @FXML private Pane pane;


    // Ch 22: JavaFx Graphics and Multi Media

    private static final SecureRandom random = new SecureRandom();

    public void initialize() {
        // points that define a five-pointed star shape
        Double[] points = {205.0, 150.0, 217.0,186.0,259.0,186.0,
                223.0,204.0,233.0,246.0,205.0,222.0,177.0,246.0,205.0, 222.0, 177.0, 246.0, 187.0, 204.0,
                151.0, 186.0, 193.0, 186.0};

        //  create 18 stars
        for (int count = 0; count < 18; ++count) {
            // create a new Polygon and copy existing points into it
            Polygon newStar = new Polygon();
            newStar.getPoints().addAll(points);

            // create random Color and set as newStar's fill
            newStar.setStroke(Color.GREY);
            newStar.setFill(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextDouble()));

            // apply a rotation to the shape:
            newStar.getTransforms().add( Transform.rotate(count*20,150,150));
            pane.getChildren().add(newStar);

        }
    }




}
