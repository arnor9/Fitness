package vidmot.fitness;


import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class EnergyWalkController {


    //spila hljoð þegar ytt er a audio icon (virkar ekki)
    @FXML
    private ImageView audioImage1;


    public void initialize() {
        audioImage1.setOnMouseClicked(event -> {
            String audioFilePath = "Vika9_Media_src_main_resources_is_media_sample-15s.wav";
            Media audioFile = new Media(new File(audioFilePath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(audioFile);
            mediaPlayer.play();
        });

        /*

        public void fxback (ActionEvent event){
            ViewSwitcher.switchTo(View.RUNNING);
        }

         */
    }
}

