# Backlog Bounty 🎮

Backlog Bounty is a full stack web app for tracking video game progress, reviews and goals. Built as a portfolio project to showcase skills in backend development, cloud deployment and the use of modern web frameworks.

---

## Features:
- ✅ Add, view, update, and delete games (CRUD functionality)
- ✅ Add reviews and notes to games
- ✅ Track game status (e.g., Completed, Playing, Wishlist)
- ✅ Built-in RESTful API using Spring Boot
- ✅ PostgreSQL integration allowing for data persistence.
- ❗Frontend WIP using React

## 💼 Why it matters

This project is attempting to simulate real-world engineering practices for my own learning:

- RESTful API architecture with clear endpoints
- Structured backend using Spring Boot with layered services
- PostgreSQL database integration and schema design
- Manual API testing via the use of Postman
- Foundation for a responsive frontend and user authentication

## Tech Stack
- Java + Spring Boot (current)
- H2 (scrapped in favour of PostgreSQL)
- Postman (API testing)
- PostgreSQL (in use)
- React (in use)
- .Net 8 Web API (planned)
- Azure App Service & PostgreSQL (50%)

## 🔄 Roadmap
- [x] Basic CRUD with Java & Spring Boot
- [x] Add reviews and progress logs
- [x] Migrate to PostgreSQL
- [x] Get started on React frontend
- [ ] Complete frontend
- [ ] Deploy full stack to Azure

## 🚀 Quick Start (Backend, Frontend WIP)

```bash
# 1. Clone the repo
git clone https://github.com/yourusername/backlog-bounty.git
cd backlog-bounty

# 2. Navigate to PostgreSQL and download appropriate files
https://www.postgresql.org/download/

# 3. Use pgAdmin to create a database named 'backlogbounty'

# 4. Update your application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/backlogbounty
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password

# 5. Run the Spring Boot application
./mvnw spring-boot:run
