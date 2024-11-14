package com.yash.trainingsys.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.service.TrainingService;
@RestController
@RequestMapping("/training")
public class TrainingController 
{
	  	@Autowired(required = true)
	  	//@Qualifier("trainingService")
	    private TrainingService trainingService;
	  	@GetMapping("/list")
	    
	    public List<Training> listTrainings() {
	  		System.out.println("Hello Controller");
	    	return trainingService.listTrainings();
	  	}

	    /*@GetMapping("/list")
	    //public String listTrainings(Model theModel) {
	    public List<Training> listTrainings() {
	    	return trainingService.listTrainings();
	       // List <Training> trainings = trainingService.listTrainings();
	        //theModel.addAttribute("trainings", trainings);
	        //return "list-trainings";
	    }

	    @GetMapping("/showForm")
	    public String showFormForAdd(Model theModel) {
	    	Training training = new Training();
	        theModel.addAttribute("training", training);
	        return "training-form";
	    }

	    @PostMapping("/saveTraining")
	    public String saveTraining(@ModelAttribute("training") Training training) {
	        trainingService.addTraining(training);
	        return "redirect:/training/list";
	    }

	    @GetMapping("/updateForm")
	    public String showFormForUpdate(@ModelAttribute("id") Long id,Model theModel) {
	    	Training training=trainingService.updateTRaining(id);
	    	theModel.addAttribute("training",id);
	        return "training-form";
	    }

	    @GetMapping("/delete")
	    public String deleteCustomer(@RequestParam("id") long id) {
	        trainingService.deleteTraining(id);
	        return "redirect:/training/list";
	    }*/
	}
//https://www.youtube.com/watch?v=ZTv6uQ2AlA8&list=PL3NrzZBjk6m-9CVPueDLLermojwtfuW_f&index=2--for spring mvc java based configuration

