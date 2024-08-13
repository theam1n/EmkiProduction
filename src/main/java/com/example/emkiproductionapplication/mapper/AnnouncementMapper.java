package com.example.emkiproductionapplication.mapper;

import com.example.emkiproductionapplication.dto.AnnouncementDto;
import com.example.emkiproductionapplication.model.Announcement;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AnnouncementMapper {


    AnnouncementDto entityToDto(Announcement announcement);
}
