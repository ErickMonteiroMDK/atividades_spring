package com.senac.atividade.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthCheckController {

    @GetMapping("/health")
    public String healthCheck(){
        return "OK";
    }
}
