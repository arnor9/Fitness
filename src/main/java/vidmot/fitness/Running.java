package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Running implements Initializable {

    @FXML
    private ImageView myImage1;
    @FXML
    private Label fxUsername;
    @FXML
    private ImageView myImage2;
    @FXML
    private ImageView myImage3;
    @FXML
    private ImageView myImage4;
    @FXML
    private ImageView myImage5;
    @FXML
    private ImageView myImage6;

    Data data = Data.getInstance();

    //yoga mynd (efsta myndin)
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //yoga mynd (efsta myndin)
        myImage1.setOnMouseClicked(e -> {
            ViewSwitcher.switchTo(View.YOGA);
        });

        //RUNNING mynd
        myImage3.setOnMouseClicked(e -> {
            ViewSwitcher.switchTo(View.ENERGY);
        });

        //Stretching mynd
        myImage2.setOnMouseClicked(e -> {
            ViewSwitcher.switchTo(View.STRETCH);
        });

        //warmup mynd
        myImage4.setOnMouseClicked(e -> {
            ViewSwitcher.switchTo(View.WARMUP);
        });

        //run mynd
        myImage5.setOnMouseClicked(e -> {
            ViewSwitcher.switchTo(View.RUN);
        });

        myImage6.setOnMouseClicked(e -> {
            ViewSwitcher.switchTo(View.SPINNING);
        });
        fxUsername.setText(data.getUsername());
    }


    @FXML
    void fxdashboard(ActionEvent event) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxtilbaka(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxback3(ActionEvent event) {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    public void fxback(ActionEvent event) {
        ViewSwitcher.switchTo(View.RUNNING);
    }

    public void fxbros(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.BROS);
    }

    public void fxcalendar(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.CALANDER);
    }

    public void OnlineStore(ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://mettasport.is"));
        } catch (IOException | URISyntaxException e) {

        }
    }


    public void Feedback(ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().mail(new URI("mailto:feedback@fitgo.com?subject=Feedback%20on%20my%20app"));
        } catch (IOException | URISyntaxException e) {
        }
    }

    public void fxlocation(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LACT);
    }

    //recipes

    public void fxrecipes(javafx.event.ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.RECIPES);
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

}
