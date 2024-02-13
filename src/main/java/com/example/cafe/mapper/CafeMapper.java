package com.example.cafe.mapper;

import com.example.cafe.dto.CafeDto;
import com.example.cafe.model.Cafe;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CafeMapper{
    Cafe toEntity(CafeDto cafeDto);
    CafeDto toDto(Cafe cafe);
}
