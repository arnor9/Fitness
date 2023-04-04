package vidmot.fitness;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LocationViewController {
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

    public void fxrunning(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.RUNNING);
    }

    public void fxcalendar(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.CALANDER);
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

    public void fxdashboard(javafx.event.ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void fxcalendar(javafx.event.ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.CALANDER);
    }

    public void OnlineStore(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://mettasport.is"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void Feedback(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().mail(new URI("mailto:feedback@fitgo.com?subject=Feedback%20on%20my%20app"));
        } catch (IOException | URISyntaxException e) {
        }
    }

    public void fxtilbaka(javafx.event.ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    public void fxtilbaka4(javafx.event.ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void WCBH(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/breidholt/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCEG(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/egilsholl/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCDAL(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/dalshraun/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCHR(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/hr/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCK(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/kringlan/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCL(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/laugar/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCMOS(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/mosfellsbaer/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCSEL(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/seltjarnarnes/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCSMA(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/smaralind/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCOG(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/ogurhvarf/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCTJV(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/tjarnarvellir/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCVM(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/vatnsmyri/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void WCArb(javafx.event.ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.worldclass.is/stodvar/arbaer/"));
        } catch (IOException | URISyntaxException e) {

        }
    }

    public void fxbros(javafx.event.ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.BROS);
    }

    public void fxrecipes(javafx.event.ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.RECIPES);
    }
}
