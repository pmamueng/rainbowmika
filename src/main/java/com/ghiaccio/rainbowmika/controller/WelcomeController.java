package com.ghiaccio.rainbowmika.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class WelcomeController {

    public static String version_1 = "0.0.1 - Peach Assault - Deadly Peach!!!!";
    public static String version_2 = "0.0.2 - Nadeshiko!!!! Mika!!!!";
    public static String version_3 = "0.0.3 - You are cutting way too close there...";
    public static String version_4 = "0.0.4 - Rainbow Bomber!!!!";
    public static String version_5 = "0.0.5 - I\'ll kick your ass! All right! Let\'s begin";

    @GetMapping("/moves")
    public String MoveSets() {
        return version_1+"\r\n"
                +version_2+"\r\n"
                +version_3+"\r\n"
                +version_4+"\r\n"
                +version_5+"\r\n";
    }
}
