# Gas-Utility-Service-Application

# Features

User Registration: Allows users to register with the system.

Service Requests Submission: Customers can submit service requests online.

Request Tracking: Customers can track the status of their service requests.

Change Status: Customer support representatives can change the status of service requests.

Get List of Queries: Retrieve a list of service requests based on their status.

# Technologies Used
Java
Spring Boot
Spring Data JPA
H2 Database (for testing purposes)

# 1. User Registration:
Endpoint:
Method: POST
URL: http://localhost:8089/api/customers/register
Request Body (JSON):
json

Copy code

{
  "name": "prakash jivtode",
  
  "email": "shivajivtode1@example.com"
  
}

# Response (JSON):
json
Copy code

{

  "id": 1,
  
  "name": "prakash jivtode",
  
  "email": "shivajivtode1@@example.com"
  
}

# 2. Submit Service Request:

Endpoint:

Method: POST

URL: http://localhost:8089/api/service-requests

Request Body (JSON):

json

Copy code
{
  "type": "Gas Leak",
  
  "details": "Report of gas leak in the kitchen"
  
}

Response (JSON):

json

Copy code
{
  "id": 1,
  
  "type": "Gas Leak",
  
  "details": "Report of gas leak in the kitchen",
  
  "submittedAt": "2024-03-25T10:00:00",
  
  "resolvedAt": null,
  
  "status": "Pending"
  
}

# 3. Change Status of Service Request:

# Mark as In Progress:
Method: PUT
URL: http://localhost:8089/api/service-requests/{id}/progress

Replace {id} with the ID of the service request.

# Mark as Complete:
Method: PUT

URL: http://localhost:8089/api/service-requests/{id}/complete

Replace {id} with the ID of the service request.

# Mark as Pending:

Method: PUT

URL: http://localhost:8089/api/service-requests/{id}/pending

Replace {id} with the ID of the service request.

# 4. Get List of Queries According to Status:
Endpoint:

Method: GET
URL: http://localhost:8089/api/service-requests?status={status}

Replace {status} with the desired status (e.g., pending, in-progress, complete).

Response (JSON):
json
Copy code

[

  {
  
    "id": 1,
    
    "type": "Gas Leak",
    
    "details": "Report of gas leak in the kitchen",
    
    "submittedAt": "2024-03-25T10:00:00",
    
    "resolvedAt": null,
    
    "status": "Pending"
  },
  {
    "id": 2,
    
    "type": "Meter Installation",
    
    "details": "Request for installation of gas meter",
    
    "submittedAt": "2024-03-25T11:00:00",
    
    "resolvedAt": null,
    
    "status": "In Progress"
    
  }
]
