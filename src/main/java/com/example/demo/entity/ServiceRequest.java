package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRequest
{
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String type;
	    private String details;
	    private LocalDateTime submittedAt;
	    private LocalDateTime resolvedAt;
	    private String status;
	    public void markInProgress() {
	        this.status = "In Progress";
	    }

	    public void markComplete() {
	        this.status = "Complete";
	        this.resolvedAt = LocalDateTime.now();
	    }

	    public void markPending() {
	        this.status = "Pending";
	        this.resolvedAt = null; // Clear resolvedAt when marking as pending
	    }

}
