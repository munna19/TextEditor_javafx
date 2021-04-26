package TextEditorP;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextArea textArea_id;

    @FXML
    void OpenAction(ActionEvent event) {

    }

    @FXML
    void SaveActon(ActionEvent event) {

    }

    @FXML
    void SaveAsAction(ActionEvent event) {

    }

    @FXML
    void ExitAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void UndoAction(ActionEvent event) {

    }

    @FXML
    void CutAction(ActionEvent event) {

    }

    @FXML
    void CopyAction(ActionEvent event) {
        //String text = textArea_id.getText().toString();//get all text
        String text = textArea_id.getSelectedText().toString(); // get only selected text
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();

        content.putString(text);
        clipboard.setContent(content);
    }

    @FXML
    void PastAction(ActionEvent event) {

    }

    @FXML
    void DeleteAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
