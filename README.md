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
