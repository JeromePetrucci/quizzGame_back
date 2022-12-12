package com.quizzGame.quizzGame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzGame.quizzGame.model.AnswerModel;
import com.quizzGame.quizzGame.repository.AnswerRepo;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepo aRepo;

    public void addAnswer( AnswerModel newAnswer){
        AnswerModel createAnswer= aRepo.save(newAnswer);
        System.out.println("Answer saved "+ createAnswer.getAnswer());
    }

    public Iterable<AnswerModel> getStat(){
        Iterable<AnswerModel> listAnswer = aRepo.findAll();
        return listAnswer;
    }
    
}
