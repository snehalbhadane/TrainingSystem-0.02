package com.yash.demoapp2.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.demoapp2.exceptions.TraningIdNotFoundeXception;
import com.yash.demoapp2.model.Training;
import com.yash.demoapp2.repository.TrainingRepository;
import com.yash.demoapp2.service.TrainingService;


@Service
public class TrainingServiceImpl implements TrainingService{
	@Autowired
	private TrainingRepository trainingRepo;

	@Override
	public Training addTraining(Training training) {
		
		return trainingRepo.save(training);
	}

	@Override
	public List<Training> listTrainings() {
		
		return trainingRepo.findAll();
	}

	@Override
	public Training updateTraining(Training training) {
		
		return trainingRepo.save(training);
	}

	@Override
	public void deleteTraining(Long id) throws TraningIdNotFoundeXception
	{
		//trainingRepo.deleteById(id);
		if (!trainingRepo.existsById(id)) {
			throw new TraningIdNotFoundeXception(" ID " + id + " not found.");
		}
		trainingRepo.deleteById(id);
}
	}


