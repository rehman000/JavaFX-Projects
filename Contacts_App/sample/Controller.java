package sample;

import javafx.fxml.FXML;
import java.io.*;
import javafx.fxml.Initializable;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import java.util.Comparator;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML public Button addListElement;
    @FXML public Button saveContact;
    @FXML public Button buttonRemove;
    @FXML public ImageView imageViewContact;
    @FXML public TextField textFieldPhoneNumber;
    @FXML public TextField textFieldFirstName;
    @FXML public TextField textFieldLastName;
    @FXML public TextField textFieldEmail;
    @FXML public TextField textFieldEMPLID;
    @FXML public ListView<Contacts> listContact;
    @FXML public Button exportButton;

    private Contacts currentContact;
    private Image currentImage;
    private FileChooser fileChooser;
    private ObservableList<Contacts> contactsObservableList;   // Observable list

    public void addNewContact(ActionEvent actionEvent) {
        textFieldFirstName.clear();
        textFieldLastName.clear();
        textFieldEmail.clear();
        textFieldPhoneNumber.clear();
        textFieldEMPLID.clear();
        imageViewContact.setImage(null);
        currentContact = new Contacts();
        currentImage = null;
    }

    public void changePhoto(MouseEvent mouseEvent) {
        File file = fileChooser.showOpenDialog(imageViewContact.getScene().getWindow());
        try {
            currentImage = new Image(new FileInputStream(file));
            imageViewContact.setImage(currentImage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveContact(ActionEvent actionEvent) {
        if (textFieldLastName.getText().isEmpty() || textFieldFirstName.getText().isEmpty()) {
            return;
        }


        currentContact.setFirstName(textFieldFirstName.getText());
        currentContact.setLastName(textFieldLastName.getText());
        currentContact.setPhoneNumber(textFieldPhoneNumber.getText());
        currentContact.setEmail(textFieldEmail.getText());
        currentContact.setEmplid(textFieldEMPLID.getText());
        currentContact.setPhoto(currentImage);

        int index = contactsObservableList.indexOf(currentContact);
        if (index < 0) {
            contactsObservableList.add(currentContact);
        } else {
            contactsObservableList.set(index, null);
            contactsObservableList.set(index, currentContact);
        }

        sortList();

    }

    private void sortList() {
        Comparator<Contacts> comparator = (o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
        FXCollections.sort(contactsObservableList, comparator);
    }

    public void deleteContact(ActionEvent actionEvent) {
        int index = contactsObservableList.indexOf(currentContact);
        if (index >= 0) {
            contactsObservableList.remove(currentContact);
        }
        addNewContact(null);
    }

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        contactsObservableList = FXCollections.observableArrayList();
        listContact.setItems(contactsObservableList);
        listContact.setCellFactory(contactsListView -> new ImageTextCell());
        currentContact = new Contacts();
        currentImage = null;

        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("images", "*.jpg", "*.png");
        fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(imageFilter);

        listContact.setOnMouseClicked(clicked -> {
            if (listContact.getSelectionModel().getSelectedItem() != currentContact) {
                currentContact = listContact.getSelectionModel().getSelectedItem();
                textFieldFirstName.setText(currentContact.getFirstName());
                textFieldLastName.setText(currentContact.getLastName());
                textFieldPhoneNumber.setText(currentContact.getPhoneNumber());
                textFieldEmail.setText(currentContact.getEmail());
                textFieldEMPLID.setText(currentContact.getEmplid());
                imageViewContact.setImage(currentContact.getPhoto());
            }
        });
    }

    //Saves contact info to a text file of yur choosing and exits program
    public void saveAndExit(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Text File to Overwrite");
        FileChooser.ExtensionFilter textFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(textFilter);


        File file = fileChooser.showOpenDialog(listContact.getScene().getWindow());
        if(file!=null){
            try(PrintWriter writer = new PrintWriter(file)){
                writer.println("Contact Information List: ");
                writer.println("");
                writer.println("======================================================================================");
                for(Contacts contact: contactsObservableList){
                    writer.println("  First Name: " + contact.getFirstName());
                    writer.println("   Last Name: " + contact.getLastName());
                    writer.println("Phone Number: " + contact.getPhoneNumber());
                    writer.println("       Email: " + contact.getEmail());
                    writer.println("       EMPLID: " + contact.getEmplid());
                    writer.println("======================================================================================");
                }
            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
            }
            System.exit(0);
        }
    }






}



