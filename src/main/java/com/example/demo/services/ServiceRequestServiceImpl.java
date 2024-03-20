
package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ServiceRequestRepository;
import com.example.demo.entity.ServiceRequest;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @Override
    public ServiceRequest submitRequest(ServiceRequest request) {
        request.setSubmittedAt(LocalDateTime.now());
        request.setStatus("Pending");
        return serviceRequestRepository.save(request);
    }

    @Override
    public ServiceRequest getRequestById(Long id) {
        return serviceRequestRepository.findById(id).orElse(null);
    }

    @Override
    public List<ServiceRequest> getAllRequests() {
        return serviceRequestRepository.findAll();
    }

    @Override
    public ServiceRequest markRequestInProgress(Long id) {
        ServiceRequest request = serviceRequestRepository.findById(id).orElse(null);
        if (request != null) {
            request.markInProgress();
            return serviceRequestRepository.save(request);
        }
        return null;
    }

    @Override
    public ServiceRequest markRequestComplete(Long id) {
        ServiceRequest request = serviceRequestRepository.findById(id).orElse(null);
        if (request != null) {
            request.markComplete();
            return serviceRequestRepository.save(request);
        }
        return null;
    }

    @Override
    public ServiceRequest markRequestPending(Long id) {
        ServiceRequest request = serviceRequestRepository.findById(id).orElse(null);
        if (request != null) {
            request.markPending();
            return serviceRequestRepository.save(request);
        }
        return null;
    }
}
