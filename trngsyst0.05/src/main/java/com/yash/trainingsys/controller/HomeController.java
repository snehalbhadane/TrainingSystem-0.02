package com.yash.trainingsys.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.trainingsys.model.Training;


@Controller
public class HomeController {
	@InitBinder
    public void initBinder(WebDataBinder binder){
      //  binder.setDisallowedFields(new String[] {"studentMobile"});
       // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy*mm*dd");
        //binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(dateFormat,false));
		
    }

	@RequestMapping(value="/home")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		System.out.println("Hello");
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String viewTrainingForm(Model model) {
		Training training = new Training();
		model.addAttribute("training", training);
		
		//List tlist = Arrays.asList(1, "Java", "Java comp");
		//model.addAttribute("tlist", tlist);
		
		return "Registration";
	}
	@ModelAttribute("headerMessage")
	public String addingCommonObjects() {
	            return "Yash Technologies, India";
	        }
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addTraining(@ModelAttribute("training") Training training) {
		System.out.println(training);
		return "RegistrationSuccess";
	}
}
