package com.yash.demoapp3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cust")
public class Customer {

    @SuppressWarnings("unused")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @NotNull
    @Size(min = 2, message = "First Name should have atleast 2 characters")
    private String firstName;
 
    @NotNull
    @Size(min = 2, message = "Last Name should have atleast 2 characters")
    private String lastName;
 
    @Email
    @NotBlank
    private String emailId;
 
    @NotNull
    @Size(min = 2, message = "Passport should have atleast 2 characters")
    private String passportNumber;

	


}
