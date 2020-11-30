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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;
import com.testCourse.StorageHarwareBackend.Service.ComponentService; 

@RestController
@RequestMapping("/component")
public class ComponentController {

	@Autowired
	private ComponentService componentService;
	
	 Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public ResponseEntity<List<ComponentEntity>> componentGetAll() { 
		
		logger.info("Get All Component");
		
		return ResponseEntity.ok(this.componentService.findAll());

	} 
	@GetMapping(path = "{id}")
	public ResponseEntity<ComponentEntity> componentGetOne(@PathVariable(name= "id") int id) {
		
		logger.info("Get Component for id :"+id);
		
		return ResponseEntity.ok(this.componentService.findOne(id));

	} 
	@PostMapping()
	public  ResponseEntity<ComponentEntity> add( @RequestBody ComponentEntity component) {
		 	
		ComponentEntity newComponent=null;
		
		logger.info("Create: " +component); 
		try {
			newComponent=this.componentService.add(component);
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
			 this.componentService.deleteByID(id);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}

		if(this.componentService.existsById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(id, HttpStatus.OK);
    }
	@DeleteMapping
    public ResponseEntity<Integer> deletePostEntity( @RequestBody ComponentEntity component) {
  
		logger.info("Delete: " + component); 
		try {
			 this.componentService.delete(component);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}

		if(this.componentService.existsById(component.getId())) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(component.getId(), HttpStatus.OK);
    }
	/*
	@GetMapping(path = "facturacion/facturas/{factura}/pasajeros")
	public ResponseEntity<Page<Passengers>> testPaginadoContentGet(@PathVariable(name= "factura") String factura) {
		int elementMax=this.passengersRepositorio.findAll().size();
		mapPassenger = new HashMap<Integer , Passengers> ();
		/*int i=0;
		for (Passengers passenger : this.servicioImpl.consultaPaginada(new PageRequest(0, elementMax)).getContent() ) {
			mapPassenger.put(i++, passenger);  
		}
		 System.err.println("lis" + mapPassenger);*/
		 
		//return ResponseEntity.ok(this.servicioImpl.consultaPaginada(new PageRequest(0, elementMax)));

	//}

}
