# springboot-machine-test
A simple Spring Boot REST API for Category and Product management. Built using Spring Boot, JPA, Hibernate, and MySQL. Includes basic CRUD operations, pagination, and one-to-many relationship between Category and Products. All APIs tested using Postman.

How did you run the code?  
I used VS Code, made sure my MySQL database was running with the correct settings in the `application.properties` file, and ran the main class. The server started on port 8080.

How did you run the machine test?  
I used Postman to test the REST APIs. I sent GET, POST, PUT, and DELETE requests to the API endpoints for categories and products, checked the responses, and verified pagination by using the `page` parameter.

DB Design:  
I used a MySQL database with two tables: `categories` and `products`.  
- The `categories` table has columns like `id` and `name`.  
- The `products` table has columns like `id`, `name`, `price`, and `category_id`.  
There is a one-to-many relationship between categories and products — one category can have many products.
