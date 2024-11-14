package com.yash.demoapp2.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Training {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * name of the training
	 */
	@NotBlank(message="TrainingName cannot be blank")
	@NonNull
	//@Size(max=200,min=1)
	private String trainingName;
	/**
	 * Training requester name
	 */
	@NotBlank(message="Requester Name cannot be blank")
	@NonNull
	private String requesterName;
	/**
	 * start date of the training
	 */
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@NonNull
	private Date startDate;
	/**
	 * Description of the training
	 */
	@NonNull
	private String description;
	/**
	 * end date of the training
	 */
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@NonNull
	private Date endDate;
	/**
	 * date of the Training data creation
	 */
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@NonNull
	private Date createdAt;
	/**
	 * date of the updation performed on training data
	 */
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@NonNull
	private Date updatedAt;

	
	
	/*public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Training (String trainingName, String requesterName, Date startDate, String description,
			Date endDate, Date createdAt, Date updatedAt) {
		super();
		
		this.trainingName = trainingName;
		this.requesterName = requesterName;
		this.startDate = startDate;
		this.description = description;
		this.endDate = endDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	*/
	
	
}
