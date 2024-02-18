package com.example.cafe.service.impl;

import com.example.cafe.dto.CafeDto;
import com.example.cafe.mapper.CafeMapper;
import com.example.cafe.model.Cafe;
import com.example.cafe.repository.CafeRepository;
import com.example.cafe.service.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements CafeService {
    private final CafeRepository cafeRepository;
    private final CafeMapper cafeMapper;

    @Override
    public CafeDto findById(Long id) {
        Optional<Cafe> cafe = cafeRepository.findById(id);
        return cafeMapper.toDto(cafe.orElseThrow());
    }

    @Override
    public String saveCafe(Long id) {
        Optional<Cafe> cafe = cafeRepository.findById(id);
        CafeDto cafeDto = cafeMapper.toDto(cafe.orElseThrow());
        cafeRepository.save(cafeDto);
        return null;
    }

    @Override
    public String deleteCafe(Long id) {
        Optional<Cafe> cafe = cafeRepository.findById(id);
        CafeDto cafeDto = cafeMapper.toDto(cafe.orElseThrow());
        cafeRepository.delete(cafeDto);
        return null;
    }
}
