package vidmot.fitness;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class FitnessApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var scene = new Scene(new Pane());
        ViewSwitcher.setScene(scene);
        ViewSwitcher.switchTo(View.LOGIN);
        stage.setTitle("Fitness!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

// #D2B48C
