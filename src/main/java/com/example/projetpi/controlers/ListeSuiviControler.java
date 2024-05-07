package com.example.projetpi.controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class ListeSuiviControler implements Initializable {

        @FXML
        private Button btnAjoutSuivi;

        @FXML
        private Button btnModifier;

        @FXML
        private Button btnSupprimer;

        @FXML
        private TableColumn<?, ?> colDate;

        @FXML
        private TableColumn<?, ?> colIDActi;

        @FXML
        private TableColumn<?, ?> colRep;

        @FXML
        void AjouterSuivi(ActionEvent event) {

        }

        @FXML
        void ModifierSuivi(ActionEvent event) {

        }

        @FXML
        void SupprimerSuivi(ActionEvent event) {

        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


