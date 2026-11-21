package com.devsuperior.integrations.resources;

import com.devsuperior.integrations.dto.EmailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/emails")
public class EmailResource {

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto){
        return ResponseEntity.noContent().build();
    }
}
