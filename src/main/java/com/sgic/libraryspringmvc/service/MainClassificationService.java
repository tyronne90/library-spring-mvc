package com.sgic.libraryspringmvc.service;

import java.util.List;

import com.sgic.libraryspringmvc.entity.MainClassification;

public interface MainClassificationService {
	public abstract MainClassification saveMainClassification(MainClassification mainClass);
	public abstract List<MainClassification> viewMainClassification();
	public abstract void updateMainClassification(MainClassification mainClass);
	public abstract MainClassification getMainClassificationById(Long mainClassId);
	public abstract void deleteMainClassification(Long mainClassId);
}
