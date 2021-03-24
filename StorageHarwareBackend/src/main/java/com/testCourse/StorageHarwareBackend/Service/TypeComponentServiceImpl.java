package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
import com.testCourse.StorageHarwareBackend.Entity.TypeComponentEntity;
import com.testCourse.StorageHarwareBackend.Repository.ComponentRepositoryStatic; 
import com.testCourse.StorageHarwareBackend.Repository.TypeComponentRepository;

@Service
public class TypeComponentServiceImpl implements TypeComponentService {

	@Autowired
	private TypeComponentRepository typeComponentRepository;
	
	@Autowired
	private ComponentRepositoryStatic componentRepositoryStatic;
	
	
	@Override
	public List<TypeComponentEntity> findAll() { 
		return (List<TypeComponentEntity>) this.typeComponentRepository.findAll();
	}

	@Override
	public TypeComponentEntity findOne(Integer id) { 
		return this.typeComponentRepository.findById(id).get();
	}

	@Override
	public TypeComponentEntity add(TypeComponentEntity newComponent) {	 
		return this.typeComponentRepository.save(newComponent);
	}

	@Override
	public void delete(TypeComponentEntity newComponent) {
		
		this.typeComponentRepository.delete(newComponent);
	}

	@Override
	public void deleteByID(int id) {
		this.typeComponentRepository.deleteById(id);
		
	}

	@Override
	public boolean existsById(int id) { 
		return this.typeComponentRepository.existsById(id);
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
