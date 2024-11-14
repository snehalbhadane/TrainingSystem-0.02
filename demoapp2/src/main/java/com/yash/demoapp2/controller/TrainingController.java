package com.yash.demoapp2.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.demoapp2.exceptions.TraningIdNotFoundeXception;
import com.yash.demoapp2.model.Training;
import com.yash.demoapp2.service.TrainingService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;

//import com.yash.trainingapp.serviceimpl.MapValidationErrorService;


@RestController
public class TrainingController {
	@Autowired
	private TrainingService trainingService;
	
	 //@Autowired
		//private MapValidationErrorService mapValidationErrorService;

		/*@PostMapping
		public ResponseEntity<?> createNewProject(@Valid @RequestBody Training training, BindingResult result) {
			ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
			if (errorMap != null)
				return errorMap;
			Training savedTraining = trainingService.addTraining(training);
			return new ResponseEntity<Training>(savedTraining, HttpStatus.CREATED);
		}
	*/
    @PostMapping("/addTraining")
	public ResponseEntity<Training> addTraining(@Valid @RequestBody Training training) {
		
		Training savedTraining = trainingService.addTraining(training);
			return new ResponseEntity<Training>(savedTraining, HttpStatus.CREATED);
	}

	@GetMapping("/listTraining")
	public ResponseEntity listTrainings() {
		
		//return trainingService.listTrainings();
		List<Training> trainings = trainingService.listTrainings();
		return new ResponseEntity<List<Training>>(trainings, HttpStatus.OK);
	}

	@PutMapping("/updateTraining")
	public Training updateTraining( @RequestBody Training training) {
		
		return trainingService.updateTraining(training);
	}

	@DeleteMapping("/deleteTraining/{id}")
	public ResponseEntity<String> deleteTraining( @PathVariable Long id) throws TraningIdNotFoundeXception {
		//trainingService.deleteTraining(id);
		trainingService.deleteTraining(id);
		return new ResponseEntity<String>(
				"Training with " + id+ " is successfully deleted", HttpStatus.OK);
	}
	

}
