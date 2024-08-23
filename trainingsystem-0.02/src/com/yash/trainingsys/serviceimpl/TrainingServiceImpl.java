package com.yash.trainingsys.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.service.TrainingService;
import com.yash.trainingsys.utilities.CustomSupplier;

public class TrainingServiceImpl implements TrainingService {
	private static List<Training> trainingList;
	private static CustomSupplier supplier = new CustomSupplier();
  
	public static List<Training> getTrainingList() {
		return trainingList;
	}


	public static void setTrainingList(List<Training> trainingList) {
		TrainingServiceImpl.trainingList = trainingList;
	}


	@Override
	public Training getTrainingByID(String id) {
		LocalDate d=LocalDate.now();
		 LocalTime time = LocalTime.now();
		 LocalDateTime current = LocalDateTime.now();
		 LocalDate date2 = LocalDate.of(2024,8,26);
		System.out.println(d+" "+time);
		System.out.println(current);
		System.out.println(date2);
		return trainingList.stream().filter(t->t.getId().equals(id)).findFirst().orElseGet(supplier);

	}


	@Override
	public List<Training> getTrainingByName(String name) {
		Function<Training, Boolean> f= t-> t.getTrainingName().equals(name);
		Predicate<Training> p = f::apply;
		return trainingList.stream().filter(p).collect(Collectors.toList());
	}


	@Override
	public List<Training> getTrainingByRequester(String requesterName) {
		
		Predicate<Training>p=e->e.getRequesterName().equalsIgnoreCase(requesterName);
		return trainingList.stream().filter(p).collect(Collectors.toList());
	}


	@Override
	public void getRequesterList() {
		// TODO Auto-generated method stub
		
	}

}
