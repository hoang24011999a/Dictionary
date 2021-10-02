//package demo.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class DashBoardController {
    //private textToSpeech speech = new textToSpeech();
    @FXML
    private TextField textSearch;
    @FXML
    private ListView<String> listSearch;
    @FXML
    private void renderListSearch() {
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("String", "Application", "Demo", "Render");
        listSearch.setItems(items);
    }

    @FXML
    private Label englishWord;
    @FXML
    private Label vietnameseWord;
    @FXML
    private void renderEnglishToVietnamese(MouseEvent event) {
        String english = listSearch.getSelectionModel().getSelectedItem();
        int index = listSearch.getSelectionModel().getSelectedIndex();;
        englishWord.setText(english);
        vietnameseWord.setText("tu dich o vi tri co index = " + Integer.toString(index));
    }

    @FXML
    private Button speakEN;
    /*@FXML
    private void speckSpeech() {
        String text = englishWord.getText();
        speech.speak(text);
    }
    */
}