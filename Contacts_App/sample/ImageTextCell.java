package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;

public class ImageTextCell extends ListCell<Contacts> {

    @FXML public ImageView imageViewPhoto;
    @FXML public Label labelName;
    @FXML public AnchorPane rootPane;

    private FXMLLoader loader;

    // called to configure each custom ListView cell:
    @Override
    protected void updateItem(Contacts item, boolean empty) {
        // required to ensure that the cell displays properly
        super.updateItem(item, empty);

        if(empty || item == null){
            setText(null);
            setGraphic(null);  // don't display anything ...
        }else{

            if(loader == null){
                try{
                    loader = new FXMLLoader(getClass().getResource("cellContent.fxml"));
                    loader.setController(this);
                    loader.load();
                }catch(IOException e){
                    e.printStackTrace();    // <---- VERY USEFUL FOR DEBUGGING!!!!!
                }
            }

            // set ImageView's thumbnail image:
            // thumbImageView.setImage(new Image(item.getThumbImage()));
            // label.setText(item.getText());  // configure Label's text

            // Concatenating the Strings:
            labelName.setText(item.getFirstName() + " " + item.getLastName());
            imageViewPhoto.setImage(item.getPhoto());
            setText(null);
            setGraphic(rootPane);  // attach custom layout to ListView cell
        }
    }
}




