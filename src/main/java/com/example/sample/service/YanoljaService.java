package com.example.sample.service;

import com.example.sample.model.entity.Yanolja;
import com.example.sample.repository.SanhaRepository;
import com.example.sample.repository.YanoljaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YanoljaService {

    private final YanoljaRepository yanoljaRepository;

    public Object select() {
        Iterable<Yanolja> yanoljas = yanoljaRepository.findAll();
        return yanoljas;
    }
}
