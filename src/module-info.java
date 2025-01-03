module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.base;
	
	requires transitive java.sql;
	
	opens gui to javafx.fxml;
	exports gui;
	
	exports model.services;
	exports model.entities;
	exports model.dao;
	exports model.dao.impl;
	exports gui.listeners;

	opens application to javafx.graphics, javafx.fxml;
}
