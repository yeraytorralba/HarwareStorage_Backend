package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;

public interface ComponentService {
	
	public List<ComponentEntity> findAll(); 
	public ComponentEntity findOne(Integer id);
	public ComponentEntity add(ComponentEntity newComponent);
	public void deleteByID(int id);
	
	public String findOneStatic(Integer id);
	public String[] findAllStatic();
	
	public void delete(ComponentEntity newComponent);
	
	public boolean existsById(int id);
	

}
