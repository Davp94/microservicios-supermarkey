package com.blumbit.compras_ventas.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.blumbit.compras_ventas.feign.dto.Notification;
import com.blumbit.compras_ventas.feign.dto.NotificationRequest;

@FeignClient(name="notification-service", url="${feign.client.url}")
public interface NotificationFeignClient {

    @PostMapping(value="/notification")
    public ResponseEntity<Notification> createNotification(@RequestBody NotificationRequest notificationRequest);

}
