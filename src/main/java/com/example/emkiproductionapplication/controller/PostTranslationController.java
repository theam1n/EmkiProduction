package com.example.emkiproductionapplication.controller;

import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import com.example.emkiproductionapplication.model.PostTranslation;
import com.example.emkiproductionapplication.repository.PostTranslationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post-translations")
@RequiredArgsConstructor
public class PostTranslationController {

    private final PostTranslationRepository postTranslationRepository;

    @PostMapping("/save")
    public void saveTranslations(@RequestBody List<PostTranslation> translations) {
        postTranslationRepository.saveAll(translations);
    }
}
