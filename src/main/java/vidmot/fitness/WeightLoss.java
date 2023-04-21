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
    @FXML
    private CheckBox myprogress2;

    @FXML
    private CheckBox myprogress3;

    @FXML
    private CheckBox myprogress4;

    @FXML
    private CheckBox myprogress5;

    @FXML
    private CheckBox myprogress6;

    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

    Data data = Data.getInstance();

    @FXML
    void myprogress1(ActionEvent event) {
        double addedProgress = 0.16666666666;
        if (fxmyprogress1.isSelected()) {
            progress = progress.add(new BigDecimal(String.format("%.2f", addedProgress)));
        } else {
            progress = progress.subtract(new BigDecimal(String.format("%.2f", addedProgress)));
        }
        if (fxmyprogress1.isSelected() && myprogress2.isSelected() && myprogress3.isSelected() && myprogress4.isSelected() && myprogress5.isSelected() && myprogress6.isSelected()) {
            progress = new BigDecimal("1.0");
        }
        myProgressBar.setProgress(progress.doubleValue());
        myprogresslabel.setText(String.format("%.2f%%", progress.doubleValue() * 100));
    }


    @FXML
    void myprogress2(ActionEvent event) {
        double addedProgress = 0.16666666666;
        if (myprogress2.isSelected()) {
            progress = progress.add(new BigDecimal(String.format("%.2f", addedProgress)));
        } else {
            progress = progress.subtract(new BigDecimal(String.format("%.2f", addedProgress)));
        }
        if (fxmyprogress1.isSelected() && myprogress2.isSelected() && myprogress3.isSelected() && myprogress4.isSelected() && myprogress5.isSelected() && myprogress6.isSelected()) {
            progress = new BigDecimal("1.0");
        }
        myProgressBar.setProgress(progress.doubleValue());
        myprogresslabel.setText(String.format("%.2f%%", progress.doubleValue() * 100));
    }


    @FXML
    void myprogress3(ActionEvent event) {
        double addedProgress = 0.16666666666;
        if (myprogress3.isSelected()) {
            progress = progress.add(new BigDecimal(String.format("%.2f", addedProgress)));
        } else {
            progress = progress.subtract(new BigDecimal(String.format("%.2f", addedProgress)));
        }
        if (fxmyprogress1.isSelected() && myprogress2.isSelected() && myprogress3.isSelected() && myprogress4.isSelected() && myprogress5.isSelected() && myprogress6.isSelected()) {
            progress = new BigDecimal("1.0");
        }
        myProgressBar.setProgress(progress.doubleValue());
        myprogresslabel.setText(String.format("%.2f%%", progress.doubleValue() * 100));
    }

    @FXML
    void myprogress4(ActionEvent event) {
        double addedProgress = 0.16666666666;
        if (myprogress4.isSelected()) {
            progress = progress.add(new BigDecimal(String.format("%.2f", addedProgress)));
        } else {
            progress = progress.subtract(new BigDecimal(String.format("%.2f", addedProgress)));
        }
        if (fxmyprogress1.isSelected() && myprogress2.isSelected() && myprogress3.isSelected() && myprogress4.isSelected() && myprogress5.isSelected() && myprogress6.isSelected()) {
            progress = new BigDecimal("1.0");
        }
        myProgressBar.setProgress(progress.doubleValue());
        myprogresslabel.setText(String.format("%.2f%%", progress.doubleValue() * 100));
    }

    @FXML
    void myprogress5(ActionEvent event) {
        double addedProgress = 0.16666666666;
        if (myprogress5.isSelected()) {
            progress = progress.add(new BigDecimal(String.format("%.2f", addedProgress)));
        } else {
            progress = progress.subtract(new BigDecimal(String.format("%.2f", addedProgress)));
        }
        if (fxmyprogress1.isSelected() && myprogress2.isSelected() && myprogress3.isSelected() && myprogress4.isSelected() && myprogress5.isSelected() && myprogress6.isSelected()) {
            progress = new BigDecimal("1.0");
        }
        myProgressBar.setProgress(progress.doubleValue());
        myprogresslabel.setText(String.format("%.2f%%", progress.doubleValue() * 100));
    }

    @FXML
    void myprogress6(ActionEvent event) {
        double addedProgress = 0.16666666666;
        if (myprogress6.isSelected()) {
            progress = progress.add(new BigDecimal(String.format("%.2f", addedProgress)));
        } else {
            progress = progress.subtract(new BigDecimal(String.format("%.2f", addedProgress)));
        }
        if (fxmyprogress1.isSelected() && myprogress2.isSelected() && myprogress3.isSelected() && myprogress4.isSelected() && myprogress5.isSelected() && myprogress6.isSelected()) {
            progress = new BigDecimal("1.0");
        }
        myProgressBar.setProgress(progress.doubleValue());
        myprogresslabel.setText(String.format("%.2f%%", progress.doubleValue() * 100));
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

    @FXML
    void fxrecipes(ActionEvent event) {
        ViewSwitcher.switchTo(View.RECIPES);
    }

    public void fxbros(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.BROS);
    }

    public void fxtilbaka4(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxcalendar(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.CALANDER);
    }

    @FXML
    private void openWebsite() {
        String url = "https://www.bonappetit.com/recipes/family-meals/slideshow/big-batch-recipes";
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openWebsite2() {
        String url = "https://reciperunner.com";
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openWebsite3() {
        String url = "https://www.bbcgoodfood.com/recipes/collection/healthy-recipes-for-weight-loss";
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void fxcardio(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.SPINNING);
    }

    public void fxupperbody(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MUSCLES);
    }

    public void fxlowerbodt(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MUSCLES);
    }

    public void fxenergywalk(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.ENERGY);
    }

    public void fxyoga(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.YOGA);
    }

    public void fxlocation(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LACT);
    }
}
