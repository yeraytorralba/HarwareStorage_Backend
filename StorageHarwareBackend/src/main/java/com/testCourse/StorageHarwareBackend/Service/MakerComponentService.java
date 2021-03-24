package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;
 
import com.testCourse.StorageHarwareBackend.Entity.MakerComponentEntity;

public interface MakerComponentService {
	
	public List<MakerComponentEntity> findAll(); 
	public MakerComponentEntity findOne(Integer id);
	public MakerComponentEntity add(MakerComponentEntity newComponent);
	public void deleteByID(int id);
	
	public String findOneStatic(Integer id);
	public String[] findAllStatic();
	
	public void delete(MakerComponentEntity newComponent);
	
	public boolean existsById(int id);
	

}
