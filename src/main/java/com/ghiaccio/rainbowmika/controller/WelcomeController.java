package com.ghiaccio.rainbowmika.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class WelcomeController {

    @GetMapping("/criticalart")
    public String CriticalArt() {
        return "Peach Assault - Deadly Peach!!!!";
    }
}
