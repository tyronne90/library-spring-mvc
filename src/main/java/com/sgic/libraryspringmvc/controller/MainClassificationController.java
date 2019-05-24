package com.sgic.libraryspringmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sgic.libraryspringmvc.entity.MainClassification;
import com.sgic.libraryspringmvc.service.MainClassificationService;

@Controller
public class MainClassificationController {
	
	@Autowired
	private MainClassificationService mainClassificationService;
	
	@RequestMapping("/AddMainClassification")
	 public String AddMainClassificationForm(Model model){  
		model.addAttribute("addmainclass", new MainClassification()); // addmainclass - this is form name
   	return "AddMainClassification"; 
   }  
	
	@RequestMapping("/ViewMainClassification")
	 public String ViewMainClassificationForm(Model model){  
		model.addAttribute("ViewMainClassification", new MainClassification()); 
		List<MainClassification> list= mainClassificationService.viewMainClassification();
		model.addAttribute("list",list);
		return "ViewMainClassification"; 
   }  
	
	 
	 @RequestMapping(value="/save", method = RequestMethod.POST)  
	public String saveMainClassification(@ModelAttribute("mainClass") MainClassification mainClass) {
		 mainClassificationService.saveMainClassification(mainClass);
		return "redirect:/ViewMainClassification";
	}
	
/*		@RequestMapping("/ViewMainClassification")
		 public String ViewMainClassificationForm(Model model){  
			model.addAttribute("ViewMainClassification", new MainClassification()); 
			List<MainClassification> list= mainClassificationDAO.viewMainClassification();
			model.addAttribute("list",list);
			return "ViewMainClassification"; 
	   }  */
	 
	    @RequestMapping(value="/EditMainClassification/{mainClassId}")    
	    public String EditMainClassification(@PathVariable Long mainClassId, Model model){    
	    	MainClassification mainClass = mainClassificationService.getMainClassificationById(mainClassId);   
	    	model.addAttribute("editmainclass",mainClass);  
	        return "EditMainClassification";    
	    }   
	    
	    @RequestMapping(value="/SaveEditMainClassification",method = RequestMethod.POST)    
	    public String SaveEditMainClassification(@ModelAttribute("mainClass") MainClassification mainClass){ 
	    	mainClassificationService.updateMainClassification(mainClass);
	        return "redirect:/ViewMainClassification";    
	    }   
	    
	    @RequestMapping(value="/DeleteMainClassification/{mainClassId}",method = RequestMethod.GET)    
	    public String delete(@PathVariable Long mainClassId){    
	    	mainClassificationService.deleteMainClassification(mainClassId);  
	        return "redirect:/ViewMainClassification";    
	    }     

}
