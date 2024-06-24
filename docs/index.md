# Notification Service Documentation
Welcome to the Notification Service documentation. This guide provides an overview of the gRPC service for sending notifications.

## Table of Contents

1. [Overview](#overview)
2. [Prerequisites](#prerequisites)
3. [Setup](#setup)
4. [Running Service](#running-service)
5. [API Reference and examples](#api-reference-and-examples)
7. [Troubleshooting](#troubleshooting)
8. [Additional Resources](#additional-resources)

## Overview
The Notification Service is a gRPC-based service that facilitates sending notifications to users through various channels such as email, SMS, and push notifications.

## Prerequisites
Before setting up the Notification Service, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Apache Maven (for building the project)
- An IDE (e.g., IntelliJ IDEA, Eclipse)
- grpcurl (for interacting with the service)

## Setup

To set up the Notification Service locally, follow these steps:

1. **Clone the Repository:**
```
git clone https://github.com/example/notification-service.git
cd notification-service
```

2. **Build the Project:**
```
mvn clean install
```

## Running Service

For running parcel-service, please, follow the next command:
  ```
  mvn spring-boot:run
  ```
The service will start on port 8002 by default.

## API Reference and examples
`SendNotification` - Sends a notification to a user.

**Request: SendNotificationDto**
```
{
  user.UserDto user_dto = 1;
  string message = 2;
}

```

Example:
```
grpcurl -plaintext -d '{
  "user_dto": {
    "id": 123,
    "name": "John Doe",
    "email": "john.doe@example.com"
  },
  "message": "Your order has been shipped!"
}' localhost:8080 notification.NotificationService/SendNotification
```

**Response: google.protobuf.Empty** - The SendNotification RPC method returns an empty response upon successful sending of the notification.
```
{}
```

## Troubleshooting
- Ensure that all dependencies are installed and up to date.
- Verify the service is running on the correct port (8000 by default).
- Check console logs for error messages and stack traces.

## Additional Resources

- [gRPC Documentation](https://grpc.io/docs/)
- [Protocol Buffers Documentation](https://developers.google.com/protocol-buffers/docs/overview)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
