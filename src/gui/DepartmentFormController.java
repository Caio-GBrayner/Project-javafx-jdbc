package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable{

	private Department entity;

	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Button btSave;
	
	@FXML 
	Button btCancel;
	
	@FXML
	private Label labelError;
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	@FXML
	public void onbtSaveAction() {
		System.out.println("Save test");
	}
	
	@FXML
	public void onbtCanceAction() {
		System.out.println("Cancel test");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {	
		initializeNode();
	}
	
	private void initializeNode() {
		Constraints.setTextFieldMaxLength(txtName, 30);
		Constraints.setTextFieldInteger(txtId);
	}
	
	public void updateFormData() {
		if(entity == null) {
			txtId.setText(String.valueOf(entity.getId()));
			txtName.setText(entity.getName());
		}
	}

}
