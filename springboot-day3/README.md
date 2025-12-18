# Day 3 — Spring Bean Lifecycle (Complete Demo)

This project demonstrates the COMPLETE Spring Bean Lifecycle:

✔ Bean instantiation  
✔ Dependency Injection  
✔ @PostConstruct  
✔ BeanPostProcessor (before & after init)  
✔ Aware interfaces  
✔ @PreDestroy  

## How to Run
```bash
mvn spring-boot:run
```
## What to Observe in Logs

	Startup order:

		- Constructors
		- BeanPostProcessor (before init)
		- @PostConstruct
		- BeanPostProcessor (after init)

	Shutdown order:
		- @PreDestroy callbacks