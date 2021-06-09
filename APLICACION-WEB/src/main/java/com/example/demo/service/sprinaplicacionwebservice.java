package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.springaplicacionweb.springaplicacionweb;

@Service 
public class sprinaplicacionwebservice {

	@Autowired
	private springaplicacionweb repo;
	
	public void registrar(springaplicacionweb t) {
		/*repo.save(t);
	}*/
}
