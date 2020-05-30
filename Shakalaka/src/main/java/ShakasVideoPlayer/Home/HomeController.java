package ShakasVideoPlayer.Home;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController implements Initializable{
    @FXML
    private Button btnstart;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        btnstart.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event) {
                try {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("guide.fxml")); 
                
                Stage stage = (Stage) btnstart.getScene().getWindow();
                Scene scene = new Scene(root, 500, 500);
                stage.setScene(scene);
                stage.show();
                
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }); 
    }
}