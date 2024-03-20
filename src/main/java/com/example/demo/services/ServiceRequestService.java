
package com.example.demo.services;

import java.util.List;
import com.example.demo.entity.ServiceRequest;

public interface ServiceRequestService {

    ServiceRequest submitRequest(ServiceRequest request);
    ServiceRequest getRequestById(Long id);
    List<ServiceRequest> getAllRequests();

    ServiceRequest markRequestInProgress(Long id);
    ServiceRequest markRequestComplete(Long id);
    ServiceRequest markRequestPending(Long id);
}
