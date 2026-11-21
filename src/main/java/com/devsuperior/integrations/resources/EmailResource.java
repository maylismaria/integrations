package com.devsuperior.integrations.resources;

import com.devsuperior.integrations.dto.EmailDTO;
import com.devsuperior.integrations.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/emails")
public class EmailResource {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto){
        emailService.sendEmail(dto);
        return ResponseEntity.noContent().build();
    }
}
