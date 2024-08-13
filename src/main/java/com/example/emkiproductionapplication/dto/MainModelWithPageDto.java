package com.example.emkiproductionapplication.dto;

import com.example.emkiproductionapplication.model.About;
import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import com.example.emkiproductionapplication.model.PostTranslation;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MainModelWithPageDto {

    private Long id;
    private String title;
    private String code;
    private List<AnnouncementTranslationDto> announcementTranslations;
    private List<PostTranslationDto> postTranslations;
    private List<AboutDto> abouts;
    private LocalDateTime created;
    private LocalDateTime lastModified;
}
