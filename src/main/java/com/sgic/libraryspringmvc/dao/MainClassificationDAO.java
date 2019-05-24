package com.sgic.libraryspringmvc.dao;

import java.util.List;

import com.sgic.libraryspringmvc.entity.MainClassification;

public interface MainClassificationDAO {
	public abstract MainClassification saveMainClassification(MainClassification mainClass);
	public abstract List<MainClassification> viewMainClassification();
	public abstract void updateMainClassification(MainClassification mainClass);
	public abstract MainClassification getMainClassificationById(Long mainClassId);
	public abstract MainClassification deleteMainClassification(Long mainClassId);
}
