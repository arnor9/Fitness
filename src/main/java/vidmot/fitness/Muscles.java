package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Muscles {

    @FXML
    private Button sittedCurls;
    @FXML
    private Button dragCurls;
    @FXML
    private Button preacherCurls;
    @FXML
    private Button chinUps;
    @FXML
    private Button rows;
    @FXML
    private Button bench;
    @FXML
    private Button inclineBench;
    @FXML
    private Button cableCross;
    @FXML
    private Button squat;
    @FXML
    private Button legExtension;
    @FXML
    private Button legPress;
    @FXML
    private Label fxUsername;
    @FXML
    private Label fxmusclelabel;

    Data data = Data.getInstance();


    @FXML
    public void initialize() {
        sittedCurls.setOnAction(event -> showPopup("Seated bicep curls allow for greater isolation of the biceps by fixing the lower half of the body and excluding the core. This allows us to focus on the actions of the bicep which are elbow flexion (bend) and supination (external rotation) of the forearm."));
        dragCurls.setOnAction(event -> showPopup("Drag curls are a classic exercise that targets the biceps and the forearms. This exercise allows for a greater range of motion and a more challenging workout than seated bicep curls."));
        preacherCurls.setOnAction(event -> showPopup("Preacher curls are a great exercise for isolating the biceps and building mass. The preacher bench helps to stabilize the upper arm, allowing the biceps to do all the work."));
        chinUps.setOnAction(event -> showPopup("Chinups are an excellent exercise for developing the muscles of the back, shoulders, and arms. This exercise requires no equipment and can be done anywhere there is a sturdy horizontal bar."));
        rows.setOnAction(event -> showPopup("Rows are a great exercise for developing the muscles of the back, shoulders, and arms. This exercise can be done with dumbbells, barbells, or a cable machine."));
        bench.setOnAction(event -> showPopup("The bench press is a classic exercise that targets the chest, shoulders, and triceps. This exercise can be done with a barbell, dumbbells, or a machine."));
        inclineBench.setOnAction(event -> showPopup("Incline bench press is a variation of the bench press that targets the upper chest. This exercise can be done with a barbell, dumbbells, or a machine."));
        cableCross.setOnAction(event -> showPopup("Cable crossovers are a great exercise for targeting the chest muscles. This exercise can be done with a cable machine and allows for a greater range of motion than the bench press."));
        squat.setOnAction(event -> showPopup("The squat is a compound exercise that targets the lower body, primarily the quads, hamstrings, and glutes. It also engages the core and lower back muscles for stability and support."));
        legExtension.setOnAction(event -> showPopup("Leg extensions are an isolation exercise that targets the quadriceps. This exercise can be done with a machine and allows for a greater focus on the quads."));
        legPress.setOnAction(event -> showPopup("The leg press is a compound exercise that targets the lower body, primarily the quads, hamstrings, and glutes. This exercise can be done with a machine and allows for a greater focus on the legs while providing support for the back."));
        fxUsername.setText(data.getUsername());
        fxmusclelabel.setText(data.getMusclebutton());
    }

    private void showPopup(String text) {
        // nytt stage fyrir popup glugga
        Stage popup = new Stage();

        // teksti um æfinguna
        Label label = new Label(text);

        // anchor pane fyrir popup glugga
        AnchorPane popupPane = new AnchorPane();
        popupPane.getChildren().add(label);

        // label stærð og staðsetning
        label.setLayoutX(20);
        label.setLayoutY(20);
        label.setPrefWidth(200);
        label.setWrapText(true);

        // birta popup glugga
        popup.setScene(new Scene(popupPane, 240, 240));
        popup.show();
    }


    public void fxback2(ActionEvent event) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxlocation(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LACT);
    }

    @FXML
    private void openWebsite1() {
        String url = "https://www.bonappetit.com/recipes/family-meals/slideshow/big-batch-recipes";
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
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

    //calendar takki
    public void fxcalendar(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.CALANDER);
    }

    @FXML
    void fxbros(ActionEvent event) {
        ViewSwitcher.switchTo(View.BROS);
    }

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

    public void fxdashboard(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }
}

