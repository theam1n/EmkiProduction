package com.example.emkiproductionapplication.dto;

import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import jakarta.persistence.CascadeType;
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
public class AnnouncementDto {

    private Long id;

    private Double minPrice;

    private Double maxPrice;

    private LocalDateTime date;

    private String hours;

    private List<AnnouncementTranslationDto> translations;

    private LocalDateTime created;

    private LocalDateTime lastModified;
}
