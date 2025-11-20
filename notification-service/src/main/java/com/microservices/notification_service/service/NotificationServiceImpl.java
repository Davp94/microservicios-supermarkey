package com.microservices.notification_service.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.microservices.notification_service.document.Notification;
import com.microservices.notification_service.dto.NotificationRequest;
import com.microservices.notification_service.repository.NotificationRepository;

@Service
public class NotificationServiceImpl {

    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification createNotification(NotificationRequest notificationRequest) {
        Notification notificationToCreate = new Notification();
        notificationToCreate.setBody(notificationRequest.getBody());
        notificationToCreate.setCategory(notificationRequest.getCategory());
        notificationToCreate.setTitulo(notificationRequest.getTitulo());
        notificationToCreate.setUsuario(notificationRequest.getUsuario());
        notificationToCreate.setPrioridad(notificationRequest.getPrioridad());
        notificationToCreate.setEstado("PENDIENTE");
        notificationToCreate.setFechaRegistro(LocalDateTime.now());
        notificationToCreate.setNotificationIdentifier("NOT-TEST");
        return notificationRepository.save(notificationToCreate);
    }
}
