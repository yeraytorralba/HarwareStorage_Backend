package com.testCourse.StorageHarwareBackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;
import com.testCourse.StorageHarwareBackend.Service.ComponentService;

@Controller
@RequestMapping("/")
public class IndexController {
	private String[] almacenStatico = {"grafica","procesador","ssd","placa base","refrigeracion"};
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String[]>  getIndexPage() {
		
		return ResponseEntity.ok(almacenStatico);
	}
	
	
	
}
