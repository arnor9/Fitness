package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField fxHeight;

    @FXML
    private TextField fxName;

    @FXML
    private TextField fxWeight;

    @FXML
    void fxlogin(ActionEvent event) {
        ViewSwitcher.switchTo(View.MAIN);
    }
    
    //public void fxlogin(ActionEvent event) {
    //  ViewSwitcher.switchTo(View.MAIN);
    // }
}
