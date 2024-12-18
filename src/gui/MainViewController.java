package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	public void onMenuItemActionSeller() {
		System.out.println("onMenuItemActionSeller");
	}
	
	public void onMenuItemActionDepartment() {
		System.out.println("onMenuItemActionDepartment");
	}

	public void onMenuItemActionAbout() {
		System.out.println("onMenuItemActionAbout");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

}
