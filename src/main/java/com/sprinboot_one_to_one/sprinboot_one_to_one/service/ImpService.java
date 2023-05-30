package com.sprinboot_one_to_one.sprinboot_one_to_one.service;

import com.sprinboot_one_to_one.sprinboot_one_to_one.entity.Question;
import com.sprinboot_one_to_one.sprinboot_one_to_one.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImpService implements IService{
    @Autowired
     MyRepository repo ;

    @Override
    public void addQuestion(Question question) {
        repo.save(question);
    }

    @Override
    public Question showQuestion(Long qId) {
        Optional<Question> optional= repo.findById(qId);
        return optional.get();
    }
}
