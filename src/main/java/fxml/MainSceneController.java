package fxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainSceneController {

	private final String path = "C:\\Program Files\\a.exe";

	private final HashMap<String, String> userNamePassword = new HashMap<>() {
		{
			put("X", "123");
		}
	};

	public void initialize() {
	}

	@FXML
	private TextField usernameField;

	@FXML
	private PasswordField passwordField;

	@FXML
	private Label errorLabel;

	@FXML
	void login(ActionEvent event) throws FileNotFoundException {

		File file = new File(path);

		if (!file.exists()) {
			throw new FileNotFoundException();
		}

		if (!userNamePassword.get(usernameField.getText()).equals(passwordField.getText())) {
			throw new SecurityException("Username / Password is incorrect");
		}

		Runtime runTime = Runtime.getRuntime();

		try {
			runTime.exec(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			runTime.exit(0);

		}

	}

}