# springboot-day1

Day 1 — Spring Boot minimal demo (Products API) using Lombok and H2.

## Requirements
- Java 17
- Maven 3.8+

## Run
```bash
mvn spring-boot:run


App will start on http://localhost:8080.

Endpoints

-GET /api/products — list

-GET /api/products/{id} — get by id

-POST /api/products — create (JSON body)

-PUT /api/products/{id} — update

-DELETE /api/products/{id} — delete

Example create (curl)
curl -s -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Hat","sku":"SKU-HAT-1","price":299.5}'

Notes

-Uses H2 in-memory DB by default.
-Lombok is used for model getters/setters; ensure your IDE has Lombok plugin enabled.


---

## How to initialize this as a GitHub repo locally
```bash
mkdir springboot-day1
# copy files as above into the folder
git init
git add .
git commit -m "Day1: Spring Boot starter project with Lombok and H2"
# create a repo on GitHub and push
git remote add origin git@github.com:YOUR_USERNAME/springboot-day1.git
git branch -M main
git push -u origin main


Run & test quickly
-mvn spring-boot:run
-Visit http://localhost:8080/api/products (GET) — you'll see sample rows if you added data.sql.
-Use the cURL example in README to create a product.