package ShakasVideoPlayer.Guide;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GuideController implements Initializable {

    @FXML
    private Button btnBathroom;

    @FXML
    private Button btnBedroom;

    @FXML
    private Button btnKitchen;

    @FXML
    private Button btnTv;

    @FXML
    private Button btnLounge;

    @FXML
    private Button endBathroom;

    @FXML
    private Button endBedroom;

    @FXML
    private Button endKitchen;

    @FXML
    private Button endTv;

    @FXML
    private Button endLounge;

    @FXML
    private ImageView startImage;

    @FXML
    private ImageView endImage;

    private String start = "";

    private String end = "";


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnBathroom.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/bathroom.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    startImage.setImage(bath);
                    start = "BathRoom";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        endBathroom.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/bathroom.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    endImage.setImage(bath);
                    end = "BathRoom";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        btnBedroom.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/bedroom.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    startImage.setImage(bath);
                    start = "BedRoom";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        endBedroom.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/bedroom.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    endImage.setImage(bath);
                    end = "BedRoom";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        btnKitchen.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/kitchen.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    startImage.setImage(bath);
                    start = "Kitchen";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        endKitchen.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/kitchen.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    endImage.setImage(bath);
                    end = "Kitchen";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        btnLounge.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/lounge.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    startImage.setImage(bath);
                    start = "Lounge";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        endLounge.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/lounge.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    endImage.setImage(bath);
                    end = "Lounge";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        btnTv.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/tv.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    startImage.setImage(bath);
                    start = "TvRoom";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        endTv.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    File file = new File(getClass().getClassLoader().getResource("./picture/tv.jpg").toURI());
                    Image bath = new Image(file.toURI().toString());
                    endImage.setImage(bath);
                    end = "TvRoom";
                    configImages(bath);
                } catch (URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

    }

    public void configImages(Image image) {

        if(start != "" && end != "" && start != end) {
            Stage primaryStage = (Stage) btnBathroom.getScene().getWindow();
            Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.initOwner(primaryStage);
            VBox dialogVBox = new VBox(1);
            MediaPlayer mp = createMediaPlayer(start, end);
            Pane pane = new Pane();
            pane.getChildren().add(new MediaView(mp));
            pane.setRotate(90);
            dialogVBox.getChildren().add(pane);
            Scene dialogScene = new Scene(dialogVBox, 400, 400);
            dialog.setScene(dialogScene);
            dialog.show();
            mp.play();
        }
    }

    private MediaPlayer createMediaPlayer(final String start, final String end) {
        Media hit = null;
        try {
            hit = new Media(getClass().getClassLoader().getResource("./videos/"+makeString(start, end)).toURI().toString());
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        return mediaPlayer;
    }

    private String makeString(String start, String end) {
        String video = start + "To" + end + ".mp4";
        return video;
    }

}
