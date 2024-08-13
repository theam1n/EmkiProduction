package com.example.emkiproductionapplication.mapper;

import com.example.emkiproductionapplication.dto.AnnouncementTranslationDto;
import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AnnouncementTranslationMapper {

    @Mapping(target = "announcementId", source = "announcement.id")
    AnnouncementTranslationDto entityToDto(AnnouncementTranslation announcementTranslation);


}
