package ShakasVideoPlayer;

import javafx.scene.paint.Color;

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

        mp = createMediaPlayer(
          "file:///C:/Users/vegard/Downloads/IMG_4294.mp4", 
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