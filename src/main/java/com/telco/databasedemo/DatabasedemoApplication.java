package com.telco.databasedemo;

import com.telco.databsedemo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@SpringBootApplication
public class DatabasedemoApplication implements CommandLineRunner {
 private Logger logger= LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;
	public static void main(String[] args) {
		SpringApplication.run(DatabasedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" voila", dao.findAll());
        logger.info(" voila les details de la person 1", dao.findById(1));
        logger.info(" Suppression  de la person 4", dao.findById(4));
        logger.info(" Insertion  de la person 4", dao.insert(new Person(8, "Koffi","Bouaflé", new Date())));
        logger.info(" Update  de la person 4", dao.update(new Person(3, "Ouattara","Abidjan", new Date())));
	}
}
