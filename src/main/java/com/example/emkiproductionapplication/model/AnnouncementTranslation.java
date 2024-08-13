package com.example.emkiproductionapplication.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class AnnouncementTranslation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String ticketLink;

    private String artistName;

    private String place;

    private String imageTitle;

    private byte[] imageFile;

    private String imageSrc;

    private String description;

    @ManyToOne
    @JoinColumn(name = "announcement_id", nullable = false)
    private Announcement announcement;

    private Long languageId;

    private LocalDateTime created;

    private LocalDateTime lastModified;
}
