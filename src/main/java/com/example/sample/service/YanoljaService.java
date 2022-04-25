package com.example.sample.service;

import com.example.sample.model.entity.Sanha;
import com.example.sample.model.entity.Yanolja;
import com.example.sample.repository.SanhaRepository;
import com.example.sample.repository.YanoljaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class YanoljaService {

    private final YanoljaRepository yanoljaRepository;

    public Object select() {
        Iterable<Yanolja> yanoljas = yanoljaRepository.findAll();
        return yanoljas;
    }

    public Yanolja insert(Yanolja y) {
        Yanolja yanolja = yanoljaRepository.save(y);
        return yanolja;
    }

    public Yanolja update(Long param, Yanolja yanolja) {
        Optional<Yanolja> yanoljaOptional = yanoljaRepository.findById(param);
        Yanolja updateYanolja = null;
        if(yanoljaOptional.isPresent()) {
            yanoljaOptional.get().setEmpCnt(yanolja.getEmpCnt());
            yanoljaOptional.get().setLocation(yanolja.getLocation());
            updateYanolja = yanoljaRepository.save(yanolja);
        }
        return updateYanolja;
    }
}
