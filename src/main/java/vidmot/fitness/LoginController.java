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

    Data data = Data.getInstance();

    @FXML
    void fxlogin(ActionEvent event) {
        data.setUsername(fxName.getText());
        data.setWeight(fxWeight.getText());
        data.setHeight(fxHeight.getText());
        ViewSwitcher.switchTo(View.MAIN);
    }

    // #35530a

}
