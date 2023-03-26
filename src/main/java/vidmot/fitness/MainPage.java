package vidmot.fitness;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPage implements Initializable {

    @FXML
    private LineChart<?, ?> fxLineChart;

    @FXML
    private PieChart fxPieChart;

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

    public void initialize(URL location, ResourceBundle resource) {
        iniLineChart();
        iniPieChart();
    }

    private void iniLineChart() {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("Monday", 0));
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


}
