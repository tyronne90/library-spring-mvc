package com.sgic.libraryspringmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mainclassification")
public class MainClassification {
	@Id
	@GeneratedValue
	@Column(name="main_class_id")
	private Long mainClassId;
	
	@Column(name="main_class_name")
	private String mainClassName;

	public MainClassification() {
		super();
	}

	public MainClassification(Long mainClassId, String mainClassName) {
		super();
		this.mainClassId = mainClassId;
		this.mainClassName = mainClassName;
	}

	public Long getMainClassId() {
		return mainClassId;
	}

	public void setMainClassId(Long mainClassId) {
		this.mainClassId = mainClassId;
	}

	public String getMainClassName() {
		return mainClassName;
	}

	public void setMainClassName(String mainClassName) {
		this.mainClassName = mainClassName;
	}
	
	

}
