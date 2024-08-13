package com.example.emkiproductionapplication.service;

import com.example.emkiproductionapplication.dto.MainModelWithPageDto;
import com.example.emkiproductionapplication.mapper.MainModelWithPageMapper;
import com.example.emkiproductionapplication.model.MainModelWithPage;
import com.example.emkiproductionapplication.repository.MainModelWithPageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MainModelWithPageService {

    private final MainModelWithPageRepository mainModelWithPageRepository;
    private final MainModelWithPageMapper mainModelWithPageMapper;

    public List<MainModelWithPageDto> getAll() {
        var models = mainModelWithPageRepository.findAll();
        return models.stream()
                .map((at)-> mainModelWithPageMapper.entityToDto(at))
                .collect(Collectors.toList());
    }
}
