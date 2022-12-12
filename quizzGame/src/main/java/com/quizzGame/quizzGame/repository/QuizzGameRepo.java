package com.quizzGame.quizzGame.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quizzGame.quizzGame.model.QuestionModel;

@Repository
public interface QuizzGameRepo extends CrudRepository<QuestionModel , Long> {
    public Optional<QuestionModel> findByQuestion( String question);
}
