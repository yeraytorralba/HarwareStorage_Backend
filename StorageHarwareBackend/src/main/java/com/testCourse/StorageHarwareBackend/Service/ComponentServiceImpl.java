package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;
import com.testCourse.StorageHarwareBackend.Repository.ComponentRepository;

@Service
public class ComponentServiceImpl implements ComponentService {

	@Autowired
	private ComponentRepository componentRepository;
	
	@Override
	public List<ComponentEntity> findAll() { 
		return (List<ComponentEntity>) this.componentRepository.findAll();
	}

	@Override
	public ComponentEntity findOne(Integer id) { 
		return this.componentRepository.findById(id).get();
	}

	@Override
	public ComponentEntity add(ComponentEntity newComponent) {	 
		return this.componentRepository.save(newComponent);
	}

	@Override
	public void delete(ComponentEntity newComponent) {
		
		this.componentRepository.delete(newComponent);
	}

	@Override
	public void deleteByID(int id) {
		this.componentRepository.deleteById(id);
		
	}

	@Override
	public boolean existsById(int id) { 
		return this.componentRepository.existsById(id);
	}

	 

	 

}
