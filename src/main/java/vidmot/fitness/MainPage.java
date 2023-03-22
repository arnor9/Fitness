package vidmot.fitness;

import javafx.event.ActionEvent;

public class MainPage {
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

}
