# Simple jwt authentication and authorization using JWT

This demo app checks 3 roles based on url endpoints:

- USER
- MANAGER
- ADMIN

You can register by making POST request to http://localhost:8080/api/auth/register

with body example:

 
        {
            "firstName":"Emil",
            lastName":"Rahimov",
            "email":"emilrahimov@mail.com",
            "password": "emil123",
            "role":"MANAGER"
        }
And depending on the role you have you can access following urls:

- http://localhost:8080/api/user
- http://localhost:8080/api/manager
- http://localhost:8080/api/admin

> Note: Add MYSQL_IP for database to environment variables
