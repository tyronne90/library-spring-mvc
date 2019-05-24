package com.sgic.libraryspringmvc.service;

import java.util.List;

import com.sgic.libraryspringmvc.dao.MainClassificationDAO;
import com.sgic.libraryspringmvc.entity.MainClassification;

public class MainClassificationServiceImpl  implements MainClassificationService{
	
	private MainClassificationDAO mainClassificationDAO;

	public MainClassificationDAO getMainClassificationDAO() {
		return mainClassificationDAO;
	}

	public void setMainClassificationDAO(MainClassificationDAO mainClassificationDAO) {
		this.mainClassificationDAO = mainClassificationDAO;
	}

	public MainClassification saveMainClassification(MainClassification mainClass) {
		mainClassificationDAO.saveMainClassification(mainClass);
		return null;
	}

	public List<MainClassification> viewMainClassification() {
		return mainClassificationDAO.viewMainClassification();
	}

	public void updateMainClassification(MainClassification mainClass) {
		mainClassificationDAO.updateMainClassification(mainClass);
		
	}

	public MainClassification getMainClassificationById(Long mainClassId) {
		return mainClassificationDAO.getMainClassificationById(mainClassId);
	}

	public void deleteMainClassification(Long mainClassId) {
		mainClassificationDAO.deleteMainClassification(mainClassId);
		
	}
	
	

}
