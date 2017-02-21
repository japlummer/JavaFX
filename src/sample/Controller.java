package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.lang.model.element.Name;
import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.SystemColor.text;


public class Controller implements Initializable {

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField Name;
    @FXML
    TextField Phone;
    @FXML
    TextField Email;


    public void addItem(){
        // System.out.println("addContact");

        if (Name.getText().isEmpty()||Phone.getText().isEmpty()||Email.getText().isEmpty()) {

        }else{
                contacts.add(new Contact(Name.getText(), Phone.getText(), Email.getText()));
                Name.setText("");
                Phone.setText("");
                Email.setText("");
            }


            }

    public void removeItem(){
        //     System.out.println("removeItem");
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);

    }
}
