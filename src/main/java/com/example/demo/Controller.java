package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/codigo")
    public String codigoMorse(@RequestParam String codigo) {

        String normal = CodigoMorse.normal(codigo);
        return normal;

    }
}
