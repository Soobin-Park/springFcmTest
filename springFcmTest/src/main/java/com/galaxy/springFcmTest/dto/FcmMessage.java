package com.galaxy.springFcmTest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.management.Notification;

@Builder
@Getter
@AllArgsConstructor
public class FcmMessage {
    private boolean validate_only;
    private Message message;

    @Builder
    @AllArgsConstructor
    @Getter
    public static class Message{
        //모든 mobile os를 아우르는 Notification 제공
        private Notification notification;
        //특정 device에 알림을 보내는 용도
        private String token;
    }

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Notification{
        private String title;
        private String body;
        private String image;
    }

}
