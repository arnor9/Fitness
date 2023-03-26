package vidmot.fitness;

import javafx.event.ActionEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class EnergyWalkController {


    //spila hljoð þegar ytt er a audio icon (virkar ekki)
    public void playAudio() {
        File audioFile = new File("/Users/thorsanchez/Desktop/mix.mp3");
        Media audio = new Media(audioFile.toURI().toString());
        MediaPlayer audioPlayer = new MediaPlayer(audio);
        audioPlayer.setAutoPlay(true);
    }


    public void fxback(ActionEvent event) {
        ViewSwitcher.switchTo(View.RUNNING);
    }
}

