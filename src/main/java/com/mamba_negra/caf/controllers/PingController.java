package com.mamba_negra.caf.controllers;

import java.util.Collections;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "ping")
public class PingController {

    @GetMapping
    public Map<String, String> welcome() {
        return Collections.singletonMap("msg", "Pong");
    }
}
