package com.example.sample.service;

import com.example.sample.model.entity.Sanha;
import com.example.sample.repository.SanhaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SanhaService {

    private final SanhaRepository repository;

    public Object select() {
        Iterable<Sanha> sanhas = repository.findAll();
        return sanhas;
    }

    public Object insert(Sanha s) {
        Sanha sanha = repository.save(s);
        return sanha;
    }

    public Sanha update(Long param, Sanha sanha) {
//        Iterable<Sanha> sanhas = repository.findAllById(Collections.singleton(param));
//        System.out.println("sanhas = " + sanhas);
        Optional<Sanha> sanhaOptional = repository.findById(param);
//        System.out.println("sanhaOptional = " + sanhaOptional);
        Sanha updateSanha = null;
        if(sanhaOptional.isPresent()) {
            sanhaOptional.get().setEmpCnt(sanha.getEmpCnt());
            sanhaOptional.get().setLocation(sanha.getLocation());
            updateSanha = repository.save(sanha);
        }
        return updateSanha;
    }
}
