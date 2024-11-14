package com.yash.demoapp4.model;


import java.util.Date;
import java.util.List;
import java.util.Set;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="tra")
//https://www.youtube.com/watch?v=X7pGCmVxx10-spring security
public class Training {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@jakarta.validation.constraints.NotNull(message = "Training name cannot be null.")
	@jakarta.validation.constraints.NotEmpty(message = "Training name cannot be null.")
	@jakarta.validation.constraints.NotBlank(message = "Traning name should not be blank.")
	private  String trainingName;
	@NonNull
	@jakarta.validation.constraints.NotNull(message = "requestor name should not be blank.")
	@jakarta.validation.constraints.NotBlank(message = "requestor name should not be blank.")
	@jakarta.validation.constraints.Size(min=1,max=200,message="Invalid requestorName should have min size 5")
	private String requestorName;
	@NonNull
	@jakarta.validation.constraints.NotBlank(message = "description should not be blank.")
	private  String description;
	@NonNull
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private  Date startDate;
	@NonNull
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private  Date endDate;
	@NonNull
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private  Date createdAt;
	@NonNull
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private  Date updatedAt;

}
