package com.testCourse.StorageHarwareBackend.config;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;
import com.testCourse.StorageHarwareBackend.Entity.MakerComponentEntity;
import com.testCourse.StorageHarwareBackend.Repository.ComponentRepository;
import com.testCourse.StorageHarwareBackend.Repository.CoreComponentRepository;
import com.testCourse.StorageHarwareBackend.Repository.MakerComponentRepository;
import com.testCourse.StorageHarwareBackend.Repository.TypeComponentRepository;

@Configuration
public class DbRunInicialiced {

	@Autowired
	MakerComponentRepository makerComponentRepository;
	@Autowired
	CoreComponentRepository coreComponentRepository;
	@Autowired
	TypeComponentRepository typeComponentRepository;
	@Autowired
	ComponentRepository componentRepository;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		try {
			makerComponentRepository.deleteAll();
			coreComponentRepository.deleteAll();
			typeComponentRepository.deleteAll();
			componentRepository.deleteAll(); 

		} catch (Exception e) {
			logger.error("Error in Drop collections");
		}
		try
		//insert dataSet to initial bd
		{ 

			MakerComponentEntity m1 = new MakerComponentEntity(1, "Asus");
			MakerComponentEntity m2 = new MakerComponentEntity(2, "MSI");

			// drop all database first
			// this.productRepository.deleteAll();

			// save all the specified product
			List<MakerComponentEntity> product = Arrays.asList(m1, m2);
			this.makerComponentRepository.saveAll(product);
		} catch (Exception e) {
			System.err.println("Error with creating DB MONGO INICIALITION");
			System.err.println(e.getMessage());
			System.err.println("Cause");
			System.err.println(e.getCause());
		}
	}
}