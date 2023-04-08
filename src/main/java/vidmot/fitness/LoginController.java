package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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

    public void fxcontact(ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().mail(new URI("mailto:feedback@fitgo.com?subject=Feedback%20on%20my%20app"));
        } catch (IOException | URISyntaxException e) {
        }
    }

    // #35530a

}
