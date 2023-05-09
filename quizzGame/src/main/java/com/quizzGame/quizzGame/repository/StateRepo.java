package com.quizzGame.quizzGame.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quizzGame.quizzGame.model.UsStateModel;

@Repository
public interface StateRepo extends CrudRepository<UsStateModel , Long> {
    public Optional<UsStateModel> findByCode( String code);
    
}
