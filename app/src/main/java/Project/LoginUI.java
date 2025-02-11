package Project;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginUI {
    public LoginUI(Stage primaryStage) {
        VBox root = new VBox(10);
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");
        Label messageLabel = new Label();

        usernameField.setId("usernameField");
        passwordField.setId("passwordField");
        loginButton.setId("loginButton");
        messageLabel.setId("messageLabel");
        registerButton.setId("registerButton");


        registerButton.setOnAction(e -> new RegisterUI(primaryStage));
        loginButton.setOnAction(e -> new MenuUI(primaryStage));
        root.getChildren().addAll(new Label("Username:"), usernameField, new Label("Password:"), passwordField,
                loginButton, registerButton, messageLabel);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}
