package vidmot.fitness;

import javafx.event.ActionEvent;

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
}
