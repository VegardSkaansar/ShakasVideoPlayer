package ShakasVideoPlayer;

import javafx.scene.paint.Color;

import javax.swing.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{
  private MediaPlayer mp;

    @Override
    public void start(Stage stage) {
        final Label status = new Label("");
        int number = 1;
        if(number == 1) {
          gardenToKitchen();
        }
        mp = createMediaPlayer(
          "file:///C:/Users/Duncan/Downloads/iCloud%20Photos%20from%20Duncan%20Agar/iCloud%20Photos%20from%20Duncan%20Agar/IMG_4274.MP4", 
          status
        );

          mp = createMediaPlayer(
            "file:///C:/Users/Duncan/Downloads/iCloud%20Photos%20from%20Duncan%20Agar/iCloud%20Photos%20from%20Duncan%20Agar/IMG_4274.MP4", 
            status
          );
        
          mp = createMediaPlayer(
          "file:///C:/Users/Duncan/Downloads/iCloud%20Photos%20from%20Duncan%20Agar/iCloud%20Photos%20from%20Duncan%20Agar/IMG_4274.MP4", 
          status
        );
        
        VBox layout = new VBox(10);
        Pane shakasass = new Pane();
        shakasass.getChildren().add(new MediaView(mp));
        shakasass.setRotate(90);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(shakasass, status);
        stage.setScene(new Scene(layout, 500, 300, Color.CORNSILK));
        stage.show();
        if (mp != null) {
          mp.setAutoPlay(true);
        }

    }
    public static void main(String[] args) {
        launch();
        
    }

    /**
     * lol
     */
    private void gardenToKitchen() {
      final Label status = new Label("");
      mp = createMediaPlayer(
        "file:///C:/Users/Duncan/Downloads/iCloud%20Photos%20from%20Duncan%20Agar/iCloud%20Photos%20from%20Duncan%20Agar/IMG_4274.MP4", 
        status
      );
    }

    private MediaPlayer createMediaPlayer(final String url, final Label status) {
        Media hit = new Media(url);
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.setOnError(new Runnable() {
          @Override public void run() {
            status.setText("Error");
          }
        });
        mediaPlayer.setOnPlaying(new Runnable() {
          @Override public void run() {
          }
        });
        mediaPlayer.setOnEndOfMedia(new Runnable() {
          @Override public void run() {
            status.setText("Done");
          }
        });

        return mediaPlayer;
      }
}
