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

{

  "name": "prakash jivtode",
  
  "email": "shivajivtode1@example.com"
  
}

# Response (JSON):

{

  "id": 1,
  
  "name": "prakash jivtode",
  
  "email": "shivajivtode1@@example.com"
  
}

# 2. Submit Service Request:


Method: POST

URL: http://localhost:8089/api/service-requests

Request Body (JSON):

{

  "type": "Gas Leak",
  
  "details": "Report of gas leak in the kitchen"
  
}

Response (JSON):


{

  "id": 1,
  
  "type": "Gas Leak",
  
  "details": "Report of gas leak in the kitchen",
  
  "submittedAt": "2024-03-25T10:00:00",
  
  "resolvedAt": "null",
  
  "status": "Pending"
  
}

# 3. Change Status of Service Request:

# Mark as In Progress:
Method: PUT
URL: http://localhost:8089/api/service-requests/{id}/progress



# Mark as Complete:
Method: PUT

URL: http://localhost:8089/api/service-requests/{id}/complete



# Mark as Pending:

Method: PUT

URL: http://localhost:8089/api/service-requests/{id}/pending



# 4. Get List of Queries According to Status:
Endpoint:

Method: GET
URL: http://localhost:8089/api/service-requests?status={status}



Response (JSON):

[

  {

    "id": 1,
    
    "type": "Gas Leak",
    
    "details": "Report of gas leak in the kitchen",
    
    "submittedAt": "2024-03-21T00:52:26.3857312",
    
    "resolvedAt": "null",
    
    "status": "Pending"
  },
  {
  
    "id": 2,
    
    "type": "Meter Installation",
    
    "details": "Request for installation of gas meter",
    
    "submittedAt": "2024-03-21T00:53:11.539178",
    
    "resolvedAt": "2024-03-21T00:53:29.2443051",
  
    
    "status": "Complete"
    
  }
]
# Database Table
![image](https://github.com/shiva0911/Gas-Utility/assets/78194961/3b5f7135-6b24-4bbe-a4cd-d429011cc9c4)




