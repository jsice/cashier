package ku.cs.duckdealer.cashier;

import javafx.stage.Stage;
import ku.cs.duckdealer.cashier.controllers.MainController;
import javafx.application.Application;

/**
 * Hello world!
 *
 */
public class App  extends  Application
{
    public static void main( String[] args ) {
        launch();
    }

    public void start(Stage primaryStage) throws Exception {
        MainController main = new MainController(primaryStage);
        main.start();
    }
}
