
# Microservices Social Media Platform

## Overview
A runnable microservices-based social media platform built with:
- Spring Boot + Spring Cloud
- Eureka Service Discovery
- Spring Cloud Gateway
- RabbitMQ (event-driven)
- WebSocket (chat & notifications)
- React 18 (Context API)
- Docker & Docker Compose

## Run Instructions
```bash
docker-compose up --build
```

## Access
- Frontend: http://localhost:3000
- API Gateway: http://localhost:8080
- Eureka: http://localhost:8761
- RabbitMQ UI: http://localhost:15672 (guest/guest)

## Expected Output
- Users can view feed
- Create posts
- Receive notifications
- Services visible in Eureka
