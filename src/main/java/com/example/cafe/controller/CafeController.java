package com.example.cafe.controller;

import com.example.cafe.dto.CafeDto;
import com.example.cafe.service.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CafeController {
    private final CafeService cafeService;
    @GetMapping("/")
    CafeDto findById(@RequestParam Long id) {
        return cafeService.findById(id);
    }
}
