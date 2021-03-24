package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;
  
import com.testCourse.StorageHarwareBackend.Entity.TypeComponentEntity;

public interface TypeComponentService {
	
	public List<TypeComponentEntity> findAll(); 
	public TypeComponentEntity findOne(Integer id);
	public TypeComponentEntity add(TypeComponentEntity newComponent);
	public void deleteByID(int id);
	
	public String findOneStatic(Integer id);
	public String[] findAllStatic();
	
	public void delete(TypeComponentEntity newComponent);
	
	public boolean existsById(int id);
	

}
