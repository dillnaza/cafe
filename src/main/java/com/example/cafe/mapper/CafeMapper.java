package com.example.cafe.mapper;

import com.example.cafe.dto.CafeDto;
import com.example.cafe.model.Cafe;
import org.mapstruct.Mapper;

@Mapper
public interface CafeMapper{
    Cafe toEntity(CafeDto cafeDto);
    CafeDto toDto(Cafe cafe);
}
