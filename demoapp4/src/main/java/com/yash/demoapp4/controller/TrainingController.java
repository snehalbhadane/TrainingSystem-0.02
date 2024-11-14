package com.yash.demoapp4.controller;
//import javax.validation.Valid;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.demoapp4.exceptions.NoTrainingFoundException;
import com.yash.demoapp4.exceptions.TrainingIdNotFoundException;
import com.yash.demoapp4.model.Training;
import com.yash.demoapp4.service.MapValidationErrorService;
import com.yash.demoapp4.service.TrainingService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class TrainingController {	
	@Autowired //this will inject trainingserviceimpl object in training service
	private TrainingService trainingService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	//get trainings
	@GetMapping("/training")
	public List<Training> getTrainings() throws NoTrainingFoundException{
		return trainingService.getTrainings();
		
	}
	
//	// get training based on a id
//	@GetMapping("/training/{trainingid}")
//	public List<Training> getTraining(@PathVariable String trainingid)
//	{
//		return this.trainingService. .getTraining(Long.parseLong(trainingid));
//		
//	}
//	@PostMapping("/training")
//	public Training addTraining(@RequestBody Training training)
//	{
//		return this.trainingService.addTraining(training);
//		
//	}
	@PostMapping
	public ResponseEntity<?> createNewTraining(@Valid @RequestBody Training training, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
			return errorMap;
		Training savedTraining = trainingService.addTraining(training);
		return new ResponseEntity<Training>(savedTraining, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/training/{trainingid}")
	public void deleteTraining(@PathVariable String trainingid) throws NumberFormatException, TrainingIdNotFoundException
	{
		 trainingService.deleteTraining(Long.parseLong(trainingid));
	}
	
	@PutMapping("/training")
	public Training updateTraining(@RequestBody Training training)
	{
		return this.trainingService.updateTraining(training);
	}
	
}
