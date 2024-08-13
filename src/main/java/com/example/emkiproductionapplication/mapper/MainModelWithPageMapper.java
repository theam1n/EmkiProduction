package com.example.emkiproductionapplication.mapper;

import com.example.emkiproductionapplication.dto.MainModelWithPageDto;
import com.example.emkiproductionapplication.model.MainModelWithPage;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MainModelWithPageMapper {

    MainModelWithPageDto entityToDto(MainModelWithPage mainModelWithPage);
}
