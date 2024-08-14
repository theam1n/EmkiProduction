package com.example.emkiproductionapplication.repository;

import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnouncementTranslationRepository extends JpaRepository<AnnouncementTranslation, Long> {
    List<AnnouncementTranslation> findAllByLanguageId(Long languageId);
}
