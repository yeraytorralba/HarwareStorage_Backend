package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testCourse.StorageHarwareBackend.Entity.CoreComponentEntity; 
import com.testCourse.StorageHarwareBackend.Repository.ComponentRepositoryStatic;
import com.testCourse.StorageHarwareBackend.Repository.CoreComponentRepository; 

@Service
public class CoreComponentServiceImpl implements CoreComponentService {

	@Autowired
	private CoreComponentRepository coreComponentRepository;
	
	@Autowired
	private ComponentRepositoryStatic componentRepositoryStatic;
	
	
	@Override
	public List<CoreComponentEntity> findAll() { 
		return (List<CoreComponentEntity>) this.coreComponentRepository.findAll();
	}

	@Override
	public CoreComponentEntity findOne(Integer id) { 
		return this.coreComponentRepository.findById(id).get();
	}

	@Override
	public CoreComponentEntity add(CoreComponentEntity newComponent) {	 
		return this.coreComponentRepository.save(newComponent);
	}

	@Override
	public void delete(CoreComponentEntity newComponent) {
		
		this.coreComponentRepository.delete(newComponent);
	}

	@Override
	public void deleteByID(int id) {
		this.coreComponentRepository.deleteById(id);
		
	}

	@Override
	public boolean existsById(int id) { 
		return this.coreComponentRepository.existsById(id);
	}

	@Override
	public String findOneStatic(Integer id) {
		return this.componentRepositoryStatic.findOneStatic(id);
	}

	@Override
	public String[] findAllStatic() {
		return this.componentRepositoryStatic.findAllStatic();
	}

 

	 

	 

}
