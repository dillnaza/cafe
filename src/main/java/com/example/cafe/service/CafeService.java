package com.example.cafe.service;

import com.example.cafe.dto.CafeDto;

public interface CafeService {
    CafeDto findById(Long id);
    String saveCafe(Long id);
    String deleteCafe(Long id);
}
