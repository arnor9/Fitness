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
    private Label fxSnidinnDagur;        // Sniðinn dagur - uppfærður með handler
    @FXML
    private Label fxDagurSjalfvirkt;     // Sniðinn dagur - uppfærður með binding
    @FXML
    private DatePicker fxDagatal;   // dagatal - hægt að velja dagsetningu

    private final static int ISLAND = 108;

    // static formatter fyrir dagsetningu
    private static final DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ENGLISH);


    public void initialize() {
        fxDagatal.setValue(LocalDate.now());    // setjum núverandi dagsetningu í upphafi
        fxSnidinnDagur.setText(fxDagatal.getValue().format(f)); // setjum textann sem sniðna dagsetningu

        // setjum upp reglurnar
        StringBinding dagatalBinding = new StringBinding() {
            {                                           // smiður
                super.bind(fxDagatal.valueProperty());  // Nýtt StringBinding sem er háð fxDagatal.valueProperty()
            }

            protected String computeValue() {           // Þetta á að reikna þegar fxDagatal.valueProperty() breytist
                return fxDagatal.valueProperty().get().format(f);
            }
        };
        fxDagurSjalfvirkt.textProperty().bind(dagatalBinding);  // fxDagurSjalfvirkt uppfært sjálfvirkt með binding - sami formatter
    }


    /**
     * Handler fyrir að velja dagsetningu í datepicker. Gerir ekkert nema prentar út dagsetninguna
     *
     * @param actionEvent ónotað
     */
    public void veljaDagsetningu(ActionEvent actionEvent) {
        // Get the selected date from the DatePicker
        LocalDate selectedDate = fxDagatal.getValue();

        // Format the selected date as a string
        String formattedDate = selectedDate.format(f);

        // Generate a random workout
        String[] workouts = {"Biceps", "Back", "Chest", "Legs"};
        Random random = new Random();
        String randomWorkout = workouts[random.nextInt(workouts.length)];

        // Set the text of the fxworkout label to the formatted date and the random workout
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

}
