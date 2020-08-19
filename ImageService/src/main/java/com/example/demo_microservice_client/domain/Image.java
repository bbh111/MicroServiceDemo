package com.example.demo_microservice_client.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Image {
    private Long id;
    private String title;
    private String url;
}
