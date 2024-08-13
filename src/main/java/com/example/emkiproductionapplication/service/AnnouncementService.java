package com.example.emkiproductionapplication.service;

import com.example.emkiproductionapplication.dto.AnnouncementDto;
import com.example.emkiproductionapplication.dto.AnnouncementTranslationDto;
import com.example.emkiproductionapplication.mapper.AnnouncementMapper;
import com.example.emkiproductionapplication.mapper.AnnouncementTranslationMapper;
import com.example.emkiproductionapplication.model.Announcement;
import com.example.emkiproductionapplication.repository.AnnouncementRepository;
import com.example.emkiproductionapplication.repository.AnnouncementTranslationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AnnouncementService {

    private final AnnouncementRepository announcementRepository;
    private final AnnouncementMapper announcementMapper;


    public List<AnnouncementDto> getAll() {
        var ats = announcementRepository.findAll();
        return ats.stream()
                .map((at)-> announcementMapper.entityToDto(at))
                .collect(Collectors.toList());
    }
}
