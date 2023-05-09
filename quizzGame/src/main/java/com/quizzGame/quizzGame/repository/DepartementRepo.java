package com.quizzGame.quizzGame.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quizzGame.quizzGame.model.DepartementModel;

@Repository
public interface DepartementRepo extends CrudRepository<DepartementModel , Long> {
    public Optional<DepartementModel> findByNumber( String number);
    
}
