package ma.ensa.javaproject.controlejava.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ma.ensa.javaproject.controlejava.DAO.MembreDaoImpl;
import ma.ensa.javaproject.controlejava.Module.Membre;

import java.io.IOException;

public class NewMemreController {

    @FXML
    private TextField nomField;
    @FXML
    private TextField prenomField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField phoneField;
    @FXML
    private Label error;


    public void insererButton() throws IOException {
        MembreDaoImpl mem = new MembreDaoImpl();
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        if (!nom.isEmpty()  && !prenom.isEmpty() && !email.isEmpty() && !phone.isEmpty()) {
            Membre membre = new Membre(nom,prenom,email,phone);
            mem.inserer(membre);
            error.setText("Le membre a été ajoutée");
        }else {
            error.setText("Les champ sont vide");
            System.out.println("Error : des champs vides !");
        }
    }
}
