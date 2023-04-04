package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GymBrosController {

    public void fxdashboard(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
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

    public void fxtilbaka(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    public void fxtilbaka4(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxcalendar(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.CALANDER);
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
