package com.sprinboot_one_to_one.sprinboot_one_to_one.service;

import com.sprinboot_one_to_one.sprinboot_one_to_one.entity.Question;

import java.util.List;

public interface IService {
    public void addQuestion(Question question);
    public Question showQuestion(Long qId);
    public List<Question> showAll();
}
