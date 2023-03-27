package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class EnergyWalkController {


    //spila hljoð þegar ytt er a audio icon (virkar ekki)
    @FXML
    private ImageView audioImage1;

    /*
        public void initialize() {
            audioImage1.setOnMouseClicked(event -> {
                String audioFilePath = "path/to/audio/file.mp3";
                Media audioFile = new Media(new File(audioFilePath).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(audioFile);
                mediaPlayer.play();
            });
    */
    public void fxback(ActionEvent event) {
        ViewSwitcher.switchTo(View.RUNNING);
    }
}

