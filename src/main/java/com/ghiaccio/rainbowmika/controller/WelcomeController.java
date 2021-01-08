package com.ghiaccio.rainbowmika.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class WelcomeController {

    public static String version_1 = "0.0.1 - Peach Assault - Deadly Peach!!!!";
    public static String version_2 = "0.0.2 - Nadeshiko!!!! Mika!!!!";

    @GetMapping("/moves")
    public String MoveSets() {
        return version_1+"\r\n"+version_2;
    }
}
