package com.telco.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.telco.databasedemo.PersonJdbcDao;


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
	}
}
