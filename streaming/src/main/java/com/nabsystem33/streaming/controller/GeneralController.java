package com.nabsystem33.streaming.controller;

import com.nabsystem33.streaming.entity.GeneralEntity;
import com.nabsystem33.streaming.service.GeneralService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/vistas")
public class GeneralController {

    private final GeneralService generalService;

    public GeneralController(GeneralService generalService) {
        this.generalService = generalService;
    }

    @GetMapping("/general")
    public List<GeneralEntity> getGeneralData() {
        return generalService.getGeneralData();
    }
}