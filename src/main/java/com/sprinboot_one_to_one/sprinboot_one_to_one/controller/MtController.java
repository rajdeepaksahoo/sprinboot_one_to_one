package com.sprinboot_one_to_one.sprinboot_one_to_one.controller;

import com.sprinboot_one_to_one.sprinboot_one_to_one.entity.Question;
import com.sprinboot_one_to_one.sprinboot_one_to_one.service.IService;
import com.sprinboot_one_to_one.sprinboot_one_to_one.service.ImpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtController {
    @Autowired
    IService service;
    @PostMapping(path = "/add")
    public ResponseEntity<String> add(@RequestBody Question question){
        service.addQuestion(question);
        return ResponseEntity.ok(question.getQId()+" Added");
    }
    @GetMapping(path = "/show/{qId}")
    public ResponseEntity<Question> show(@PathVariable Long qId){
        return ResponseEntity.ok(service.showQuestion(qId));
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Question>> showAll(){
        return ResponseEntity.ok(service.showAll());
    }
}
