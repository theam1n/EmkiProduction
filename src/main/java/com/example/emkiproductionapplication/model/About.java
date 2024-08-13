package com.example.emkiproductionapplication.model;

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
@Entity
@Table
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 65535)
    private String content;

    private String imageTitle;

    private byte[] imageFile;

    private String imageSrc;

    private Long languageId;

    private LocalDateTime created;

    private LocalDateTime lastModified;

    @ManyToOne
    @JoinColumn(name = "main_model_with_page_id")
    private MainModelWithPage mainModelWithPage;
}
