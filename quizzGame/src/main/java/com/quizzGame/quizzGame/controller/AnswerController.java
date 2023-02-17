package com.quizzGame.quizzGame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizzGame.quizzGame.model.AnswerModel;
import com.quizzGame.quizzGame.model.CapitalModel;
import com.quizzGame.quizzGame.model.QuestionDTO;
import com.quizzGame.quizzGame.service.AnswerService;
import com.quizzGame.quizzGame.service.QuestionService;

@RestController
public class AnswerController {

    @Autowired
    private QuestionService qService;

    @Autowired
    private AnswerService aService;

    @CrossOrigin(origins = "*")
    @GetMapping("/getStat")
    public Iterable<AnswerModel> getStat() {
        return aService.getStat();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/addQuestion")
    public void addQuestion(@RequestBody QuestionDTO question) {
        System.out.println(question.getId());
        qService.addQuestion(question);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/addAnswer")
    public Integer addAnswer(@RequestBody AnswerModel answer) {
        Integer isUnknown = aService.addAnswer(answer);
        System.out.println("return "+isUnknown);
        return isUnknown;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getCapitals")
    public Iterable<CapitalModel> getCapital() {
        return qService.getCapitals();
    }
    
}
