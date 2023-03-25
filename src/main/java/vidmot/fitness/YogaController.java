package vidmot.fitness;

import javafx.event.ActionEvent;

public class YogaController {
    public void goBack(ActionEvent event) {
        ViewSwitcher.switchTo(View.RUNNING);
    }
}
