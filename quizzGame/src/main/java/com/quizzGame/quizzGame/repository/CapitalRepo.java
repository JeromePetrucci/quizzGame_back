package com.quizzGame.quizzGame.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quizzGame.quizzGame.model.CapitalModel;

@Repository
public interface CapitalRepo extends CrudRepository<CapitalModel , Long> {
    public Optional<CapitalModel> findById( Integer id);
    
}
