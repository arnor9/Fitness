package vidmot.fitness;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPage implements Initializable {

    @FXML
    private LineChart<?, ?> fxLineChart;

    @FXML
    private PieChart fxPieChart;

    @FXML
    private TextField G1;

    @FXML
    private TextField G2;

    @FXML
    private Label S1;

    @FXML
    private Label S2;

    @FXML
    private TextField fxcalories;

    @FXML
    private TextField fxsteps;

    @FXML
    private TextField fxwater;

    @FXML
    private Label fxwaterpercent;

    @FXML
    private Label fxcaloriespercent;

    @FXML
    private Label fxstepspercent;

    @FXML
    public Label fxUsername;


    Data data = Data.getInstance();

    public void fxmuscles(ActionEvent actionEvent) {
        data.setMusclebutton("Muscle Club");
        data.setUsername(fxUsername.getText());
        ViewSwitcher.switchTo(View.MUSCLES);
    }

    public void fxweightloss(ActionEvent actionEvent) {
        data.setWeightbutton("Weightloss");
        data.setUsername(fxUsername.getText());
        ViewSwitcher.switchTo(View.WEIGHTLOSS);
    }

    public void fxrunning(ActionEvent actionEvent) {
        data.setUsername(fxUsername.getText());
        ViewSwitcher.switchTo(View.RUNNING);
    }

    public void fxback(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    //calendar takki
    public void fxcalendar(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.CALANDER);
    }

    @FXML
    void fxrecipes(ActionEvent event) {
        ViewSwitcher.switchTo(View.RECIPES);
    }

    @FXML
    void fxbros(ActionEvent event) {
        ViewSwitcher.switchTo(View.BROS);
    }

    public String breytavatn() {
        double waters = (Double.parseDouble(fxwater.getText()) / 2) * 100;
        int water = (int) waters;
        String tostring = "";
        tostring += water;
        return tostring + "%";
    }

    public String breytacalories() {
        double calories = (Double.parseDouble(fxcalories.getText()) / 3000) * 100;
        int calorie = (int) calories;
        String tostring = "";
        tostring += calorie;
        return tostring + "%";
    }

    public String breytaSteps() {
        double steps = (Double.parseDouble(fxsteps.getText()) / 10000) * 100;
        int step = (int) steps;
        String tostring = "";
        tostring += step;
        return tostring + "%";
    }


    //@FXML
    public void fxsubmit(ActionEvent event) {
        fxwaterpercent.setText(breytavatn());
        fxstepspercent.setText(breytaSteps());
        fxcaloriespercent.setText(breytacalories());
    }


    public void initialize(URL location, ResourceBundle resource) {
        iniLineChart();
        iniPieChart();
        fxUsername.setText(data.getUsername());
        G1.setText(data.getHeight());
        G2.setText(data.getWeight());
    }

    private void iniLineChart() {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("Monday", 2));
        series.getData().add(new XYChart.Data("Tuesday", 9));
        series.getData().add(new XYChart.Data("Wednesday", 5));
        series.getData().add(new XYChart.Data("Thursday", 12));
        series.getData().add(new XYChart.Data("Friday", 2));
        series.getData().add(new XYChart.Data("Saturday", 15));
        series.getData().add(new XYChart.Data("Sunday", 2));
        fxLineChart.getData().addAll(series);
        fxLineChart.lookup(".chart-plot-background").setStyle("-fx-background-color: transparent;");
        series.getNode().setStyle("-fx-stroke: #FFD6DC");
    }

    private void iniPieChart() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Protein", 15),
                new PieChart.Data("Whole Grains", 30),
                new PieChart.Data("Vegtables", 25),
                new PieChart.Data("Fruits", 20),
                new PieChart.Data("Fat", 10)
        );
        fxPieChart.setData(pieChartData);
    }


    public void Calculate_BMI() {
        if (G2.getText().trim().isEmpty() || G1.getText().trim().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setContentText("Please Enter Correct Height and Weight");
            a.setAlertType(AlertType.ERROR);
            a.show();
        } else {
            float a = Float.parseFloat(G1.getText());
            float b = Float.parseFloat(G2.getText());
            float bmi = b / (a * a);
            S1.setText("" + bmi);
            if (bmi <= 18.5) {
                S2.setText("UnderWeight");
            } else if (bmi <= 24.9) {
                S2.setText("Normal Weight");
            } else if (bmi <= 29.9) {
                S2.setText("OverWeight");
            } else {
                S2.setText("Obese");
            }
        }
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

    //HVAÐ ER BMI ?

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String url = "https://jerseystrong.com/blog/fitness-for-dummies-what-is-bmi-and-other-frequently-asked-questions/#:~:text=Answer%3A%20BMI%20stands%20for%20Body,they%20set%20goals%20with%20you.";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
