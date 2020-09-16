package br.com.tecnisys.deploylab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Endpoint {

    @Value("${nome}")
    private String nome;

    @GetMapping
    public String hello(){
        return "Hello, "+nome;
    }
}
