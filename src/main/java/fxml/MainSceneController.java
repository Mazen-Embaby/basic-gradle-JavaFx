package fxml;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainSceneController {

//    @FXML
//    private Label label;
//	private final String url = "C:\\Users\\DELL\\Desktop\\aa.jpg";
	private final String path = "D:\\Games\\company of hero tale of war\\RelicCOH.exe";

	public void initialize() {
//        label.setText("Hello, JavaFX");
	}

	@FXML
	Process login(ActionEvent event) {

		File file = new File(path);

		try {
			Runtime runTime = Runtime.getRuntime();

			return runTime.exec(file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

//		File file = new File(path);
//		if (file.exists()) {
//			HostServices hostServices = MainApp.getApplication().getHostServices();
//			System.out.println("File exist");
//			hostServices.
//		}
//
//		else {
//			System.out.println("File not exist");
//		}

}