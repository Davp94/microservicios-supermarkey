package com.microservices.notification_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.notification_service.document.Notification;

public interface NotificationRepository extends MongoRepository<Notification, String>{

}
