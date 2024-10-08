package com.yash.trainingsys.model;

/**
 * Training class represent model for the app
 * @author snehal.pawar
 *
 */
public class Training
	//id,trainingName,requesterName,description
{
	/**
	 * Id of the Training which should be autogenerated
	 */
	private String id;
	/**
	 * name of the training	
	 */
	private String trainingName;
	/**
	 * Training requester name
	 */
	private String requesterName;

	/**
	 * Description of the training
	 */
	private String description;

	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Training(String id, String trainingName, String requesterName, String description) {
		super();
		this.id = id;
		this.trainingName = trainingName;
		this.requesterName = requesterName;
		this.description = description;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getRequesterName() {
		return requesterName;
	}

	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", trainingName=" + trainingName + ", requesterName=" + requesterName
				+ ", description=" + description + "]";
	}	


}
