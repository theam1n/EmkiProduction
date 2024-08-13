package com.example.emkiproductionapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnnouncementTranslationDto {

    private Long id;

    private String title;

    private String ticketLink;

    private String artistName;

    private String place;

    private String imageTitle;

    private byte[] imageFile;

    private String imageSrc;

    private String description;

    private Long announcementId;

    private Long languageId;

    private LocalDateTime created;

    private LocalDateTime lastModified;
}
