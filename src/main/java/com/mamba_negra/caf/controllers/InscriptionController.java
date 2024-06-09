package com.mamba_negra.caf.controllers;

import java.util.Collections;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/self-management")
public class InscriptionController {

    @PostMapping("/inscription")
    public Map<String, String> createInscription(@RequestBody String email ) {
        String detail = String.format("successfully created inscription for %s", email);
        return Collections.singletonMap("msg", detail);
    }
}
