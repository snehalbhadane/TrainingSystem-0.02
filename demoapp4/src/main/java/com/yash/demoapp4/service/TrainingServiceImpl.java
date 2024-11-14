package com.yash.demoapp4.service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.demoapp4.exceptions.NoTrainingFoundException;
import com.yash.demoapp4.exceptions.TrainingIdNotFoundException;
import com.yash.demoapp4.model.Training;
import com.yash.demoapp4.repository.TrainingRepository;



@Service
public class TrainingServiceImpl implements TrainingService {

	
	@Autowired
	TrainingRepository trainingRepository;
		
// method to add training
	@Override
	public Training addTraining(Training training) {
		return trainingRepository.save(training);
		 
	}

	// get all trainings
	@Override
	public List<Training> getTrainings()  throws NoTrainingFoundException{
//		if(!trainingRepository.exists())
//		{
//			throw new NoTrainingFoundException(" No training found");
//		}
		return trainingRepository.findAll();
	}

// get training based on id
//	@Override
//	public List<Training> getTraining(long id) 
//	{
//		return trainingRepository.findById(id);
//	}
	
	
//delete training
	@Override
	public void deleteTraining(long id) throws TrainingIdNotFoundException {
		if(!trainingRepository.existsById(id))
		{
			throw new TrainingIdNotFoundException(" ID " + id + " not found.");
		}
		trainingRepository.deleteById(id);;
		
	}

//update training based on id
	@Override
	public Training updateTraining(Training training) {
		return trainingRepository.save(training);
		
	}

}
