package vidmot.fitness;


import javafx.beans.binding.StringBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class CalendarController {
    @FXML
    public Label fxworkout;
    @FXML
    private Label fxSnidinnDagur;
    @FXML
    private Label fxDagurSjalfvirkt;
    @FXML
    private DatePicker fxDagatal;

    private final static int ISLAND = 108;


    private static final DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ENGLISH);


    public void initialize() {
        fxDagatal.setValue(LocalDate.now());
        fxSnidinnDagur.setText(fxDagatal.getValue().format(f));

        // setjum upp reglurnar
        StringBinding dagatalBinding = new StringBinding() {
            {
                super.bind(fxDagatal.valueProperty());
            }

            protected String computeValue() {
                return fxDagatal.valueProperty().get().format(f);
            }
        };
        fxDagurSjalfvirkt.textProperty().bind(dagatalBinding);
    }


    public void veljaDagsetningu(ActionEvent actionEvent) {
        LocalDate selectedDate = fxDagatal.getValue();

        String formattedDate = selectedDate.format(f);

        String[] workouts = {"Biceps", "Back", "Chest", "Legs"};
        Random random = new Random();
        String randomWorkout = workouts[random.nextInt(workouts.length)];

        fxworkout.setText(randomWorkout);
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
    void fxdashboard(ActionEvent event) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxtilbaka4(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxtilbaka(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    public void fxbros(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.BROS);
    }

    public void fxrecipes(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.RECIPES);
    }

    public void fxlocation(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LACT);
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
