package com.testCourse.StorageHarwareBackend.Controllers;
 
import java.util.List;
 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.testCourse.StorageHarwareBackend.Entity.TypeComponentEntity; 
import com.testCourse.StorageHarwareBackend.Service.TypeComponentService; 

@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeComponentService typeComponentService;
	
	 Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public ResponseEntity<List<TypeComponentEntity>> componentGetAll() { 
		
		logger.info("Get All Component");
		
		return ResponseEntity.ok(this.typeComponentService.findAll());

	} 
	@GetMapping(path = "{id}")
	public ResponseEntity<TypeComponentEntity> componentGetOne(@PathVariable(name= "id") int id) {
		
		logger.info("Get Component for id :"+id);
		
		return ResponseEntity.ok(this.typeComponentService.findOne(id));

	} 
	@GetMapping(path = "/static/{id}")
	public ResponseEntity<String> componentStaticGetOne(@PathVariable(name= "id") int id) {
		
		logger.info("Get Component for id :"+id);
		
		return ResponseEntity.ok(this.typeComponentService.findOneStatic(id));

	} 
	@GetMapping(path = "/static")
	public ResponseEntity<String[]> componentGetOne() {
		
		logger.info("Get Component for static");
		
		return ResponseEntity.ok(this.typeComponentService.findAllStatic());

	} 
	
	@PostMapping()
	public  ResponseEntity<TypeComponentEntity> add( @RequestBody TypeComponentEntity component) {
		 	
		TypeComponentEntity newComponent=null;
		
		logger.info("Create: " +component); 
		try {
			newComponent=this.typeComponentService.add(component);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}
		return ResponseEntity.ok(newComponent);
	}
	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Integer> deletePost(@PathVariable int id) {
  
		logger.info("Delete: " + id); 
		try {
			 this.typeComponentService.deleteByID(id);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}

		if(this.typeComponentService.existsById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(id, HttpStatus.OK);
    }
	@DeleteMapping
    public ResponseEntity<Integer> deletePostEntity( @RequestBody TypeComponentEntity component) {
  
		logger.info("Delete: " + component); 
		try {
			 this.typeComponentService.delete(component);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}

		if(this.typeComponentService.existsById(component.getId())) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(component.getId(), HttpStatus.OK);
    } 

}
