package com.yash.trainingsys.daoimpl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.yash.trainingsys.dao.TrainingDAO;
import com.yash.trainingsys.model.Training;
@Repository
public class TrainingDAoImpl implements TrainingDAO {

	public void save(Training training) 
	{
		System.out.println("Inside the DAO Layer");// TODO Auto-generated method stub
		System.out.println(training);
		
	}

	@Override
	public List<Training> list() {
		
		return null;
	}

}
