package com.bancopan.project.controller;

import com.bancopan.project.model.MaintenanceModel;
import com.bancopan.project.repository.MaintenanceRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MaintenanceController {

    //injeta a dependência
    @Autowired
    private MaintenanceRepository repository;

    @GetMapping("/get")
    public List<MaintenanceModel> getAll(){
        return repository.findAll();
    }

    @PostMapping("/inserir")
    public ResponseEntity<MaintenanceModel> create(@RequestBody MaintenanceModel model) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(model));
    }
}
