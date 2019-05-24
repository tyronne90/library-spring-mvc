//package com.sgic.libraryspringmvc;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.sgic.libraryspringmvc.entity.MainClassification;
//import com.sgic.libraryspringmvc.service.MainClassificationService;
//import com.sgic.libraryspringmvc.service.MainClassificationServiceImpl;
//
//public class LibraryApplication {
//	
//	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
//		MainClassificationService mainClassificationService = context.getBean("mainClassificationService", MainClassificationServiceImpl.class);
//		
////		MainClassification mainClass = new MainClassification();
////		mainClass.setMainClassName("ABCD");
////		mainClassificationService.saveMainClassification(mainClass);
////		System.out.println("Saved");
//		
////		mainClassificationService.viewMainClassification();
//		
////		mainClassificationService.deleteMainClassification(27l);
////		mainClassificationService.getMainClassificationById(26L);
//		
//		
//		
//	}
//	
//}
