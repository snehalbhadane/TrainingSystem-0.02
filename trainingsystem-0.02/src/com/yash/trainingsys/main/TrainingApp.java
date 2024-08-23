package com.yash.trainingsys.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.yash.trainingsys.model.Training;
import com.yash.trainingsys.service.TrainingService;
import com.yash.trainingsys.serviceimpl.TrainingServiceImpl;
import com.yash.trainingsys.utilities.Constants;

public class TrainingApp {

	public static void main(String[] args) {
		TrainingServiceImpl.setTrainingList(TrainingService.initTrainings(new ArrayList<Training>()));
		empOperations();
	}
	

	private static void empOperations() {
		try(Scanner s=new Scanner(System.in)){
			String i=Constants.STR_EMPTY;
			do {
			System.out.println("Please enter the choice");
			System.out.println("1:GET Training By ID");
			System.out.println("2:GET Training By Name");
			System.out.println("3:GET Training By Requester Name");
			System.out.println("0:EXIT");
			i=s.next();
			TrainingService tService=new TrainingServiceImpl();
			String userInput=Constants.STR_EMPTY;
			
			
			switch(i)
			{
			case Constants.STR_1:
			{
				System.out.println("Please Enter the Employee id");
				userInput=s.next();
				System.out.println(tService.getTrainingByID(userInput));
				break;
			}
			case Constants.STR_2:
			{
				System.out.println("Please enter the Training name");
				userInput=s.next();
				System.out.println(tService.getTrainingByName(userInput));
				break;
			}
			case Constants.STR_3:
			{
				
				System.out.println("Please enter the Requester name");
				s.nextLine();
				userInput=s.nextLine();
				System.out.println(tService.getTrainingByRequester(userInput));
				break;
			}
			case Constants.STR_EXIT:
			default:
				
				break;
		}
		
		
		userInput=Constants.STR_EMPTY;
		}while(!i.equals(Constants.STR_EXIT));
		
	}
		catch(Exception e)
{
	e.printStackTrace();
}
	}
			
	}


