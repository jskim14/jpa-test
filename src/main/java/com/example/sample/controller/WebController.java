package com.example.sample.controller;

import com.example.sample.service.SanhaService;
import com.example.sample.service.YanoljaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class WebController {

    private final YanoljaService yanoljaService;
    private final SanhaService sanhaService;

    @GetMapping("/select/{id}")
    public Object select (@PathVariable(name = "id") String id) {
        Object list=null;
        if(id.equals("yanolja")) {
            list = yanoljaService.select();
            System.out.println("yanolja선택");
        } else if(id.equals("sanha")) {
            list = sanhaService.select();
        } else {
            String.valueOf(list);
            list = "주소를 확인하세요";
        }
        return list;
    }
}
