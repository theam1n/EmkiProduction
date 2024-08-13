package com.example.emkiproductionapplication.controller;

import com.example.emkiproductionapplication.dto.AnnouncementDto;
import com.example.emkiproductionapplication.model.Announcement;
import com.example.emkiproductionapplication.model.MainModelWithPage;
import com.example.emkiproductionapplication.repository.AnnouncementRepository;
import com.example.emkiproductionapplication.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/announcement")
@RequiredArgsConstructor
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @GetMapping
    public List<AnnouncementDto> getAll() {
        return announcementService.getAll();
    }
}
