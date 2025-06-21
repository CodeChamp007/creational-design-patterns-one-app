package com.example.productCustomizer.controller;

import com.example.productCustomizer.config.AppConfig;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config")
public class ConfigController {

    private final AppConfig appConfig = AppConfig.getInstance();

    @GetMapping
    public String getCurrentConfig() {
        return "Currency: "+ appConfig.getCurreny() + ", Environment: " + appConfig.getEnvironment();
    }

    @PostMapping
    public String updateConfig(@RequestParam String currency, @RequestParam String environment) {
        appConfig.setCurreny(currency);
        appConfig.setEnvironment(environment);
        return "Updated Config";
    }
}
