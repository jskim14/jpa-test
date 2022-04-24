package com.example.sample.service;

import com.example.sample.model.entity.Sanha;
import com.example.sample.repository.SanhaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SanhaService {

    private final SanhaRepository repository;

    public Object select() {
        Iterable<Sanha> sanhas = repository.findAll();
        return sanhas;
    }
}
