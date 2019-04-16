package App;

import Controller.LoginController;
import Controller.ProdsListController;
import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.mail.MessagingException;
import services.ProduitService;

public class Main extends Application {

    public static void main(String[] args) throws SQLException, MessagingException, Exception {
        launch(args);
//        ProduitService ps = new ProduitService();
//        System.out.println(ps.getProduitById(10).getImageName());

    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        LoginController loginController = new LoginController();
//
//        // Show the new stage
        loginController.showStage();

    }

}
