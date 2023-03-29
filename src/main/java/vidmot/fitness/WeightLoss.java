package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WeightLoss {
    @FXML
    private Label fxUsername;
    
    public void fxback(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }
}
