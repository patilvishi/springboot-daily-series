# Day 2 – IoC & Dependency Injection in Spring Boot

This project demonstrates:

- Constructor Injection
- Multiple Implementations of an Interface
- Using @Qualifier & Bean Name Injection
- Autowiring Beans into a Map for Dynamic Strategy Pattern

## Run the Application
```bash
mvn spring-boot:run

## API
POST /orders
Request Body

{
"productId": "P1001",
"amount": 899.0,
"paymentMode": "stripe"
}

## Notes

- Add more payment implementations as needed
- Demonstrates real-world enterprise DI pattern