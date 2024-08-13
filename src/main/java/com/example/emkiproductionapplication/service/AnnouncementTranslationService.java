package com.example.emkiproductionapplication.service;

import com.example.emkiproductionapplication.dto.AnnouncementTranslationDto;
import com.example.emkiproductionapplication.mapper.AnnouncementTranslationMapper;
import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import com.example.emkiproductionapplication.repository.AnnouncementTranslationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AnnouncementTranslationService {

    private final AnnouncementTranslationRepository announcementTranslationRepository;
    private final AnnouncementTranslationMapper announcementTranslationMapper;


    public List<AnnouncementTranslationDto> getAll() {
        var ats = announcementTranslationRepository.findAll();
        return ats.stream()
                .map((at)-> announcementTranslationMapper.entityToDto(at))
                .collect(Collectors.toList());
    }
}
