package com.galaxy.springFcmTest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class RequestDto {

    private String title;
    private String body;
    private String targetToken;

}
