package com.example.sample.controller;

import com.example.sample.model.entity.Sanha;
import com.example.sample.model.entity.Yanolja;
import com.example.sample.service.SanhaService;
import com.example.sample.service.YanoljaService;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

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
        } else if(id.equals("sanha")) {
            list = sanhaService.select();
        } else {
            String.valueOf(list);
            list = "주소를 확인하세요";
        }
        return list;
    }

    @PostMapping("/insert/{id}")
    public Object insert (@PathVariable(name = "id") String id,
                         // @RequestBody Yanolja yanolja,
                          @RequestBody Sanha sanha) {
        Object list = null;
        if(id.equals("yanolja")) {
           // list = yanoljaService.insert(yanolja);
        } else if(id.equals("sanha")) {
            list = sanhaService.insert(sanha);
        } else {
            String.valueOf(list);
            list = "주소를 확인하세요";
        }
        return list;
    }

    //put update
    @PutMapping("/update/{id}")
    public Sanha update(@PathVariable(name = "id") String id,
                         @RequestParam("param") Long param, Sanha sanha) {
        System.out.println("param = " + param);
        System.out.println("sanha = " + sanha);
        Sanha updateSanha = sanhaService.update(param, sanha);
        return updateSanha;
    }

    //delete

}
