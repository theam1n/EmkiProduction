package com.example.emkiproductionapplication.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AboutDto {

    private Long id;

    private String title;

    private String content;

    private String imageTitle;

    private byte[] imageFile;

    private String imageSrc;

    private Long languageId;

    private LocalDateTime created;

    private LocalDateTime lastModified;
}
