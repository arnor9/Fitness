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

import java.io.IOException;
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
        ViewSwitcher.switchTo(View.MUSCLES);
    }

    public void fxweightloss(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.WEIGHTLOSS);
    }

    public void fxrunning(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.RUNNING);
    }

    public void fxback(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LOGIN);
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
        try {
            iniLineChart();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        iniPieChart();
        fxUsername.setText(data.getUsername());
        G1.setText(data.getHeight());
        G2.setText(data.getWeight());
    }

    private void iniLineChart() throws IOException {
        XYChart.Series series = new XYChart.Series();
        //NumberAxis xAxis = new NumberAxis();
        //NumberAxis yAxis = new NumberAxis();

        //LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        //lineChart.setTitle("BMI");

        //BufferedReader reader = new BufferedReader(new FileReader("BMI_muscle.txt"));
        //String line;
        //while ((line = reader.readLine()) != null) {
        //  String[] parts = line.split(",");
        //double x = Double.parseDouble(parts[0]);
        //Double y = Double.parseDouble(parts[1]);
        //XYChart.Series<Number, Number> series = new XYChart.Series<>();
        //series.getData().add(new XYChart.Data<>(x, y));
        //lineChart.getData().add(series);
        //}
        //reader.close();
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
}
