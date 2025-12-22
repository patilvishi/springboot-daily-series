# Day 4 — Configuration, Profiles & ConfigurationProperties

This project demonstrates:

✔ application.yml vs profile-specific config  
✔ Spring Profiles (dev, prod)  
✔ @ConfigurationProperties (type-safe config)  
✔ Validation at startup  
✔ Clean separation of config & business logic  

## Run (Dev)
```bash
mvn spring-boot:run -Dspring.profiles.active=dev
```

## Run (Prod)
```bash
mvn spring-boot:run -Dspring.profiles.active=prod
```

## API
	GET /info

## What to Observe

	- Config changes behavior without code changes
	- Validation fails fast if config is missing