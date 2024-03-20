package com.example.demo.Controller;
import com.example.demo.entity.ServiceRequest;
import com.example.demo.services.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service-requests")
public class ServiceRequestController {

    @Autowired
    private ServiceRequestService serviceRequestService;

    @PostMapping
    public ServiceRequest submitRequest(@RequestBody ServiceRequest request) {
        return serviceRequestService.submitRequest(request);
    }

    @GetMapping("/{id}")
    public ServiceRequest getRequestById(@PathVariable Long id) {
        return serviceRequestService.getRequestById(id);
    }

    @GetMapping
    public List<ServiceRequest> getAllRequests() {
        return serviceRequestService.getAllRequests();
    }

    @PutMapping("/{id}/progress")
    public ServiceRequest markRequestInProgress(@PathVariable Long id) {
        return serviceRequestService.markRequestInProgress(id);
    }

    @PutMapping("/{id}/complete")
    public ServiceRequest markRequestComplete(@PathVariable Long id) {
        return serviceRequestService.markRequestComplete(id);
    }

    @PutMapping("/{id}/pending")
    public ServiceRequest markRequestPending(@PathVariable Long id) {
        return serviceRequestService.markRequestPending(id);
    }
}
