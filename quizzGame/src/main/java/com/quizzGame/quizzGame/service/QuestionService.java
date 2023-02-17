package com.quizzGame.quizzGame.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzGame.quizzGame.model.CapitalModel;
import com.quizzGame.quizzGame.model.QuestionDTO;
import com.quizzGame.quizzGame.model.QuestionModel;
import com.quizzGame.quizzGame.repository.CapitalRepo;
import com.quizzGame.quizzGame.repository.QuizzGameRepo;


@Service
public class QuestionService {

    @Autowired
    private QuizzGameRepo qRepo;

    @Autowired
    private CapitalRepo cRepo;


    public void hello (){
        System.out.println("hello world!");
    }

    public void getQuestionNumber(){
        long lines = qRepo.count();
        System.out.println(lines);
    }

    public QuestionModel getQuestion(String question ){
        System.out.println(question);
        Optional<QuestionModel> quest = qRepo.findByQuestion(question);
        if (quest.isPresent()){
            //System.out.println(quest.get().getQuestion());
            return quest.get();
        }
        else {
            return null;
        }
    }

    public void addQuestion( QuestionDTO question){
        QuestionModel newQuestion = new QuestionModel(question);
        if (getQuestion(newQuestion.getQuestion()) == null) {
            QuestionModel createQuestion= qRepo.save(newQuestion);
            System.out.println("Question saved "+ createQuestion.getQuestion());
        }
        else {System.out.println("Question already saved");}
        
    }


    public Iterable<CapitalModel> getCapitals(){
        Iterable<CapitalModel> listAnswer = cRepo .findAll();
        return listAnswer;
    }
    
}
