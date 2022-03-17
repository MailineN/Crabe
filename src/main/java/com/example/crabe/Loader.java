package com.example.crabe;

import com.example.crabe.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Loader {
    private static final Logger log = LoggerFactory.getLogger(Loader.class);

    @Bean
    CommandLineRunner initDatabase(PersonRepository repository) {
        return args -> {
            log.info("PRELOADING : DONE" );
        };
    }
}
