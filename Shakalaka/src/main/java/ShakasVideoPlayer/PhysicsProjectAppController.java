package ShakasVideoPlayer;

public class PhysicsProjectAppController {
    import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author clair
 */
 

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button bathroom;
    
    @FXML
    private Button bedroom;
    
    @FXML
    private Button kitchen;
    
    @FXML
    private Button tv;
    
    @FXML
    private Button diningroom;
    
    @FXML
    private Button lounge;
    
    private String start;
    
    private String end;
    
    @FXML
    private TextArea box;
    
    @FXML
    private AnchorPane fxml;
    
    @FXML
    private MenuBar menu;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        box.setEditable(false);
        start = "";
        end = "";
        fxml.setStyle("-fx-background-color: #b3e6ff");
        box.setStyle("-fx-background-color: #b3e6ff");
        menu.setStyle("-fx-background-color: #d0d0e1");
               
        bathroom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(start == "") {
                 start = "bathroom";
                 playVideo("We start in the bathroom");
               } else if(end == "" && start != "bathroom") {
                  end = "bathroom";
                  playVideo("We end in the bathroom, here's some instructions and a video");
               } else {
                   playVideo("bathroom is already chosen");
               }
               bathroom.setDisable(true);
            }
        
        });
        
         bedroom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(start == "") {
                 start = "bedroom";
                 playVideo("We start in the guest bedroom");
               } else if(end == "" && start != "bedroom") {
                  end = "bedroom";
                  playVideo("We end in the guest bedroom, here's some instructions and a video");
               } else {
                   playVideo("bedroom is already chosen");
               }
               bedroom.setDisable(true);
            }
        
        });
       
          kitchen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(start == "") {
                 start = "kitchen";
                 playVideo("We start in the kitchen");
               } else if(end == "" && start != "kitchen") {
                  end = "kitchen";
                  playVideo("We end in the kitchen, here's some instructions and a video");
               } else {
                   playVideo("kitchen is already chosen");
               }
               kitchen.setDisable(true);
            }
        
        });
       
           tv.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(start == "") {
                 start = "tv";
                 playVideo("We start in the TV Room");
               } else if(end == "" && start != "tv") {
                  end = "tv";
                  playVideo("We end in the TV Room, here's some instructions and a video");
               } else {
                   playVideo("tv is already chosen");
               }
               tv.setDisable(true);
            }
        
        });
        
           diningroom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(start == "") {
                 start = "diningroom";
                 playVideo("We start in the diningroom");
               } else if(end == "" && start != "diningroom") {
                  end = "diningroom";
                  playVideo("We end in the diningroom, here's some instructions and a video");
               } else {
                   playVideo("diningroom is already chosen");
               }
               diningroom.setDisable(true);
            }
        
        });
           
           lounge.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(start == "") {
                 start = "lounge";
                 playVideo("We start in the lounge");
               } else if(end == "" && start != "lounge") {
                  end = "lounge";
                  playVideo("We end in the lounge, here's some instructions and a video");
               } else {
                   playVideo("lounge is already chosen");
               }
               lounge.setDisable(true);
            }
        
        });
    }
    
    public void playVideo(String message) {
        System.out.println(message);
        if(start != "" && end != "") {
            // display video
            bedroom.setVisible(false);
            kitchen.setVisible(false);
            tv.setVisible(false);
            lounge.setVisible(false);
            diningroom.setVisible(false);
            bathroom.setVisible(false);
        } else {
            System.out.println("Now set your end location");
        }
        
    }
    
    
}
