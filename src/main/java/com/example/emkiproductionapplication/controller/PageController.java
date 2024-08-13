package com.example.emkiproductionapplication.controller;


import com.example.emkiproductionapplication.dto.MainModelWithPageDto;
import com.example.emkiproductionapplication.model.MainModelWithPage;
import com.example.emkiproductionapplication.repository.MainModelWithPageRepository;
import com.example.emkiproductionapplication.service.MainModelWithPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/page")
@RequiredArgsConstructor
public class PageController {

    private final MainModelWithPageService mainModelWithPageService;

    @GetMapping
    public List<MainModelWithPageDto> getAll() {
        return mainModelWithPageService.getAll();
    }




}
