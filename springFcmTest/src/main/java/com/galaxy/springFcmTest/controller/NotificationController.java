package com.galaxy.springFcmTest.controller;

import com.galaxy.springFcmTest.dto.RequestDto;
import com.galaxy.springFcmTest.service.FirebaseCloudMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    @Autowired
    FirebaseCloudMessageService firebaseCloudMessageService;

    @PostMapping("/api/notification")
    public ResponseEntity sendToNotification(@RequestBody RequestDto requestDto) throws IOException {
        System.out.println(requestDto.getTargetToken());
        System.out.println(requestDto.getTitle());
        System.out.println(requestDto.getBody());

        firebaseCloudMessageService.sendMessageTo(requestDto.getTargetToken(), requestDto.getTitle(),requestDto.getBody());
        return ResponseEntity.ok().build();
    }
}
