package com.yash.trainingsys.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;

import com.yash.trainingsys.dao.TrainingDAO;
import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.service.TrainingService;

public class TrainingServiceImpl implements TrainingService {
	
	@Autowired
	private TrainingDAO trainingDAO;

	@Override
	@Transactional
	public void addTraining(Training training) {
		trainingDAO.save(training);
		
	}

	@Override
	@Transactional
	public List<Training> listTrainings() {
		// TODO Auto-generated method stub
		return trainingDAO.list();
	}

	

	@Override
	@Transactional
	public void deleteTraining(Long id) {
		trainingDAO.delete(id);
		
	}

	@Override
	@Transactional
	public Training updateTRaining(Long id) {
		return trainingDAO.update(id);
		
	}
	
}
