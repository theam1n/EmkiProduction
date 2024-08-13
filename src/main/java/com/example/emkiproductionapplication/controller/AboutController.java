package com.example.emkiproductionapplication.controller;

import com.example.emkiproductionapplication.model.About;
import com.example.emkiproductionapplication.model.PostTranslation;
import com.example.emkiproductionapplication.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/about")
@RequiredArgsConstructor
public class AboutController {

    private final AboutRepository aboutRepository;

    @PostMapping("/save")
    public void saveTranslations(@RequestBody List<About> abouts) {
        aboutRepository.saveAll(abouts);
    }
}
