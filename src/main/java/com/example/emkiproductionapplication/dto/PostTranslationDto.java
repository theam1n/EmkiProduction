package com.example.emkiproductionapplication.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostTranslationDto {

    private Long id;

    private String title;

    private String content;

    private String imageTitle;

    private byte[] imageFile;

    private String imageSrc;

    private String post;

    private Long postId;

    private Long languageId;

    private LocalDateTime created;

    private LocalDateTime lastModified;
}
