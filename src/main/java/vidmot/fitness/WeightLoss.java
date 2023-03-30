package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class WeightLoss implements Initializable {
    @FXML
    private Label fxUsername;

    @FXML
    private Label fxweightlabel;

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private Label myprogresslabel;

    @FXML
    private CheckBox fxmyprogress1;

    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

    Data data = Data.getInstance();

    @FXML
    void myprogress1(ActionEvent event) {
        if (progress.doubleValue() < 1) {
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
            myProgressBar.setProgress(progress.doubleValue());
            myprogresslabel.setText(Double.toString((int) Math.round((progress.doubleValue() * 100))) + "%");
        }
    }

    public void initialize(URL location, ResourceBundle resource) {
        fxweightlabel.setText(data.getWeightbutton());
        myProgressBar.setStyle("-fx-accent: #00FF00;");
        fxUsername.setText(data.getUsername());
    }

    public void fxback(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    @FXML
    void fxdashboard(ActionEvent event) {
        ViewSwitcher.switchTo(View.MAIN);
    }


}
