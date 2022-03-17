package com.example.crabe.services;

import com.example.crabe.beans.Person;
import com.example.crabe.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonService {
    static final Logger LOGGER = LoggerFactory.getLogger(PersonService.class);
    @Autowired
    PersonRepository personRepository;
    public List<Person> sample(Long sampleSize){
        long len = personRepository.count();
        List<Person> liste = personRepository.findAll();
        List<Person> copy = new ArrayList<Person>(liste);
        Collections.shuffle(copy);
        LOGGER.info("Création d'un échantillon de taille {}", sampleSize);
        return sampleSize > copy.size() ? copy.subList(0, copy.size()) : copy.subList(0, Math.toIntExact(sampleSize));
    }
}
