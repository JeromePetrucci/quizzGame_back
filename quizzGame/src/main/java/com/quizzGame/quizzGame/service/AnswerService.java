package com.quizzGame.quizzGame.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzGame.quizzGame.model.AnswerModel;
import com.quizzGame.quizzGame.repository.AnswerRepo;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepo aRepo;

    public Integer addAnswer( AnswerModel newAnswer){
        Optional<AnswerModel> existAnswer = aRepo.findById(newAnswer.getId());
        System.out.println(existAnswer.isPresent());
        if (existAnswer.isPresent()){
            System.out.println("already exist");
            System.out.println(existAnswer.get().getId());
            System.out.println("asked "+existAnswer.get().getAsked());
            Integer asked = existAnswer.get().getAsked();
            existAnswer.get().setAsked(asked + 1);
            existAnswer.get().setAnswer(newAnswer.getAnswer());
            System.out.println("Now asked "+existAnswer.get().getAsked());
            AnswerModel createAnswer=aRepo.save(existAnswer.get());
            System.out.println("Saved with asked = "+createAnswer.getAsked()+ " and "+createAnswer.getAnswer());
            return asked;
        }
        else {
            AnswerModel createAnswer= aRepo.save(newAnswer);
            System.out.println("Answer saved "+ createAnswer.getAnswer());
            return 0;
        }
        
    }

    public Iterable<AnswerModel> getStat(){
        Iterable<AnswerModel> listAnswer = aRepo.findAll();
        return listAnswer;
    }

    
    
}
