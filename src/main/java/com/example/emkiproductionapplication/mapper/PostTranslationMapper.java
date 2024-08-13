package com.example.emkiproductionapplication.mapper;

import com.example.emkiproductionapplication.dto.PostTranslationDto;
import com.example.emkiproductionapplication.model.PostTranslation;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PostTranslationMapper {

    PostTranslationDto entityToDto(PostTranslation postTranslation);
}
