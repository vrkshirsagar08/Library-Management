This is a simple Spring Boot-based RESTful API for managing a library's book catalog. 
#Features
-Add a new book
-Retrieve all books
-Retrieve book by ID
-Delete a book
-Update book availability

#How to run project
1.Clone or Download the Project
2.Open the project in your IDE (VS Code, IntelliJ, etc.)
3.Open the LibraryApplication.java
4.Click Run

# Test the API with Postman
 Add a Book:
 http://localhost:8080/api/books
body:
{
  "title": "ABC",
  "author": "XYZ",
  "isbn": "1234567"
  "available": true
}
Response:
{
  "title": "ABC",
  "author": "XYZ",
  "isbn": "1234567"
  "available": true
}

 Get All Books:
 http://localhost:8080/api/books


 Postman Collection Link:
 https://.postman.co/workspace/My-Workspace~db6132eb-4a7c-4645-84c0-13dba82c8689/request/35284851-18f8c9b2-b10b-4013-9a94-9cbaf9560649?action=share&creator=35284851&ctx=documentation
