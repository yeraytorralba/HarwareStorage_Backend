package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;

import com.testCourse.StorageHarwareBackend.Entity.CoreComponentEntity; 

public interface CoreComponentService {
	
	public List<CoreComponentEntity> findAll(); 
	public CoreComponentEntity findOne(Integer id);
	public CoreComponentEntity add(CoreComponentEntity newComponent);
	public void deleteByID(int id);
	
	public String findOneStatic(Integer id);
	public String[] findAllStatic();
	
	public void delete(CoreComponentEntity newComponent);
	
	public boolean existsById(int id);
	

}
