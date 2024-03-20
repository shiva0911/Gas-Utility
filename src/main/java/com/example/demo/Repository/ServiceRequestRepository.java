package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ServiceRequest;

public interface ServiceRequestRepository  extends JpaRepository<ServiceRequest, Long> {

}
