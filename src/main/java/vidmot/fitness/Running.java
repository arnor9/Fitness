package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Running implements Initializable {

    @FXML
    private ImageView myImage1;

    //yoga mynd (efsta myndin)
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myImage1.setOnMouseClicked(e -> {
            ViewSwitcher.switchTo(View.YOGA);
        });
    }

    public void fxback(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

}
