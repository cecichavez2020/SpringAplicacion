package com.example.demo.repo.springaplicacionweb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface springaplicacionweb extends JpaRepository<springaplicacionweb,Integer> {

<S> S save(springaplicacionweb t);

}

