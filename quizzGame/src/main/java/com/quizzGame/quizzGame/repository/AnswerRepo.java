package com.quizzGame.quizzGame.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quizzGame.quizzGame.model.AnswerModel;

@Repository

public interface AnswerRepo extends CrudRepository<AnswerModel , Long> {
    public Optional<AnswerModel> findById( Long id);
    
}
