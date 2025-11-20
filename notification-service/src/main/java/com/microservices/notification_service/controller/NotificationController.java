package com.microservices.notification_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.notification_service.document.Notification;
import com.microservices.notification_service.dto.NotificationRequest;
import com.microservices.notification_service.service.NotificationServiceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationServiceImpl notificationServiceImpl;

    public NotificationController(NotificationServiceImpl notificationServiceImpl) {
        this.notificationServiceImpl = notificationServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody NotificationRequest notificationRequest) {        
        return ResponseEntity.ok().body(notificationServiceImpl.createNotification(notificationRequest));
    }
    

}
