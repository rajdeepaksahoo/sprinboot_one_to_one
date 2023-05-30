package com.sprinboot_one_to_one.sprinboot_one_to_one.service;

import com.sprinboot_one_to_one.sprinboot_one_to_one.entity.Question;

public interface IService {
    public void addQuestion(Question question);
    public Question showQuestion(Long qId);
}
