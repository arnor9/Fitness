package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;

public class WeightLoss {
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

    public void initialize() {
        fxweightlabel.setText("Weight loss club");
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

    //online store takki
    @FXML
    private void OnlineStore(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://mettasport.is"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    //Feedback takki
    @FXML
    private void Feedback(ActionEvent event) {
        try {
            Desktop.getDesktop().mail(new URI("mailto:feedback@fitgo.com?subject=Feedback%20on%20my%20app"));
        } catch (IOException | URISyntaxException e) {
        }
    }


    public void fxbros(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.BROS);
    }
}
