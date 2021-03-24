package com.testCourse.StorageHarwareBackend.Service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.testCourse.StorageHarwareBackend.Entity.MakerComponentEntity; 
import com.testCourse.StorageHarwareBackend.Repository.ComponentRepositoryStatic;
import com.testCourse.StorageHarwareBackend.Repository.MakerComponentRepository;

@Service
public class MakerComponentServiceImpl implements MakerComponentService {

	@Autowired
	private MakerComponentRepository makerComponentRepository;
	
	@Autowired
	private ComponentRepositoryStatic componentRepositoryStatic;
	
	
	@Override
	public List<MakerComponentEntity> findAll() { 
		return (List<MakerComponentEntity>) this.makerComponentRepository.findAll();
	}

	@Override
	public MakerComponentEntity findOne(Integer id) { 
		return this.makerComponentRepository.findById(id).get();
	}

	@Override
	public MakerComponentEntity add(MakerComponentEntity newComponent) {	 
		return this.makerComponentRepository.save(newComponent);
	}

	@Override
	public void delete(MakerComponentEntity newComponent) {
		
		this.makerComponentRepository.delete(newComponent);
	}

	@Override
	public void deleteByID(int id) {
		this.makerComponentRepository.deleteById(id);
		
	}

	@Override
	public boolean existsById(int id) { 
		return this.makerComponentRepository.existsById(id);
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
