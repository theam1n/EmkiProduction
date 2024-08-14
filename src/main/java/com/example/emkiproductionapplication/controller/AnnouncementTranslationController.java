package com.example.emkiproductionapplication.controller;

import com.example.emkiproductionapplication.dto.AnnouncementTranslationDto;
import com.example.emkiproductionapplication.model.Announcement;
import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import com.example.emkiproductionapplication.repository.AnnouncementTranslationRepository;
import com.example.emkiproductionapplication.service.AnnouncementTranslationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announcement-translations")
@RequiredArgsConstructor
public class AnnouncementTranslationController {

    private final AnnouncementTranslationRepository announcementTranslationRepository;
    private final AnnouncementTranslationService announcementTranslationService;

    @PostMapping("/save")
    public void saveTranslations(@RequestBody List<AnnouncementTranslation> translations) {
        announcementTranslationRepository.saveAll(translations);
    }

    @GetMapping
    public List<AnnouncementTranslationDto> getAll() {
        return announcementTranslationService.getAll();
    }

    @GetMapping("/{languageId}")
    public List<AnnouncementTranslationDto> getAll(
            @PathVariable Long languageId
    ) {
        return announcementTranslationService.getAll();
    }
}